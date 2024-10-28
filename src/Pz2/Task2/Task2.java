package Pz2.Task2;

public class Task2 {
    public static void main(String[] args)  {
        double[] elements = {15, 22, 12, 53,
                            23, 51, 7, 2,
                            9, 52, 74, -2,
                            4, -4, 2, 16};
        Matrix matrix = new Matrix(elements, 4, 4);

        System.out.println("Матриця :");
        System.out.println(matrix);

        System.out.println("Транспонована матриця:");
        System.out.println(matrix.transpose());

        System.out.println("Визначник: " + matrix.determinant());
        System.out.println("Ранг: " + matrix.rank());
        matrix = matrix.addRow(0, new double[]{16, 12, 10, 51});
        System.out.println("Матриця після додавання рядка:");
        System.out.println(matrix);

        matrix = matrix.removeRow(1);
        System.out.println("Матриця після видалення рядка:");
        System.out.println(matrix);

        matrix = matrix.addColumn(0, new double[]{10, 11, 12, 52});
        System.out.println("Матриця після додавання стовпця:");
        System.out.println(matrix);
    }
}
