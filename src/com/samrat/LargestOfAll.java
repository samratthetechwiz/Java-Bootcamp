package com.samrat;

import java.util.Scanner;

public class LargestOfAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = input.nextInt();
        int max = Integer.MIN_VALUE;
        while(num != 0){
            if(num > max)
                max = num;
            System.out.println("Enter number : ");
            num = input.nextInt();
        }
        System.out.println("Max is " + max);
    }
}
