package com.metadevs;

import java.util.Scanner;

public class PaladinsTask4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите начальную точку диапазона");
        while (!scan.hasNextInt()) {
            System.out.println("Необходимо ввести целое число!");
            scan.nextLine();
        }
        int a = scan.nextInt();
        scan.nextLine();
        System.out.println("Укажите конечную точку диапазона");
        while (!scan.hasNextInt()) {
            System.out.println("Необходимо ввести целое число!");
            scan.nextLine();
        }
        int b = scan.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
