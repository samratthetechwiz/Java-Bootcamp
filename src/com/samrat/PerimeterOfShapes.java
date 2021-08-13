package com.samrat;

import java.util.Scanner;

public class PerimeterOfShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter shape : ");
        String shape = input.nextLine();
        double perimeter = 0;

        switch (shape) {
            case "Circle" -> {
                System.out.println("Enter radius : ");
                double radius = input.nextDouble();
                perimeter = Math.PI * (radius) * 2;
                break;
            }
            case "Equilateral Triangle" -> {
                System.out.println("Enter length of 1 side : ");
                double length = input.nextDouble();
                perimeter = length * 3;
                break;
            }
            case "Rectangle", "Parallelogram" -> {
                System.out.println("Enter length and breadth : ");
                double length = input.nextDouble();
                double breadth = input.nextDouble();
                perimeter = 2 * (length + breadth);
                break;
            }
            case "Rhombus", "Square" -> {
                System.out.println("Enter length of 1 side : ");
                double length = input.nextDouble();
                perimeter = length * 4;
                break;
            }
            default -> {
                System.out.println("Please enter a valid shape");
                break;
            }
        }
        System.out.println("Area is " + perimeter);
    }
}
