package com.sergey.javacore.chapter18;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> hm = new TreeMap<>();
        hm.put("Petrov", new Double(112.33));
        hm.put("Ivanov", new Double(0.12));
        hm.put("Sidorov", new Double(333));

        for (Map.Entry<String, Double> me : hm.entrySet()) {
            System.out.println(me.getKey() + " :" + me.getValue());
        }
        System.out.println();
        double balanse = hm.get("Petrov");
        hm.put("Petrov", balanse + 1000);
        System.out.println("balance Perov : " + hm.get("Petrov"));

    }
}