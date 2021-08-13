package com.samrat;

import java.util.Scanner;

public class SurfaceAreaOfShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter shape : ");
        String shape = input.nextLine();
        double surfaceArea = 0;

        switch (shape) {
            case "Cylinder" -> {
                System.out.println("Enter radius and height : ");
                double radius = input.nextDouble();
                double height = input.nextDouble();
                surfaceArea = 2 * Math.PI * (radius) * (height);
                break;
            }
            case "Cube" -> {
                System.out.println("Enter length of 1 side : ");
                double length = input.nextDouble();
                surfaceArea = 6 * length * length;
                break;
            }
            default -> {
                System.out.println("Please enter a valid shape");
                break;
            }
        }
        System.out.println("Surface Area is " + surfaceArea);
    }
}
