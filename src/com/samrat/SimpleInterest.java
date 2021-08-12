package com.samrat;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Principle : ");
        int principle = input.nextInt();
        System.out.println("Please enter Time : ");
        int time = input.nextInt();
        System.out.println("Please enter Rate Of Interest : ");
        double roi = input.nextDouble();

        double simpleInterest = (principle * roi * time)/100;
        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Amount = " + (principle + simpleInterest));
    }
}
