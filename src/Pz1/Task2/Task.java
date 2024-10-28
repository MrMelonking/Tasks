package Pz1.Task2;

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

        System.out.println("Відсортований масив: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
