package ru.mirea.java.practice25.practice26;

import com.google.gson.*;

import org.json.JSONObject;
import org.json.JSONException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;

public class ParserMetro {
    private JsonObject listStatLine = new JsonObject();
    private JsonObject stations = new JsonObject();
    private JsonArray metroLines = new JsonArray();

    public ParserMetro() throws IOException, JSONException {
        Document document = null;
        try {
            document = Jsoup.connect("https://www.moscowmap.ru/metro.html#lines").timeout(10000).get();
        } catch (IOException e) {

        }

        addStations(document);

        addMetroLines(document);

        CreateJsonFile();

    }

    public void CreateJsonFile() {

        listStatLine.add("stations", stations);

        listStatLine.add("lines", metroLines);

        try {

            FileWriter writer = new FileWriter("src/ru/mirea/java/practice25/practice26/metro.json");
            writer.write(listStatLine.toString());
            writer.close();

        } catch (IOException e) {

        }
        for (String key : listStatLine.keySet()) {

            System.out.println(key);

            System.out.println(listStatLine.get(key).toString());

        }
    }

    public void addStations(Document document) {

        Elements metroStations = document.select("div.js-metro-stations");

        for (Element station : metroStations) {
            JsonArray stationsName = new JsonArray();
            for (Element metro_st : station.select("span.name"))
                stationsName.add(metro_st.text());

            stations.add(station.attr("data-line"), stationsName);
        }
    }

    public void addMetroLines(Document document) {

        Elements lines = document.select("span.js-metro-line");

        for (Element line : lines) {

            JsonObject lineM = new JsonObject();
            lineM.addProperty("name", line.text());
            lineM.addProperty("number", line.attr("data-line"));
            metroLines.add(lineM);
        }
    }
}

