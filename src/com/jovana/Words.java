package com.jovana;

import java.util.HashMap;

public class Words {

    public static HashMap<String, Integer> mapWords(String[] words) {
        HashMap<String, Integer> wMap = new HashMap<>();

        for(String word : words) {
            word = word.trim();
            if(wMap.containsKey(word)) {
                int oldValue = wMap.get(word);
                wMap.put(word, oldValue + 1);
            } else {
                wMap.put(word, 1);
            }
        }
        return wMap;
    }

    public static String[] replaceAndSplit(String body) {
        return body.replaceAll("[.*.,!?';&:\\[(.*?)\\][-].*]", "").split(" ");

    }
}
