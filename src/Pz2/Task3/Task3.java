package Pz2.Task3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Point[] points1 = {new Point(5, 3), new Point(1, 5), new Point(2, 3)};
        Polygon polygon1 = new Polygon(points1);

        Point[] points2 = {new Point(3, 5), new Point(2, 6), new Point(8, 2), new Point(-5, -5)};
        Polygon polygon2 = new Polygon(points2);

        System.out.println("Чи являється перший багатокутник опуклим: " + polygon1.isConvex() + "Чи являється другий багатокутник опуклим: " + polygon2.isConvex());

        System.out.println("Довжини сторін першого багатокутника: " + Arrays.toString(polygon1.calculateSideLengths()));
        System.out.println("Довжини сторін другого багатокутника: " + Arrays.toString(polygon2.calculateSideLengths()));

        System.out.println("Діагоналі першого багатокутника: " + Arrays.toString(polygon1.calculateDiagonalLengths()));
        System.out.println("Діагоналі другого багатокутника" + Arrays.toString(polygon2.calculateDiagonalLengths()));

        System.out.println("Кути першого багатокутника" + Arrays.toString(polygon1.calculateAngles()));
        System.out.println("Кути другого багатокутника" + Arrays.toString(polygon2.calculateAngles()));

        System.out.println("Висоти першого багатокутника" + Arrays.toString(polygon1.calculateHeights()));
        System.out.println("Висоти другого багатокутника" + Arrays.toString(polygon2.calculateHeights()));

        System.out.println("Медіани першого багатокутника" + Arrays.toString(polygon1.calculateMedians()));
        System.out.println("Медіани другого багатокутника" + Arrays.toString(polygon2.calculateMedians()));
    }
}
