package com.metadevs;

import java.util.Scanner;

public class PaladinsTask2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int value = userInputCheck(scan);
        if (value > 10) {
            System.out.println("Число больше 10");
        } else if (value == 10) {
            System.out.println("Число равно 10");
        } else if (value < 10) {
            System.out.println("Число меньше 10");
        }
    }

    public static int userInputCheck(Scanner scan) {
        while (!scan.hasNextInt()) {
            System.out.println("Необходимо ввести целое число!");
            scan.nextLine();
        }
        return scan.nextInt();
    }
}



