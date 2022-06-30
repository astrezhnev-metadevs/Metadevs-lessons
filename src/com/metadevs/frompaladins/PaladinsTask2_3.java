package com.metadevs.frompaladins;

import java.util.Scanner;

public class PaladinsTask2_3 {
    public static void main(String[] args) {
        System.out.println("Что говорит кошка?");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        answer = answer.toLowerCase();

        if (answer.equals("мяу")) {
            System.out.println("Да, верно!");
        } else {
            System.out.println("Это говорит какое-то другое животное...");
        }
    }
}
