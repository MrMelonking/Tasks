package Pz1.Task9;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число у десятковій формі: ");

        int decimal = scanner.nextInt();

        String hex = Integer.toHexString(decimal).toUpperCase();

        System.out.println("Введене число в шістнадцятковій формі: " + hex);
    }
}
