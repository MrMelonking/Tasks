package Lb1.task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть два числа:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double resultSum = (a + b) / 2;
        System.out.println("Напівсума:" + resultSum);
        double resultSubstr;
        if (a > b){
            resultSubstr = (a - b) / 2;
            System.out.println("Напіврізниця:" + resultSubstr);
        }
        else if (a < b){
            resultSubstr = (b - a) / 2;
            System.out.println("Напіврізниця:" + resultSubstr);
        }
        scanner.close();
    }
}
