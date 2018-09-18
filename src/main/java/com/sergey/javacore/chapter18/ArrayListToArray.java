package com.sergey.javacore.chapter18;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Содержимое al: " + al);

        Integer ai[] = new Integer[al.size()];
        ai = al.toArray(ai);

        int sum = 0;
        for (int i : ai) sum += i;
        System.out.println("Сумма: " + sum);
    }
}
