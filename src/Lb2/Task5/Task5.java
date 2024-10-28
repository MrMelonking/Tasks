package Lb2.Task5;


import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.println("Введіть бажану довжину числа для сортування:");

        int neededLenght = scanner.nextInt();

        System.out.println("Введіть кількість чисел:");

        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(20000) ;
        }

        System.out.println(Arrays.toString(array));

        System.out.println("Числа, що відповідають заданій довжині:");
        for (int i : array) {
            if (countDigits(i) == neededLenght){
                System.out.println(i);
            }


        }
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
