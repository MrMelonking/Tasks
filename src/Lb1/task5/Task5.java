package Lb1.task5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number1 = reader.readLine();
        String number2 = reader.readLine();

        double a = Integer.parseInt(number1);
        double b = Integer.parseInt(number2);

        double x = -a * b;

        System.out.println(x);
    }
}
