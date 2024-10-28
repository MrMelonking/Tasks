package Lb3.Task2;

import java.util.Scanner;

public class Task2 {
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

        System.out.println("Введіть кут для кола: ");
        double circleDegree = scanner.nextDouble();

        System.out.println("Введіть радіус кола:");
        Circle circle = new Circle(scanner.nextDouble(), circlePoint, circleDegree);



        System.out.println("Довжина кола: " + circle.circleLength());

        System.out.println("Площа кола: " + circle.circleArea());

        System.out.println("Хорда: " + circle.chord());

        System.out.println("Введіть точки чотирикутника: ");
        Point rectPoint1 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point rectPoint2 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point rectPoint3 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point rectPoint4 = new Point(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Введіть кути чотирикутника: ");
        double rectDegree1 = scanner.nextDouble();
        double rectDegree2 = scanner.nextDouble();


        Rectangle rectangle = new Rectangle(rectPoint1, rectPoint2, rectPoint3, rectPoint4, rectDegree1, rectDegree2);

        rectangle.isSquare();

        System.out.println("Введіть координати точок трикутника: ");
        Point triPoint1 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point triPoint2 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point triPoint3 = new Point(scanner.nextDouble(), scanner.nextDouble());

        Triangle triangle = new Triangle(triPoint1, triPoint2, triPoint3);

        triangle.triangleFind();

        System.out.println("Введіть координати точки центра круга та його радіус: ");
        Point cirPoint = new Point(scanner.nextDouble(), scanner.nextDouble());
        double radius = scanner.nextDouble();
        System.out.println("Введіть координати точки чотирикутника та його довжину й висоту: ");
        Point rectPoint = new Point(scanner.nextDouble(), scanner.nextDouble());
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        IntersectionRectCir intersectionRectCir = new IntersectionRectCir(cirPoint, radius, rectPoint, length, width);

        System.out.println("Точки перетину: ");

        intersectionRectCir.intersectionRectCir();

        System.out.println("Введіть точки чотирикутника: ");
        Point rectInterPoint1 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point rectInterPoint2 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point rectInterPoint3 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point rectInterPoint4 = new Point(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Введіть точки трикутника: ");
        Point triInterPoint1 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point triInterPoint2 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point triInterPoint3 = new Point(scanner.nextDouble(), scanner.nextDouble());

        IntersectionRectTri intersectionRectTri = new IntersectionRectTri(rectInterPoint1, rectInterPoint2, rectInterPoint3, rectInterPoint4, triInterPoint1, triInterPoint2, triInterPoint3);

        System.out.println("Точки перетину: ");
        intersectionRectTri.IntersectionRectTri();
        
    }


}

