package Lb1.task6;


import java.util.Scanner;

public class Task6 {
        public static void main(String[] args)  {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введіть бажане число:");

            int numberInt = scanner.nextInt();

            if (numberInt % 2 != 0){
                System.out.println("Число непарне");
            }
            else System.out.println("Число парне");
        }
    }

