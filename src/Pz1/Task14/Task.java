package Pz1.Task14;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть довжини сторін трикутника: ");
        double[] sideLengths = {scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()};

        System.out.println("Введіть радуіс кола: ");
        double radius = scanner.nextDouble();

        compareTriangleAndCircle(sideLengths, radius);
    }

    private static void compareTriangleAndCircle(double[] sideLengths, double radius) {
        double triangleArea = calculateTriangleArea(sideLengths);
        double circleArea = calculateCircleArea(radius);

        double trianglePerimeter = calculateTrianglePerimeter(sideLengths);
        double circlePerimeter = calculateCirclePerimeter(radius);

        System.out.println("Периметр трикутника: " + trianglePerimeter);
        System.out.println("Периметр кола: " + circlePerimeter);

        if (trianglePerimeter > circlePerimeter) {
            System.out.println("Трикутник має більший периметр");
        } else if (trianglePerimeter < circlePerimeter) {
            System.out.println("Коло має більший периметр");
        } else {
            System.out.println("Трикутник і коло мають однаковий периметр");
        }


        System.out.println("Площа трикутника: " + triangleArea);
        System.out.println("Площа кола: " + circleArea);

        if (triangleArea > circleArea) {
            System.out.println("Трикутник має більшу площу");
        } else if (triangleArea < circleArea) {
            System.out.println("Коло має більшу площу");
        } else {
            System.out.println("Трикутник і коло мають однакову площу");
        }


    }

    private static double calculateTriangleArea(double[] sideLengths) {
        double s = (sideLengths[0] + sideLengths[1] + sideLengths[2]) / 2.0;
        return Math.sqrt(s * (s - sideLengths[0]) * (s - sideLengths[1]) * (s - sideLengths[2]));
    }

    private static double calculateTrianglePerimeter(double[] sideLengths) {
        return sideLengths[0] + sideLengths[1] + sideLengths[2];
    }

    private static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    private static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
