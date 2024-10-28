package Lb1.task5;


import java.util.Scanner;

public class Task5 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть два числа:");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double x = -a * b;
        double y = 3 * b - 0.5 * a;

        System.out.println(x);
        System.out.println(y);
    }
}
