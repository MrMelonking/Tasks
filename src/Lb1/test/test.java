package Lb1.test;

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть суму кредиту: ");
        double creditAmount = scanner.nextDouble();

        System.out.println("Введіть місячну ставку: ");
        double monthlyInterest = scanner.nextDouble() * 0.01;

        double totalPaid = 0;

        for(int i = 0; i < 6; i++){
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
