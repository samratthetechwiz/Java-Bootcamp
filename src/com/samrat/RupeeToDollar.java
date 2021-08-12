package com.samrat;

import java.util.Scanner;

public class RupeeToDollar {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter value in Rupees : ");
        double rupee = input.nextDouble();

        System.out.println("Value in Dollars : " + rupee/75);
    }
}
