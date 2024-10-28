package Pz1.Task13;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть довжини сторін першого трикутника:");
        double[] sideLengths1 = {scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()};

        System.out.println("Введіть довжини сторін другого трикутника:");
        double[] sideLengths2 = {scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()};

        compareTriangles(sideLengths1, sideLengths2);
    }

    private static void compareTriangles(double[] sideLengths1, double[] sideLengths2) {
        double perimeter1 = calculateTrianglePerimeter(sideLengths1);
        double perimeter2 = calculateTrianglePerimeter(sideLengths2);


        double area1 = calculateTriangleArea(sideLengths1);
        double area2 = calculateTriangleArea(sideLengths2);

        System.out.println("Периметр першого трикутника: " + perimeter1);
        System.out.println("Периметр другого трикутника: " + perimeter2);

        System.out.println("Площа першого трикутника: " + area1);
        System.out.println("Площа другого трикутника: " + area2);

        if (area1 > area2) {
            System.out.println("Перший трикутник має більшу площу");
        }
        else if (area1 < area2) {
            System.out.println("Другий трикутник має більшу площу");
        }
        else {
            System.out.println("Трикутники мають однакову площу");
        }



        if (perimeter1 > perimeter2) {
            System.out.println("Перший трикутник має більший периметр");
        }
        else if (perimeter1 < perimeter2) {
            System.out.println("Другий трикутник має більший периметр");
        }
        else {
            System.out.println("Трикутники мають однаковий периметр");
        }
    }

    private static double calculateTriangleArea(double[] sideLengths) {
        double s = (sideLengths[0] + sideLengths[1] + sideLengths[2]) / 2.0;
        return Math.sqrt(s * (s - sideLengths[0]) * (s - sideLengths[1]) * (s - sideLengths[2]));
    }

    private static double calculateTrianglePerimeter(double[] sideLengths) {
        return sideLengths[0] + sideLengths[1] + sideLengths[2];
    }
}
