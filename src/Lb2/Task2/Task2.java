package Lb2.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість чисел Фібоначчі: ");

        int n = scanner.nextInt();

        int[] fibonacciArray = new int[n];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }

        System.out.println("Числа Фібоначчі:");
        for (int num : fibonacciArray) {
            System.out.print(num + " ");
        }

        int sum = 0;
        for (int num : fibonacciArray) {
            sum += num;
        }

        System.out.println("Сума виведених чисел: " + sum);
    }
}
