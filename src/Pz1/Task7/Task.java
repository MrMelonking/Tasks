package Pz1.Task7;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число у двійковій формі: ");

        String binary = scanner.nextLine();

        int decimal = Integer.parseInt(binary, 2);

        System.out.println("Введене число, переведене в десяткову форму функцією Integer.parseInt(): " + decimal);

        System.out.println("Введене число, переведене в десяткову форму окремим методом: " + binaryToDecimal(binary));
    }

    private static int binaryToDecimal(String binaryString) {
        int decimalNumber = 0;
        int power = 0;

        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char digit = binaryString.charAt(i);
            if (digit != '0' && digit != '1') {
                System.out.println("Введено число не у двійковій формі");
                break;
            }

            int value = digit == '1' ? 1 : 0;
            decimalNumber += value * Math.pow(2, power);
            power++;
        }

        return decimalNumber;
    }
}
