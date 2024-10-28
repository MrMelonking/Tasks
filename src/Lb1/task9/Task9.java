package Lb1.task9;


import java.util.Scanner;

public class Task9 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        double price1 = 64.29;
        double sale1 = 0.1;
        int amountForSaleFirst = 70;
        double sum1;

        double price2 = 165.09;
        double sale2 = 0.5;
        int amountForSaleSecond = 200;
        double sum2;


        System.out.println("Введіть дані для першого товару:");
        int amountOfFirstProduct = scanner.nextInt();

        if (amountOfFirstProduct < amountForSaleFirst){
            sum1 = price1 * amountOfFirstProduct;
            System.out.println("До сплати: " + sum1);
        }
        else if(amountOfFirstProduct >= amountForSaleFirst){
            sum1 = price1 * amountOfFirstProduct * sale1;
            System.out.println("До сплати: " + sum1);
        }
        System.out.println("Введіть дані для другого товару:");
        int amountOfSecondProduct = scanner.nextInt();


        if (amountOfSecondProduct < amountForSaleSecond){
            sum2 = price2 * amountOfSecondProduct;
            System.out.println("До сплати: " + sum2);
        }
        else if(amountOfSecondProduct >= amountForSaleSecond){
            sum2 = price2 * amountOfSecondProduct * sale2;
            System.out.println("До сплати: " + sum2);
        }

    }
}
