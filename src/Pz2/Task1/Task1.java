package Pz2.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть дійсну та уявну частини для першого числа: ");

        double realPartFirst = scanner.nextDouble();
        double imaginaryPartFirst = scanner.nextDouble();

        System.out.println("Введіть дійсну та уявну частини для другого числа: ");

        double realPartSecond = scanner.nextDouble();
        double imaginaryPartSecond = scanner.nextDouble();

        System.out.println("Введіть модуль та аргумент третього числа: ");
        double modulusFirst = scanner.nextDouble();
        Double argumentFirst = scanner.nextDouble();

        System.out.println("Введіть модуль та аргумент четвертого числа: ");
        double modulusSecond = scanner.nextDouble();
        Double argumentSecond = scanner.nextDouble();


        ComplexNumber complexNumberRealIm1 = new ComplexNumber(realPartFirst, imaginaryPartFirst);
        ComplexNumber complexNumberRealIm2 = new ComplexNumber(realPartSecond, imaginaryPartSecond);

        ComplexNumber complexNumberModArg1 = new ComplexNumber(modulusFirst, argumentFirst);
        ComplexNumber complexNumberModArg2 = new ComplexNumber(modulusSecond, argumentSecond);

        System.out.println("Перше комплексне чисно через дійсну та уявну частини: " + complexNumberRealIm1);
        System.out.println("Друге комплексне чисно через дійсну та уявну частини: " + complexNumberRealIm2);
        System.out.println("Перше комплексне чисно через модуль та аргумент: " + complexNumberModArg1);
        System.out.println("Друге комплексне чисно через модуль та аргумент: " + complexNumberModArg2);

        System.out.println("Модуль першого комплексного числа: " + complexNumberRealIm1.module());
        System.out.println("Аргумент першого комплексного числа: " + complexNumberRealIm1.argument());

        System.out.println();

        System.out.println("Операції над числами за дійсною та уявною частинами: ");
        System.out.println("Додавання: " + complexNumberRealIm1.add(complexNumberRealIm2));
        System.out.println("Віднімання: " + complexNumberRealIm1.subtract(complexNumberRealIm2));
        System.out.println("Множення: " + complexNumberRealIm1.multiply(complexNumberRealIm2));
        System.out.println("Ділення: " + complexNumberRealIm1.divide(complexNumberRealIm2));

        System.out.println("Градусна міра другого числа: " + complexNumberRealIm2.degree());

        System.out.println("Корінь дургого числа: " + complexNumberRealIm2.root(2));

        System.out.println("");

        System.out.println("Операції над числами за модулем та аргументом: ");
        System.out.println("Додавання: " + complexNumberModArg1.add(complexNumberModArg2));
        System.out.println("Віднімання: " + complexNumberModArg1.subtract(complexNumberModArg2));
        System.out.println("Множення: " + complexNumberModArg1.multiply(complexNumberModArg2));
        System.out.println("Ділення: " + complexNumberModArg1.divide(complexNumberModArg2));
    }
}
