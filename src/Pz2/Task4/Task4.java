package Pz2.Task4;
import Pz2.Task3.Point;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        Point[] vertices1 = {new Point(3, 1), new Point(4, 4), new Point(1, 3)};
        Triangle triangle1 = new Triangle(vertices1);

        Point[] vertices2 = {new Point(5, 4), new Point(9, 1), new Point(2, 2)};
        Triangle triangle2 = new Triangle(vertices2);

        System.out.println("Сторони першого трикутника: " + Arrays.toString(triangle1.calculateSideLengths()));
        System.out.println("Сторони другого трикутника: " + Arrays.toString(triangle2.calculateSideLengths()));

        System.out.println("Периметр першого трикутника: " + triangle1.calculatePerimeter());
        System.out.println("Периметр другоог трикутника: " + triangle2.calculatePerimeter());

        System.out.println("Площа першого трикутника: " + triangle1.calculateArea());
        System.out.println("Площа другого трикутника: " + triangle2.calculateArea());
    }
}
