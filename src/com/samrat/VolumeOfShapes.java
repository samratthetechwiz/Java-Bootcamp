package com.samrat;

import java.util.Scanner;

public class VolumeOfShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter shape : ");
        String shape = input.nextLine();
        double volume = 0;

        switch (shape) {
            case "Cone" -> {
                System.out.println("Enter radius and height: ");
                double radius = input.nextDouble();
                double height = input.nextDouble();
                volume = (Math.PI * (radius) * (radius) * height) / 3;
                break;
            }
            case "Prism" -> {
                System.out.println("Enter Base Area and height: ");
                double baseArea = input.nextDouble();
                double height = input.nextDouble();
                volume = baseArea * height;
                break;
            }
            case "Cylinder" -> {
                System.out.println("Enter radius and height: ");
                double radius = input.nextDouble();
                double height = input.nextDouble();
                volume = Math.PI * (radius) * (radius) * height;
                break;
            }
            case "Sphere" -> {
                System.out.println("Enter radius : ");
                double radius = input.nextDouble();
                volume = (4/3) * Math.PI * (radius) * (radius) * (radius);
                break;
            }
            case "Pyramid" -> {
                System.out.println("Enter Base Length, Width and Pyramid Height: ");
                double baseLength = input.nextDouble();
                double baseWidth = input.nextDouble();
                double height = input.nextDouble();
                volume = (baseLength * baseWidth * height)/3;
                break;
            }
            default -> {
                System.out.println("Please enter a valid shape");
                break;
            }
        }
        System.out.println("Volume is " + volume);
    }
}
