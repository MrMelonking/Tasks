package Lb1.Task8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть напівсуму та напіврізницю:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int first = a + b;
        System.out.println("Перша змінна:" + first);
        int second;
        if (a < b){
            second = b - a;
            System.out.println("Друга змінна:" + second);
        }
        else if (a > b){
            second = a - b;
            System.out.println("Друга змінна:" + second);
        }
        scanner.close();
    }
}
