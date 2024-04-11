package Lb1.task9;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double price1 = 50.9;
        double sale1 = 0.3;
        int amountForSaleFirst = 100;
        double sum1;

        double price2 = 62.42;
        double sale2 = 0.1;
        int amountForSaleSecond = 150;
        double sum2;


        System.out.println("Введіть дані для першого товару:");
        int amountOfFirstProduct = Integer.parseInt(reader.readLine());

        if (amountOfFirstProduct < amountForSaleFirst){
            sum1 = price1 * amountOfFirstProduct;
            System.out.println("До сплати: " + sum1);
        }
        else if(amountOfFirstProduct >= amountForSaleFirst){
            sum1 = price1 * amountOfFirstProduct * sale1;
            System.out.println("До сплати: " + sum1);
        }
        System.out.println("Введіть дані для другого товару:");
        int amountOfSecondProduct = Integer.parseInt(reader.readLine());


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
