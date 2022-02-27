package com.metadevs;

import java.util.Scanner;

public class PaladinsTask1_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        while (!scan.hasNextInt()) {
            System.out.println("Необходимо ввести целое число!");
            scan.nextLine();
        }
        int value1 = scan.nextInt();
        scan.nextLine();
        System.out.println("Введите второе число");
        while (!scan.hasNextInt()) {
            System.out.println("Необходимо ввести целое число!");
            scan.nextLine();
        }
        int value2 = scan.nextInt();
        double DoubleValue1 = value1;
        double DoubleValue2 = value2;

        int sum = value1 + value2;
        int difference = value1 - value2;
        int multiply = value1 * value2;
        double division = DoubleValue1 / DoubleValue2;

        System.out.println("Сумма: " + sum + "\n" + "Разность: " + difference + "\n" + "Произведение: " + multiply + "\n" + "Частное: " + division);
    }
}