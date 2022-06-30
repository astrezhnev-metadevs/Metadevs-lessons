package com.metadevs.chararray;

import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int size  = scan.nextInt();
        System.out.println("Введите символ");
        char [] input = new char[size];
        char symbol = scan.next().charAt(0);
        System.out.println("Исходный массив");
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < i ; j++) {

            }
            input[i] = symbol;
            System.out.println(i);
        }

    }
}


