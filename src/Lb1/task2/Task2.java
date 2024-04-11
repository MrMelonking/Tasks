package Lb1.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String userNumber = reader.readLine();

        int userNumberInt = Integer.parseInt(userNumber);

        int number1 = 3;
        int number2 = 5;
        int number3 = 15;
        int number4 = 7;

        if (number1 < number2 && number3 > number4){
            System.out.println("Істина");
        }

        if (userNumberInt != number3){
            System.out.println("Введене чсло не рівне числу " + number3);
        }


        if (userNumberInt == number1){
            System.out.println("Співпадіння знайдено:" + number1);
        }
        else if (userNumberInt == number2){
            System.out.println("Співпадіння знайдено:" + number2);
        }
        else if (userNumberInt == number3){
            System.out.println("Співпадіння знайдено:" + number3);
        }
        else if (userNumberInt == number4){
            System.out.println("Співпадіння знайдено:" + number4);
        }
        else System.out.println("Співпадінь немає");

        if (userNumberInt == number1 + number2 || userNumberInt == number3 + number2 || userNumberInt == number1 + number3){
            System.out.println("Введене число дорівнює сумі двох з трьох елементів");
        }
        else System.out.println("Введене число не дорівює сумі жодних двох елементів");
    }
}
