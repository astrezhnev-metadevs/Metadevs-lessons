package com.metadevs.stepik;

import java.util.ArrayList;
import java.util.Scanner;

public class Stepik7_3_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInputNumber;
        ArrayList<Integer> newList = new ArrayList<Integer>();
        do {
            userInputNumber = scan.nextInt();
            if (userInputNumber != -9999) {
                newList.add(userInputNumber);
            }
        }
        while (userInputNumber != -9999);
        for (int i = 0; i < newList.size(); i++) {
            if (newList.get(i) > 0)
                while (newList.get(i) > 0) {
                    System.out.println("Yes");
                    return;
                }
            else if (newList.get(i) < 0)
                while (newList.get(i) > 0) {
                    System.out.println("No");
                    return;
                }
        }
    }
}
