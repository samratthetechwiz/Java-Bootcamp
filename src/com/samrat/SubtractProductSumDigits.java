package com.samrat;

import java.util.Scanner;

public class SubtractProductSumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        int sum = 0;
        int prod = 1;

        while(num != 0){
            int digit = num % 10;
            sum = sum + digit;
            prod = prod * digit;
            num = num / 10;
        }

        System.out.println("Product : " + prod);
        System.out.println("Sum : " + sum);
        int res = prod - sum;
        System.out.println("Result : " + res);
    }
}
