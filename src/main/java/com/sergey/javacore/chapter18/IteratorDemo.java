package com.sergey.javacore.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("C");
        al.add("B");
        al.add("A");
        al.add("E");
        al.add("F");
        al.add("D");
        System.out.println("Original content al: " + al);
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + "+");
        }
        System.out.print("Change content al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Change revers list: ");
        while (litr.hasPrevious()) {
            String element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(al);


    }
}
