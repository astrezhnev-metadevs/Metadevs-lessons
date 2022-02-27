package com.metadevs;

import java.util.Scanner;

public class PaladinsTask4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 1;
        System.out.println("Введите число");
        while (!scan.hasNextInt()) {
            System.out.println("Необходимо ввести целое число!");
            scan.nextLine();
        }
        int b = scan.nextInt();
        for (int i = 0; i < b; i++) {
            a = a + a * i;
            System.out.println(a);

        }
    }
}
