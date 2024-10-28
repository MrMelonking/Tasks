package Lb1.task1;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();

        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();


        System.out.println("Операції над типом int:");
        int sumInt = int1 + int2;
        System.out.println(sumInt);

        int substrInt = int1 - int2;
        System.out.println(substrInt);

        int multiInt = int1 * int2;
        System.out.println(multiInt);

        int diviInt = int1 / int2;
        System.out.println(diviInt);
        System.out.println();


        System.out.println("Операції над типом double:");
        double sumFloat = double1 + double2;
        System.out.println(sumFloat);

        double substrFloat = double1 - double2;
        System.out.println(substrFloat);

        double multiFloat = double1 * double2;
        System.out.println(multiFloat);

        double diviFloat = double1 / double2;
        System.out.println(diviFloat);
        System.out.println();


        System.out.println("Операції над змінними різного типу:");
        double substrIntDouble = double1 - int1;
        System.out.println(substrIntDouble);
        double multiIntDouble = double1 * int2;
        System.out.println(multiIntDouble);
    }
}
