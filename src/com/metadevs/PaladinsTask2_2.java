package com.metadevs;

import java.util.Scanner;

public class PaladinsTask2_2 {
    public static void main(String[] args) {
        a();
        b();
        c();
        d();
        e();
        f();
        g();
        h();
    }

    public static void a() {
        int a = 10;
        int b = 5;
        boolean statement = (a > b);
        System.out.println(statement);
    }

    public static void b() {
        int a = 50;
        int b = 25;
        boolean statement = (a > b);
        System.out.println(statement);
    }

    public static void c() {
        int a = 67;
        int b = 23;
        boolean statement = (a < b);
        System.out.println(statement);
    }

    public static void d() {
        int a = 90;
        int b = 80;
        boolean statement = (a == b);
        System.out.println(statement);
    }

    public static void e() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int a = userInputCheck(scan);
        int b = 60;
        boolean statement = (a == b);
        System.out.println(statement);
    }

    public static void f() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое число больше 100");
        int a = 100;
        int b = userInputCheck(scan);
        scan.nextLine();
        while (b <= 100) {
            System.out.println("Необходимо ввести число больше 100!");
            b = userInputCheck(scan);
        }
        boolean statement = (a < b);
        System.out.println(statement);
    }

    public static void g() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число 30");
        int b = 60;
        int a = userInputCheck(scan) + b / 2;
        scan.nextLine();
        while (a != 60) {
            System.out.println("Необходимо ввести число 30!");
            a = userInputCheck(scan) + b / 2;
        }
        boolean statement = (a == b);
        System.out.println(statement);
    }

    public static void h() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число 73");
        int b = 146;
        int a = userInputCheck(scan) + b / 2;
        scan.nextLine();
        while (a != 146) {
            System.out.println("Необходимо ввести число 73!");
            a = userInputCheck(scan) + b / 2;
        }
        boolean statement = (a == b);
        System.out.println(statement);
    }

    public static int userInputCheck(Scanner scan) {
        while (!scan.hasNextInt()) {
            System.out.println("Необходимо ввести целое число!");
            scan.nextLine();
        }
        return scan.nextInt();
    }
}

