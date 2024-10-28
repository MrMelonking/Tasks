package Lb2.Task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введіть кількість чисел в масиві:");
        int numbersLength = Integer.parseInt(reader.readLine());

        int[] numbers = new int[numbersLength];

        System.out.println("Введіть числа:");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println("Введіть кількість зсувів:");
        int shift = Integer.parseInt(reader.readLine());

        System.out.print("Масив чисел: ");
        printArray(numbers);

        int[] shiftedArray = rightShiftArray(numbers, shift);
        System.out.print("Масив зі зсувом: ");
        printArray(shiftedArray);

        System.out.println("Введіть строку:");
        String text = reader.readLine();

        System.out.println("Введіть кількість зсувів:");
        int shiftString = Integer.parseInt(reader.readLine());
        System.out.printf("Строка: %s\n", text);

        String shiftedString = rightShiftString(text, shiftString);
        System.out.printf("Строка після зсуву: %s\n", shiftedString);
    }

    private static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static int[] rightShiftArray(int[] numbers, int k) {
        int length = numbers.length;
        int[] shiftedArray = new int[length];

        for (int i = 0; i < length; i++) {
            shiftedArray[(i + k) % length] = numbers[i];
        }

        return shiftedArray;
    }

    private static String rightShiftString(String text, int k) {
        StringBuilder shiftedString = new StringBuilder();
        shiftedString.append(text.substring(text.length() - k));
        shiftedString.append(text.substring(0, text.length() - k));
        return shiftedString.toString();
    }
}
