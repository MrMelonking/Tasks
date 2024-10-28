package Lb1.task2;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть бажане число від 1 до 10: ");

        int userNumber = scanner.nextInt();

        int number1 = 5;
        int number2 = 6;
        int number3 = 10;
        int number4 = 1;
        int number5 = 5;

        if (number1 < number2 && number3 > number4){
            System.out.println("Істина");
        }

        if (userNumber != number3){
            System.out.println("Введене число не рівне числу " + number3);
        }


        if (userNumber == number1){
            System.out.println("Співпадіння знайдено:" + number1);
        }
        else if (userNumber == number2){
            System.out.println("Співпадіння знайдено:" + number2);
        }
        else if (userNumber == number3){
            System.out.println("Співпадіння знайдено:" + number3);
        }
        else if (userNumber == number4){
            System.out.println("Співпадіння знайдено:" + number4);
        }
        else System.out.println("Співпадінь немає");

        if (userNumber == number1 ^ userNumber == number5 ^ userNumber == number2){
            System.out.println("Введене число рівне одному з трьох чисел");
        }
        if (userNumber == number1 + number2 || userNumber == number3 + number2 || userNumber == number1 + number3){
            System.out.println("Введене число дорівнює сумі двох з трьох елементів");
        }
        else System.out.println("Введене число не дорівнює сумі жодних двох елементів");
    }
}
