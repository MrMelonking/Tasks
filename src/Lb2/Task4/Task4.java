package Lb2.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        System.out.println("Введіть бажану кількість випадкових чисел:");

        int[] numbers = new int[scanner.nextInt()];

        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt();
        }
        System.out.println("Випадкові числа:");
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < 0){
                negativeNumbers.add(numbers[i]);
            }
        }

        System.out.println("Від'ємні чсила:");
        System.out.println(negativeNumbers);
    }
}
