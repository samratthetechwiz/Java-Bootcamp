package com.samrat;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();

        int count = 2;

        System.out.println("Factors of " + num + " are : ");
        while(count < num){
            if(num%count == 0){
                System.out.println(count);
            }
            count++;
        }
    }
}
