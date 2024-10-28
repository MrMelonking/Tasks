package Pz1.Task6;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ціле число: ");

        int number = scanner.nextInt();

        System.out.println("Введене число в двійковому вигляді, переведене вбудованою функцією Java: " + Integer.toBinaryString(number));

        String binary = decimalToBinary(number);

        System.out.println("Введене число в двіковому вигляді, переведене написаним вручну методом: " + binary);
    }
    private static String decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder binaryString = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryString.append(remainder);
            decimalNumber /= 2;
        }

        return binaryString.reverse().toString();
    }
}
