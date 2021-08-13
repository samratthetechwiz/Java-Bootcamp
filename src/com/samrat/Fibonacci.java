package com.samrat;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter how many Fibonacci numbers(greater than 2) to be printed : ");
        int num = input.nextInt();

        int p = 0;
        int q = 1;
        System.out.println(p);
        System.out.println(q);
        int count = 2;
        while(count != num){
            int temp = q;
            q = q + p;
            p = temp;
            count++;
            System.out.println(q);
        }
    }
}
