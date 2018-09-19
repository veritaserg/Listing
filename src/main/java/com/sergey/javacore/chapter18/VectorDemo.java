package com.sergey.javacore.chapter18;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(3, 2);
        System.out.println("Size vector : " + v.size());
        System.out.println("Capacity vector : " + v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        System.out.println("Capacity after input 4 elementa : " + v.capacity());

        v.addElement(5);
        System.out.println("Capacity vector : " + v.capacity());

        v.addElement(6);
        v.addElement(7);
        System.out.println("Capacity vector : " + v.capacity());

        v.addElement(9);
        v.addElement(10);
        System.out.println("Capacity vector : " + v.capacity());

        v.addElement(11);
        v.addElement(12);
        System.out.println("First element " + v.firstElement());
        System.out.println("Last element " + v.lastElement());

        if (v.contains(3))
            System.out.println("Vector contains 3.");

        Enumeration<Integer> vEnum = v.elements();

        while (vEnum.hasMoreElements()) {
            System.out.print(vEnum.nextElement() + " ");

        }


    }
}
