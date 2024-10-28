package Pz2.Task4;

import Pz2.Task3.Polygon;
import Pz2.Task3.Point;

import java.util.Arrays;

public class Triangle extends Polygon {
    Point[] vertices;
    public Triangle(Point[] vertices) {
        super(vertices);
        this.vertices = vertices;
    }
    @Override
    public Point[] getVertices() {
        return vertices;
    }
    @Override
    public void setVertices(Point[] vertices) {
        this.vertices = vertices;
    }
    @Override
    public String toString() {
        return "Вершини трикутника: " + Arrays.toString(vertices);
    }

    @Override
    public double[] calculateSideLengths() {
        double[] sideLengths = new double[3];

        sideLengths[0] = Math.sqrt((vertices[1].getX() - vertices[0].getX()) * (vertices[1].getX() - vertices[0].getX()) + (vertices[1].getY() - vertices[0].getY()) * (vertices[1].getY() - vertices[0].getY()));
        sideLengths[1] = Math.sqrt((vertices[2].getX() - vertices[1].getX()) * (vertices[2].getX() - vertices[1].getX()) + (vertices[2].getY() - vertices[1].getY()) * (vertices[2].getY() - vertices[1].getY()));
        sideLengths[2] = Math.sqrt((vertices[0].getX() - vertices[2].getX()) * (vertices[0].getX() - vertices[2].getX()) + (vertices[0].getY() - vertices[2].getY()) * (vertices[0].getY() - vertices[2].getY()));

        return sideLengths;
    }

    public double calculatePerimeter() {
        double[] sideLengths = calculateSideLengths();
        double perimeter = 0;

        for (double sideLength : sideLengths) {
            perimeter += sideLength;
        }

        return perimeter;
    }

    public double calculateArea() {
        double[] sideLengths = calculateSideLengths();
        double perimeter = calculatePerimeter() / 2; // Calculate half of the perimeter
        double area = Math.sqrt(perimeter * (perimeter - sideLengths[0]) * (perimeter - sideLengths[1]) * (perimeter - sideLengths[2]));

        return area;
    }

}
