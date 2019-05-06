package com.vanillastorm.other;

import java.util.HashMap;
import java.util.Map;

public class StringToMap {
    public static Map stringToMap(String s) {
        if (s.isEmpty()) {
            return null;
        }

        Map<String, String> result = new HashMap<>();

        String[] keyValuePair = s.split("&");
        for (int i = 0; i < keyValuePair.length; i++) {
            String[] pairs = keyValuePair[i].split("=");
            try {
                if (pairs[0].equals("")) {
                    result.put(null, pairs[1]);
                } else result.put(pairs[0], pairs[1]);
            } catch (IndexOutOfBoundsException e) {
                result.put(pairs[0], null);
            }
        }

        for (Map.Entry<String, String> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "key=value&one=two&keyWithoutValue=&=valueWithoutKey&ez=pz&koko=";
        StringToMap.stringToMap(s);
    }
}
