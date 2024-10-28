package Lb2.Task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть коефіцієнт a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть коефіцієнт b: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть коефіцієнт c: ");
        double c = scanner.nextDouble();

        System.out.print("Введіть точність: ");
        double epsilon = scanner.nextDouble();

        double x0 = initialGuess(a, b, c, epsilon);

        double x = newtonRaphson(x0, a, b, c, epsilon);

        System.out.printf("Корінь кубічного рівняння:" + x);
    }

    private static double initialGuess(double a, double b, double c, double epsilon) {

        double left = -1000;
        double right = 1000;

        while (Math.abs(right - left) > epsilon) {
            double mid = (left + right) / 2;
            double f = Math.pow(mid, 3) + a * Math.pow(mid, 2) + b * mid + c;

            if (f < 0) {
                right = mid;
            } else {
                left = mid;
            }
        }

        return (left + right) / 2;
    }

    private static double newtonRaphson(double x0, double a, double b, double c, double epsilon) {
        double x = x0;

        while (Math.abs(Math.pow(x, 3) + a * Math.pow(x, 2) + b * x + c) > epsilon) {
            double f = Math.pow(x, 3) + a * Math.pow(x, 2) + b * x + c;
            double fPrime = 3 * Math.pow(x, 2) + 2 * a * x + b;

            x = x - f / fPrime;
        }

        return x;
    }
}
