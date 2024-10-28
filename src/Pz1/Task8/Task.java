package Pz1.Task8;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число у двійковій формі: ");

        String binary = scanner.nextLine();

        int decimal = Integer.parseInt(binary, 2);

        String hex = Integer.toHexString(decimal).toUpperCase();

        System.out.println("Введене число в десятковій формі: " + decimal);

        System.out.println("Введене число в шістнадцятковій формі: " + hex);
    }
}
