package Lb2.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість цілих чисел для розрахунку: ");
        int amount = scanner.nextInt();

        System.out.println("Введіть " + amount + " цілих чисел/числа: ");

        int sum = 0;

        for (int i = 0; i < amount; i++){
            int number = scanner.nextInt();

            sum = sum + number;
        }

        System.out.println("Сума введених чисел: " + sum);
    }
}
