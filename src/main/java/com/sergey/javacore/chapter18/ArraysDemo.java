package com.sergey.javacore.chapter18;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }
        System.out.print("Исходный массив: ");
        display(array);
        Arrays.sort(array);
        System.out.println("Отсортированный массив: ");
        display(array);
        Arrays.fill(array, 2, 4, 5);
        display(array);
        Arrays.sort(array);
        System.out.println("Отсортированный массив: ");
        display(array);

        int index = Arrays.binarySearch(array, -24);
        System.out.println("Число 24 находится на позицый - " + index);


    }

    static void display(int[] array) {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();

    }
}
