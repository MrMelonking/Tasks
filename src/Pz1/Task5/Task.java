package Pz1.Task5;


import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число більше 10: ");

        int number = scanner.nextInt();

        int number1 = (int) Math.log10(number);

        int shifted = (number / 10) + (number % 10) * ((int) Math.pow(10, number1));

        System.out.println("Число після циклічного правого зсуву: " + shifted);
    }
}
