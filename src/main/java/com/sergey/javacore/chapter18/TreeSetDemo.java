package com.sergey.javacore.chapter18;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("F");
        ts.add("D");
        ts.add("E");
        System.out.println(ts);
        System.out.println(ts.subSet("C","F"));
    }
}
