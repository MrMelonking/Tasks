package Pz1.Task1;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ціле число: ");

        int number = scanner.nextInt();

        if (number % 2 == 0 && number % 3 == 0){
            System.out.println("Введене число є парним та ділиться на 3 без остачі");
        }

        else if (number % 2 == 0 && number % 7 == 0){
            System.out.println("Введене число є парним та ділиться на 7 без остачі");
        }

        else if (number % 3 == 0 && number % 7 == 0){
            System.out.println("Введене число ділиться на 3 та на 7 без остачі");
        }
        else if (number % 2 == 0 ){
            System.out.println("Введене число є парним");
        }
        else if (number % 3 == 0){
            System.out.println("Введене число ділиться на 3 без остачі");
        }
        else if (number % 7 == 0){
            System.out.println("Введене число ділиться на 7 без остачі");
        }

        }
    }

