package com.metadevs;

import java.util.Scanner;

public class PaladinsTask1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя");
        String Name = scan.nextLine();
        System.out.println("Введите фамилию");
        String SecondName = scan.nextLine();
        System.out.println("Введите возраст");
        int age = scan.nextInt();
        System.out.println(Name + "\n" + SecondName + "\n" + age);
    }
}

