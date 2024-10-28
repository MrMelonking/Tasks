package Pz1.Task11;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть координати точок першої прямої: ");

        System.out.println("Координати першої точки: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Координати другої точки: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Введіть координати точок другої прямої: ");

        System.out.println("Координати першої точки: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        System.out.println("Координати другої точки: ");
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();


        double slope1 = (y2 - y1) / (x2 - x1);
        double intercept1 = y1 - slope1 * x1;

        double slope2 = (y4 - y3) / (x4 - x3);
        double intercept2 = y3 - slope2 * x3;

        if (slope1 == slope2 && intercept1 == intercept2) {
            System.out.println("Прямі збігаються.");
        }
        else if (slope1 == slope2) {
            System.out.println("Прямі паралельні.");
        }
        else {

            double xIntersection = (intercept2 - intercept1) / (slope1 - slope2);
            double yIntersection = slope1 * xIntersection + intercept1;

            System.out.println("Точка перетину: (" + xIntersection + ", " + yIntersection + ")");
        }
    }
}
