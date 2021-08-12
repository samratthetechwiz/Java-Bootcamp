package com.samrat;

import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = input.nextInt();
        int sum = 0;
        while(num != 0){
            sum = sum + num;
            System.out.println("Enter number : ");
            num = input.nextInt();
        }
        System.out.println("Sum is " + sum);
    }
}
