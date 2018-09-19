package com.sergey.javacore.chapter18;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HTDemo {
    public static void main(String[] args) {
        Hashtable<String, Double> hm = new Hashtable<>();
        hm.put("Petrov", new Double(112.33));
        hm.put("Ivanov", new Double(0.12));
        hm.put("Sidorov", new Double(333));

        for (HashMap.Entry<String, Double> me : hm.entrySet()) {
            System.out.print("return HashMap : " + me.getKey() + ": " + me.getValue());
            System.out.println();
        }
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": " + me.getValue());
            System.out.println();
        }
        System.out.println();
        double balance = hm.get("Petrov");
        hm.put("Petrov", balance + 10000);
        System.out.println("new balans Petrov" + hm.get("Petrov"));
    }
}
