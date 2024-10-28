package Pz1.Task10;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть три змінні квадратного рівняння: ");

        System.out.println("Перша змінна: ");
        int a = scanner.nextInt();
        System.out.println("Друга змінна: ");
        int b = scanner.nextInt();
        System.out.println("Третя змінна: ");
        int c = scanner.nextInt();

        if (a == 0) {
            throw new IllegalArgumentException("Коефіцієнт a не може бути 0");
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("Немає дійсних коренів");
        }
        else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Корінь 1: " + root1);
            System.out.println("Корінь 2: " + root2);
        }
    }
}
