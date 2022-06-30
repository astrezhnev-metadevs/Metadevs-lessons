package com.metadevs.stepik;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Stepik7_3_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfLines = scan.nextInt();
        for (int i = 0; i < numberOfLines; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print( j+1+" ");
            }
        }
    }
}
