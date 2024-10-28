package Pz1.Task4;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число більше 10: ");
        int number = scanner.nextInt();

        int reversed = 0;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        System.out.println("Віддзеркалене число: " + reversed);
    }
}
