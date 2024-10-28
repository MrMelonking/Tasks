package Lb3.Task1;

public class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;

    private Line line1;
    private Line line2;
    private Line line3;

    public Triangle (Point point1, Point point2, Point point3){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        line1 = new Line(this.point1, this.point2);
        line2 = new Line(this.point2, this.point3);
        line3 = new Line(this.point3, this.point1);
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point1;
    }

    public Point getPoint3() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public Line getLine1() {
        return line1;
    }

    public Line getLine2() {
        return line2;
    }

    public Line getLine3() {
        return line3;
    }

    public void setLine1(Line line1) {
        this.line1 = line1;
    }

    public void setLine2(Line line2) {
        this.line2 = line2;
    }

    public void setLine3(Line line3) {
        this.line3 = line3;
    }

    public void sides() {
        double length1 = line1.lengthOfLine();
        double length2 = line2.lengthOfLine();
        double length3 = line3.lengthOfLine();


        System.out.println("Довжина першої лінії: " + length1);
        System.out.println("Довжина другої лінії: " + length2);
        System.out.println("Довжина третьої лінії: " + length3);

    }

    public double side1(){
        return line1.lengthOfLine();
    }
    public double side2(){
        return line2.lengthOfLine();
    }
    public double side3(){
        return line3.lengthOfLine();
    }

    public double perimeter (){
        return side1() + side2() + side3();
    }

    public void triangleFind (){
        System.out.println("Периметр трикутника: " + (side1() + side2() + side3()));
        System.out.println("Площа трикутника: " + Math.sqrt((perimeter()/2) * ((perimeter()/2) - side1()) * ((perimeter()/2) - side2()) * ((perimeter()/2) - side3())));
    }
}
