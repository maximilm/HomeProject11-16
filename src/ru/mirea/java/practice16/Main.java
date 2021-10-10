package ru.mirea.java.practice16;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static StringBuilder getLine(String[] words){
        StringBuilder ret = new StringBuilder();
        if(words==null || words.length==0)
            return ret;
        ret.append(words[0]);
        for (int j = 0; j < words.length; j++) {

            for (int i = 1; i < words.length; i++) {
                if(words[i].length()==0)
                    continue;
                if(ret.toString().toLowerCase().charAt(0) == words[i].toLowerCase().charAt(words[i].length()-1)){
                    ret.insert(0, words[i] + " ");
                    words[i] = "";
                }
                else if(ret.toString().toLowerCase().charAt(ret.length()-1) == words[i].toLowerCase().charAt(0)){
                    ret.append(" " + words[i]);
                    words[i] = "";
                }
            }

        }
        return ret;
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        try (FileInputStream fileInput = new FileInputStream(in.nextLine())) {
            // C://Users//maxim//Desktop//Read.txt
            int i = -1;
            StringBuilder a = new StringBuilder();

            while ((i = fileInput.read()) != -1)
                a.append((char) i);

            String[] w = a.toString().split(" ");
            for (int k = 0; k < w.length; k++)
                System.out.println(w[k]);
            a = getLine(w);
            System.out.println(a.toString());
        } catch (IOException ex) {
            System.out.println("Не открылся файл");
        }

    }
}
