package Lb3.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть координати першої точки: ");
        Point pointLine1 = new Point(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Введіть координати другої точки: ");
        Point pointLine2 = new Point(scanner.nextDouble(), scanner.nextDouble());

        Line line = new Line(pointLine1, pointLine2);

        System.out.println("Довжина лінії: " + line.lengthOfLine());

        System.out.println("Введіть координати центра кола: ");
        Point circlePoint = new Point(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Введіть радіус кола:");
        Circle circle = new Circle(scanner.nextDouble(), circlePoint);

        System.out.println("Довжина кола: " + circle.circleLength());

        System.out.println("Площа кола: " + circle.circleArea());

        System.out.println("Введіть точки чотирикутника: ");
        Point rectPoint1 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point rectPoint2 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point rectPoint3 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point rectPoint4 = new Point(scanner.nextDouble(), scanner.nextDouble());


        Rectangle rectangle = new Rectangle(rectPoint1, rectPoint2, rectPoint3, rectPoint4);

        rectangle.isSquare();

        System.out.println("Введіть координати точок трикутника: ");
        Point triPoint1 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point triPoint2 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point triPoint3 = new Point(scanner.nextDouble(), scanner.nextDouble());

        Triangle triangle = new Triangle(triPoint1, triPoint2, triPoint3);

        triangle.perimeter();
        triangle.triangleFind();
    }
}
