package com.sergey.javacore.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TComp implements Comparator<String> {
    @Override
    public int compare(String aStr, String bStr) {
        int i,j,k;

       i= aStr.lastIndexOf(' ');
       j= bStr.lastIndexOf(' ');
       k = aStr.substring(i).compareTo(bStr.substring(j));
       if (k==0)
           return aStr.compareTo(bStr);
       else
           return k;
    }
}
class TreeMapDemo2 {
    public static void main(String[] args) {
      // TreeMap<String, Double> hm = new TreeMap<>();
       TreeMap<String, Double> hm = new TreeMap<>(new TComp());
        hm.put("Petro v", new Double(112.33));
        hm.put("Ivanov Bb", new Double(0.12));
        hm.put("Ivanova Ba", new Double(0.12));
        hm.put("Sidorov AS", new Double(333));

        for (Map.Entry<String, Double> me : hm.entrySet()) {
            System.out.println(me.getKey() + " :" + me.getValue());
        }
        System.out.println();
        double balanse = hm.get("Petro v");
        hm.put("Petro v", balanse + 1000);
        System.out.println("balance Perov : " + hm.get("Petro v"));

    }
}