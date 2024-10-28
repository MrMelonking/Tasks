package Pz1.Task12;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть координати центра та радіус першого кола: ");

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r1 = scanner.nextDouble();

        System.out.println("Введіть координати центра та радіус другого кола: ");

        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double r2 = scanner.nextDouble();

        checkOverlappingCircles(x1, y1, r1, x2, y2, r2);
    }

    private static void checkOverlappingCircles(double x1, double y1, double r1,
                                                double x2, double y2, double r2) {
        double distanceBetweenCenters = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (distanceBetweenCenters <= r1 + r2) {
            System.out.println("Кола накладаються");
        } else {
            System.out.println("Кола не накладаються");
        }
    }
}
