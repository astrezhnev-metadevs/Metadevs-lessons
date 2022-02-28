package com.metadevs;

import java.util.Random;
import java.util.Scanner;

public class GameGuessNumber {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int randomHiddenNumber = randomNumber.nextInt(100) + 1;
        int numberOfAttempts = 9;
        System.out.println("Я загадал число от 1 до 100. У тебя есть 10 попыток, чтобы его отгадать. Поехали!");
        for (int scoreAttempt = numberOfAttempts; scoreAttempt >= 0; scoreAttempt--) {
            System.out.println("У вас осталось " + (scoreAttempt + 1) + " попыток");
            Scanner scan = new Scanner(System.in);
            int userInput = userInputCheck(scan);
            if (userInput > 100) {
                System.out.println("Всё сломалось! Были указаны некорректные данные :(");
                break;
            } else if (userInput == randomHiddenNumber) {
                System.out.println("Вы угадали! Вы справились за " + (9 - scoreAttempt + 1) + " попыток!");
                break;
            } else if (userInput < randomHiddenNumber) {
                System.out.println("Загаданное число БОЛЬШЕ указанного");
            } else if (userInput > randomHiddenNumber) {
                System.out.println("Загаданное число МЕНЬШЕ указанного");
            }
        }
        System.out.println("Было загадано число: " + randomHiddenNumber);
    }

    public static int userInputCheck(Scanner scan) {
        while (!scan.hasNextInt()) {
            System.out.println("Необходимо ввести число!");
            scan.nextLine();
        }
        return scan.nextInt();
    }
}
