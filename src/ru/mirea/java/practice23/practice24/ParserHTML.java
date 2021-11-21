package ru.mirea.java.practice23.practice24;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URL;

public class ParserHTML {
    private  final String URL = "http://www.mirea.ru";
    private  final String FOLDER = "src/ru/mirea/java/practice23/practice24/images";

    public ParserHTML() throws IOException{


        new File(FOLDER).mkdirs(); // папка, куда будут сохранены изображения
        Document document = Jsoup.connect(URL).get(); // get HTML
        Elements elements = document.select("img"); // all img in document


        String imgURL;


        for(Element img : elements){

            imgURL = img.attr("abs:src");
            if (!imgURL.equals("")){
                String imgName = imgURL.substring(imgURL.lastIndexOf("/")+1);
                System.out.println("image name: " + imgName);
                try {
                    URL url = new URL(imgURL);

                    InputStream in = url.openStream();
                    byte[] buffer = new byte[4096];
                    int n = -1;

                    OutputStream folderOUt = new FileOutputStream(FOLDER + "/" + imgName);

                    while ( (n= in.read(buffer))  != -1){ // сохранение в файл
                        folderOUt.write(buffer,0,n);
                    }
                    folderOUt.close();
                } catch (IOException e){
                }

            }

        }

    }

}
