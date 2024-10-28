package Lb1.Task4;


import java.util.Scanner;

public class Task4 {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть чотири цифри:");

        double Number1 = scanner.nextDouble();
        double Number2 = scanner.nextDouble();
        double Number3 = scanner.nextDouble();
        double Number4 = scanner.nextDouble();

        System.out.println();

        System.out.println("Результати:");

        double result1 = Number1 + Number2 / Number3 - Number4;
        double result2 = (Number1 + Number2) / Number3 - Number4;
        double result3 = Number1 + Number2 / (Number4 - Number3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
