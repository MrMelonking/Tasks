package Lb1.Task4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введіть чотири цифри:");
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        String number3 = reader.readLine();
        String number4 = reader.readLine();

        double Number1 = Integer.parseInt(number1);
        double Number2 = Integer.parseInt(number2);
        double Number3 = Integer.parseInt(number3);
        double Number4 = Integer.parseInt(number4);

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
