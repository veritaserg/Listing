package com.sergey.javacore.chapter18;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Theta");
        hs.add("Gama");
        hs.add("Delta");
        System.out.println(hs);
    }
}
