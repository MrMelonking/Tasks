package Lb2.Task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введіть кількість чисел в масиві:");
        int numbersLength = Integer.parseInt(reader.readLine());

        int[] numbers = new int[numbersLength];

        System.out.println("Введіть числа:");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println("Введіть строку:");
        String text = reader.readLine();

        System.out.print("Масив чисел: ");
        printArray(numbers);

        reverseArray(numbers);
        System.out.print("Віддзеркалений масив чисел: ");
        printArray(numbers);

        System.out.println("Строка:" + text);

        String reversedText = reverseString(text);
        System.out.println("Віддзеркалена строка:" + reversedText);
    }

    private static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static int[] reverseArray(int[] numbers) {
        int length = numbers.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[length - 1 - i];
            numbers[length - 1 - i] = temp;
        }
        return numbers;
    }

    private static String reverseString(String text) {
        StringBuilder reversedText = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText.append(text.charAt(i));
        }
        return reversedText.toString();
    }
}
