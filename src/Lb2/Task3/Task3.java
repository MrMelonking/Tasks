package Lb2.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введіть кількість строк у вигляді числа:");

        int numberOfStrings = Integer.parseInt(reader.readLine());

        String[] array = new String[numberOfStrings];

        System.out.println("Введіть " + numberOfStrings + " строк:");

        for (int i = 0; i < array.length; i++){
            array[i] = reader.readLine();
        }

        int currentShortestLenght = array[0].length();
        String currentShortest = array[0];

        for (int i = 0; i < array.length; i++){

            if (i == 0){
                if (currentShortestLenght > array[i + 1].length()){
                    currentShortestLenght = array[i + 1].length();
                    currentShortest = array[i + 1];
                }
            }
            else if (i > 0 && i < array.length - 1){
                if (currentShortestLenght > array[i + 1].length()){
                    currentShortestLenght = array[i + 1].length();
                    currentShortest = array[i + 1];
                }
            }
            else if (i == array.length - 1){
                if (currentShortestLenght > array[i].length()){
                    currentShortestLenght = array[i].length();
                    currentShortest = array[i];
                }
            }
        }

        System.out.println("Найменша довжина строки: " + currentShortestLenght);
        System.out.println("Найменша строка: " + currentShortest);
    }
}
