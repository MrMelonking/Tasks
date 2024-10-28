package Lb2.Task10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість стовпців:");
        int rows = scanner.nextInt();
        System.out.println("Введіть кількість рядків:");
        int columns = scanner.nextInt();

        double[][] matrix = new double[rows][columns];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        Matrix matr = new Matrix(matrix);

        System.out.println("Матриця: ");
        System.out.println(matr);

        System.out.println("Транспонована матриця: ");
        System.out.println(matr.transpose());
    }

}
