package Lb1.task10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time = 6;

        System.out.println("Введіть суму кредиту: ");
        double creditAmount = scanner.nextDouble();

        System.out.println("Введіть місячну ставку: ");
        double monthlyInterest = scanner.nextDouble() * 0.01;

        double totalPaid = 0;

        for(int i = 0; i < time; i++){
            if(i < 5){
                var x = creditAmount/2;
                creditAmount = (creditAmount/2) + x * monthlyInterest;
                totalPaid += creditAmount;
            }

            else{
                totalPaid += creditAmount;
            }
        }
        System.out.println("Всього сплачено за кредитом: " + totalPaid);

        scanner.close();
    }
}

