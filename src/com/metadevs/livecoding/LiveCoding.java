package com.metadevs.livecoding;

import java.util.Scanner;

public class LiveCoding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую переменную");
        int value1 = userInputCheck(scan);
        System.out.println("Введите вторую переменную");
        int value2 = userInputCheck(scan);
        dataProcessing(value1, value2);
    }

    public static int userInputCheck(Scanner scan) {
        while (!scan.hasNextInt()) {
            System.out.println("Необходимо ввести целое число!");
            scan.nextLine();
        }
        return scan.nextInt();
    }

    public static void dataProcessing(int x, int y) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите операцию (1.Сложение 2.Вычитание 3.Умножение)");
        int userOperationsCheck = userInputCheck(scan);
        switch (userOperationsCheck) {
            case 1:
                System.out.println(x + y);
                break;
            case 2:
                System.out.println(x - y);
                break;
            case 3:
                System.out.println(x * y);
                break;
            default:
                System.out.println("Операция не определена");
        }
    }
}


