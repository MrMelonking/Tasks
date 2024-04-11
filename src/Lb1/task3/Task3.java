package Lb1.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
   public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number = reader.readLine();

        int numberInt = Integer.parseInt(number);

        if (numberInt % 2 == 0){
            System.out.println("Число парне");
        }
        else System.out.println("Число непарне");
    }
}
