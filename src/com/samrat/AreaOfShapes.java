package com.samrat;

import java.util.Scanner;

public class AreaOfShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter shape : ");
        String shape = input.nextLine();
        double area = 0;

        switch (shape) {
            case "Circle" -> {
                System.out.println("Enter radius : ");
                double radius = input.nextDouble();
                area = Math.PI * (radius) * (radius);
                break;
            }
            case "Triangle", "Isosceles Triangle", "Equilateral Triangle" -> {
                System.out.println("Enter length and breadth : ");
                double length = input.nextDouble();
                double breadth = input.nextDouble();
                area = length * breadth * 0.5;
                break;
            }
            case "Rectangle", "Square", "Parallelogram" -> {
                System.out.println("Enter length and breadth : ");
                double length = input.nextDouble();
                double breadth = input.nextDouble();
                area = length * breadth;
                break;
            }
            case "Rhombus" -> {
                System.out.println("Enter length of both diagonals : ");
                double length = input.nextDouble();
                double breadth = input.nextDouble();
                area = length * breadth * 0.5;
                break;
            }
            default -> {
                System.out.println("Please enter a valid shape");
                break;
            }
        }
        System.out.println("Area is " + area);
    }
}
