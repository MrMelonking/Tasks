package Lb3.Task1;

public class Line{
     private Point point1;
     private Point point2;

    public void setPoint1 (Point point1){
        this.point1 = point1;
    }

    public void setPoint2 (Point point2){
        this.point2 = point2;
    }

    public Line (Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1 (){
        return point1;
    }

    public Point getPoint2 (){
        return point2;
    }

    @Override
    public String toString() {
        return "Line: Point1:" + point1 + ", Point2=" + point2 + "]";
    }

    public double lengthOfLine (){
        double x1 = point1.getX();
        double y1 = point1.getY();
        double x2 = point2.getX();
        double y2 = point2.getY();
        double length = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));

        return length;
    }

}
