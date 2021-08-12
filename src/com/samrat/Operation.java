package com.samrat;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        double d1 = input.nextDouble();
        double d2 = input.nextDouble();
        System.out.println("Enter operator");
        String c = input.next();
        System.out.println(c);

        double res = 0;
        if(c.equals("+")){
            res = d1 + d2;
        }else if(c.equals("-")) {
            res = d1 - d2;
        }else if(c.equals("*")){
            res = d1 * d2;
        }else if(c.equals("/")){
            res = d1 / d2;
        }

        System.out.println("Result is " + res);
    }
}
