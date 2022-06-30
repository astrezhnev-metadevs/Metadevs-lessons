package com.metadevs.livecoding;

import java.util.function.DoubleToIntFunction;

public class LiveCodingSwitch {

    final static int firstDec = 1;
    final static int secondDec = 2;
    final static int thirdDec = 3;

    public static void main(String[] args) {
        int k = (int) (1 + Math.random() * 99);
        switch (k) {
            case firstDec:
                switch (k % 10) {
                    case 11:
                        System.out.println("Мне 11 лет");
                        break;
                }
            case secondDec:
                System.out.println("Мне" + "год");
                break;
            case thirdDec:
                System.out.println("Мне" + "года");
                break;
            default:
        }
    }
}
