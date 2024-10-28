package Test;

public class Task_2 {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Circle circle = new Circle(p1, 5);
        Square square = new Square(p1, 4);
        Rhombus rhombus = new Rhombus(p1, 6, 4);
        Rectangle rectangle = new Rectangle(p1, 6, 4);
        Triangle triangle = new Triangle(p1, p2, new Point(2, 5));

        System.out.println(circle);
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Chord length (distance from center 3): " + circle.getChordLength(3));

        System.out.println(square);
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("Area: " + square.getArea());
        System.out.println("Diagonal length: " + square.getDiagonalLength());

        System.out.println(rhombus);
        System.out.println("Perimeter: " + rhombus.getPerimeter());
        System.out.println("Area: " + rhombus.getArea());
        System.out.println("Diagonal lengths: " + rhombus.getDiagonal1Length() + ", " + rhombus.getDiagonal2Length());

        System.out.println(rectangle);
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Diagonal length: " + rectangle.getDiagonalLength());

        System.out.println(triangle);
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Heights: " + triangle.getHeightA() + ", " + triangle.getHeightB() + ", " + triangle.getHeightC());
        System.out.println("Medians: " + triangle.getMedianA() + ", " + triangle.getMedianB() + ", " + triangle.getMedianC());
    }
}

class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point (" + x + ", " + y + ")";
    }
}

class LineSegment {
    private Point start, end;

    public LineSegment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double getPerimeter() {
        return distance(start, end);
    }

    public double getArea() {
        return 0;
    }

    private double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    @Override
    public String toString() {
        return "Line Segment from " + start + " to " + end;
    }
}

class Polyline {
    private Point[] points;

    public Polyline(Point[] points) {
        this.points = points;
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public double getPerimeter() {
        double perimeter = 0;
        for (int i = 1; i < points.length; i++) {
            perimeter += distance(points[i], points[i - 1]);
        }
        return perimeter;
    }

    public double getArea() {
        return 0;
    }

    private double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Polyline through points: ");
        for (Point p : points) {
            sb.append(p).append(" ");
        }
        return sb.toString();
    }
}

class Circle {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getChordLength(double distanceFromCenter) {
        return 2 * Math.sqrt(radius * radius - distanceFromCenter * distanceFromCenter);
    }

    @Override
    public String toString() {
        return "Circle with center at " + center + " and radius " + radius;
    }
}

class Square {
    private Point topLeft;
    private int sideLength;

    public Square(Point topLeft, int sideLength) {
        this.topLeft = topLeft;
        this.sideLength = sideLength;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public double getPerimeter() {
        return 4 * sideLength;
    }

    public double getArea() {
        return Math.pow(sideLength, 2);
    }

    public double getDiagonalLength() {
        return Math.sqrt(2) * sideLength;
    }

    @Override
    public String toString() {
        return "Square with top-left corner at " + topLeft + " and side length " + sideLength;
    }
}

class Rhombus {
    private Point center;
    private int diagonal1, diagonal2;

    public Rhombus(Point center, int diagonal1, int diagonal2) {
        this.center = center;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(int diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public int getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(int diagonal2) {
        this.diagonal2 = diagonal2;
    }

    public double getPerimeter() {
        double halfD1 = diagonal1 / 2.0;
        double halfD2 = diagonal2 / 2.0;
        return 4 * Math.sqrt(halfD1 * halfD1 + halfD2 * halfD2);
    }

    public double getArea() {
        return (diagonal1 * diagonal2) / 2.0;
    }

    public double getDiagonal1Length() {
        return diagonal1;
    }

    public double getDiagonal2Length() {
        return diagonal2;
    }

    @Override
    public String toString() {
        return "Rhombus with center at " + center + " and diagonals " + diagonal1 + " and " + diagonal2;
    }
}

class Rectangle {
    private Point topLeft;
    private int width, height;

    public Rectangle(Point topLeft, int width, int height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return width * height;
    }

    public double getDiagonalLength() {
        return Math.sqrt(width * width + height * height);
    }

    @Override
    public String toString() {
        return "Rectangle with top-left corner at " + topLeft + ", width " + width + " and height " + height;
    }
}

class Triangle {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public double getPerimeter() {
        return distance(a, b) + distance(b, c) + distance(c, a);
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - distance(a, b)) * (s - distance(b, c)) * (s - distance(c, a)));
    }

    private double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    public double getHeightA() {
        return 2 * getArea() / distance(b, c);
    }

    public double getHeightB() {
        return 2 * getArea() / distance(a, c);
    }

    public double getHeightC() {
        return 2 * getArea() / distance(a, b);
    }

    public double getMedianA() {
        return Math.sqrt(2 * distance(b, c) * distance(b, c) + 2 * distance(a, c) * distance(a, c) - distance(a, b) * distance(a, b)) / 2;
    }

    public double getMedianB() {
        return Math.sqrt(2 * distance(a, c) * distance(a, c) + 2 * distance(a, b) * distance(a, b) - distance(b, c) * distance(b, c)) / 2;
    }

    public double getMedianC() {
        return Math.sqrt(2 * distance(a, b) * distance(a, b) + 2 * distance(b, c) * distance(b, c) - distance(a, c) * distance(a, c)) / 2;
    }

    @Override
    public String toString() {
        return "Triangle with vertices at " + a + ", " + b + ", and " + c;
    }
}