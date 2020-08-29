package com.jovana;

import java.io.IOException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        String url = "https://gist.githubusercontent.com/provpup/2fc41686eab7400b796b/raw/b575bd01a58494dfddc1d6429ef0167e709abf9b/hamlet.txt";
        String body = Text.fetchText(url);

        String[]  words = Words.replaceAndSplit(body);
        HashMap<String, Integer> countWords = Words.mapWords(words);
        System.out.println("Different words count: " + countWords.size());

        char[] chars = body.toUpperCase().toCharArray();
        Letters letter = new Letters();
        HashMap<Character, Integer> countLetters = letter.mapLetters(chars);
        System.out.println(countLetters);
    }
}