package com.jovana;

import java.util.HashMap;

public class Letters {
    public HashMap<Character, Integer> mapLetters(char[] chars) {
        HashMap<Character, Integer> hMap = new HashMap<>();

        for(char c : chars) {
            if(Character.isAlphabetic(c)) {
                if(hMap.containsKey(c)) {
                    int oldValue = hMap.get(c);
                    hMap.put(c, oldValue + 1);
                } else {
                    hMap.put(c,1);
                };
            }
        }
        return hMap;
    }
}
