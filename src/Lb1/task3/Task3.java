package Lb1.task3;


import java.util.Scanner;

public class Task3 {
   public static void main(String[] args)  {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Введіть число:");

        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("Парне");
        }
        else System.out.println("Непарне");
    }
}
