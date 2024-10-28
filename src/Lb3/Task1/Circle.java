package Lb3.Task1;

public class Circle {
    double radius;

    Point point;

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

    public Circle (double radius, Point point){
        this.radius = radius;
        this.point = point;
    }

    public double circleLength (){

        double length = radius * 2 * Math.PI;

        return length;
    }

    public double circleArea (){
        double area = radius * radius * Math.PI;

        return area;
    }


}
