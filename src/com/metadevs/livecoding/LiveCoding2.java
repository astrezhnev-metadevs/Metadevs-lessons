package com.metadevs.livecoding;

import java.util.Scanner;

public class LiveCoding2 {
    static Scanner scan = new Scanner(System.in);
    static int arraySize = scan.nextInt();
    static int[] array = new int[arraySize];

    public static void main(String[] args) {
        arrayFilling(array);

    }

    public static void arrayFilling(int[] array) {
        for (int i = 0; i < arraySize; i++) {
            array[i] = scan.nextInt();
        }

//    public static void() {
//            switch () {
//                case 1:
//            }
//        }
    }
}
