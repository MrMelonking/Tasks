package Lb1.task1;


public class Task1 {
    public static void main(String[] args) {


        int number1 = 3;
        int number2 = 6;
        float number3 = 5.1f;
        float number4 = 10.4f;

        int sumInt = number1 + number2;
        System.out.println(sumInt);
        int substrInt = number2 - number1;
        System.out.println(substrInt);
        int multiInt = number1 * number2;
        System.out.println(multiInt);
        int diviInt = number2 / number1;
        System.out.println(diviInt);

        System.out.println();

        float sumFloat = number3 + number4;
        System.out.println(sumFloat);
        float substrFloat = number4 - number3;
        System.out.println(substrFloat);
        float multiFloat = number3 * number4;
        System.out.println(multiFloat);
        float diviFloat = number4 / number3;
        System.out.println(diviFloat);

        System.out.println();

        float substrIntFloat = number4 - number1;
        System.out.println(substrIntFloat);
        float multiIntFloat = number3 * number2;
        System.out.println(multiIntFloat);
    }


}
