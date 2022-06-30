package com.metadevs.frompaladins;

import java.util.Scanner;

public class PaladinsTask2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int value1 = scan.nextInt();
        System.out.println("Введите второе число");
        int value2 = scan.nextInt();
        boolean statement1 = value1 > value2;
        boolean statement2 = value1 < value2;
        if (statement1 = true) {
            System.out.println("Первое введённое число меньше второго");
        } else if (statement2 = true) {
            System.out.println("Первое введённое число больше второго");
        } else {
            System.out.println("Числа равны");
        }
    }
}

