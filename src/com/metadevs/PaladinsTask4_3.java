package com.metadevs;

import java.util.Scanner;

public class PaladinsTask4_3 {
    public static void main(String[] args) {
       invertAndPrintArray();
    }

    public static void invertAndPrintArray()  {
        Scanner scanNum = new Scanner(System.in);
        System.out.println("Введите количество элементов");
        while (!scanNum.hasNextInt()) {
            System.out.println("Необходимо ввести целое число!");
            scanNum.nextLine();
        }
        String[] array = new String[scanNum.nextInt()];
        scanNum.nextLine();
        System.out.println("Ведите элементы");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanNum.nextLine();
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
