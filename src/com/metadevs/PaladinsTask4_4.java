package com.metadevs;

public class PaladinsTask4_4 {
    public static void main(String[] args) {
        int [][] inputTwoDimArray = {{42, 25}, {12, 15}, {89, 76}};
        int [][] outputTwoDimArray = new int[3][2];
        for (int row = 0; row < inputTwoDimArray.length; row++) {
            for (int col = 0; col < inputTwoDimArray[row].length; col++) {
                int rowIndexOutput = inputTwoDimArray.length - 1 - row;
                int colIndexOutput = inputTwoDimArray[row].length - 1 - col;
                outputTwoDimArray[row][col] = inputTwoDimArray[rowIndexOutput][colIndexOutput];
                System.out.print (outputTwoDimArray[row][col] + " ");
            }
            System.out.println();
        }
    }
}
