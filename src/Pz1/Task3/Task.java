package Pz1.Task3;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість чисел для сортування: ");

        int[] numbers = new int[scanner.nextInt()];

        System.out.println("Введіть числа по одному: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }


        sort(numbers);


        System.out.println("Парні числа: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println(" ");

        System.out.println("Непарні числа: ");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
    }
}

