package Lb3.Task2;

public class Circle {
    private double radius;

    private Point point;

    private double degree;

    public void setRadius (double radius){
        this.radius = radius;
    }

    public void  setPoint (Point point){
        this.point = point;
    }

    public double getRadius (){
        return radius;
    }

    public Point getPoint(){
        return point;
    }

    public Circle (double radius, Point point, double degree){
        this.radius = radius;
        this.point = point;
        this.degree = degree;
    }

    public double circleLength (){

        double length = radius * 2 * Math.PI;

        return length;
    }

    public double circleArea (){
        double area = radius * radius * Math.PI;

        return area;
    }

    public double chord() {
        return 2 * radius * Math.sin(degree/2);
    }


    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }
}
