package Lb2.Task6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.println("Введіть кількість квитків:");

        int numberOfTickets = scanner.nextInt();

        int[] luckyTickets = new int[10];

        for (int i = 0; i < luckyTickets.length; i++){
            luckyTickets[i] = random.nextInt(1000,10000);
        }

        int[] tickets = new int[numberOfTickets];

        for (int i = 0; i < tickets.length; i++){
            tickets[i] = random.nextInt(1000,10000);
        }

        System.out.println("Номери щасливих квитків: ");
        System.out.println(Arrays.toString(luckyTickets));

        System.out.println();

        System.out.println("Номера випадкових квитків: ");
        System.out.println(Arrays.toString(tickets));

        int luckyCounter = 0;

        for (int i = 0; i < tickets.length; i++){
            for (int j = 0; j < luckyTickets.length; j++){
                if (tickets[i] == luckyTickets[j]){
                    System.out.println("Щасливий квиток зайдено!");
                    luckyCounter++;
                }
            }
        }
        System.out.println("Кількість щасливих квитків: " + luckyCounter);
    }
}
