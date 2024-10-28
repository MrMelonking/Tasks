package Lb3.Task2;

public class Rectangle {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    private Line line1;
    private Line line2;
    private Line line3;
    private Line line4;

    private Line diagonal1;

    private Line diagonal2;

    private double degree1;

    private double degree2;

    private double calculatedDiagonal1;

    private double calculatedDiagonal2;



    public Rectangle(Point point1, Point point2, Point point3, Point point4, double degree1, double degree2){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
        line1 = new Line(this.point1, this.point2);
        line2 = new Line(this.point2, this.point3);
        line3 = new Line(this.point3, this.point4);
        line4 = new Line(this.point1, this.point4);
        diagonal1 = new Line(this.point1, this.point3);
        diagonal2 = new Line(this.point2, this.point4);
        this.degree1 = degree1;
        this.degree2 = degree2;
    }
    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public Point getPoint4() {
        return point4;
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

    public void setPoint4(Point point4) {
        this.point4 = point4;
    }

    public Line getLine1() {
        return line1;
    }

    public void setLine1(Line line1) {
        this.line1 = line1;
    }

    public Line getLine2() {
        return line2;
    }

    public void setLine2(Line line2) {
        this.line2 = line2;
    }

    public Line getLine3() {
        return line3;
    }

    public void setLine3(Line line3) {
        this.line3 = line3;
    }

    public Line getLine4() {
        return line4;
    }

    public void setLine4(Line line4) {
        this.line4 = line4;
    }
    public Line getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(Line diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public Line getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(Line diagonal2) {
        this.diagonal2 = diagonal2;
    }





    public void sides (){
        double length1 = line1.lengthOfLine();
        double length2 = line2.lengthOfLine();
        double length3 = line3.lengthOfLine();
        double length4 = line4.lengthOfLine();

        double diagonal1Length = diagonal1.lengthOfLine();
        double diagonal2Length = diagonal2.lengthOfLine();

        System.out.println("Довжина першої лінії: " + length1);
        System.out.println("Довжина другої лінії: " + length2);
        System.out.println("Довжина третьої лінії: " + length3);
        System.out.println("Довжина четвертої лінії: " + length4);
        System.out.println("Довжина першої діагоналі: " + diagonal1Length);
        System.out.println("Довжина другої діагоналі: " + diagonal2Length);

    }

    public double side1 (){
        return line1.lengthOfLine();
    }
    public double side2 (){
        return line2.lengthOfLine();
    }
    public double side3 (){
        return line3.lengthOfLine();
    }
    public double side4 (){
        return line4.lengthOfLine();
    }

    public double diagonal1 () {
        return diagonal1.lengthOfLine();
    }

    public double diagonal2 (){
        return diagonal2.lengthOfLine();
    }



    public void isSquare (){
        if (side1() == side2() && side2() == side3() && side3() == side4() && side1() == side4()){
            System.out.println("Фігура - квадрат");
            System.out.println("Периметр: " + side1() * 4);
            System.out.println("Площа: " + side1() * side1());
            System.out.println("Діагоналі: " + side1() * Math.sqrt(2));
        }
        else if (side1() == side3() && side2() == side4()){
            System.out.println("Фігура - прямокутник");
            System.out.println("Периметр: " + (side1() * 2 + side2() * 2));
            System.out.println("Площа: " + side1() * side2());
            System.out.println("Діагоналі: " + Math.sqrt(Math.pow(side1(), 2)) + Math.pow(side2(), 2));
        }
        else if (side1() == side2() && side2() == side3() && side3() == side4() && side1() == side4() && diagonal1() != diagonal2()){
            System.out.println("Фігура - ромб");
            System.out.println("Периметр: " + (side1() * 4));
            System.out.println("Площа: " + (0.5 * diagonal1() * diagonal2()));
            if (degree1 < 90){
                calculatedDiagonal1 = side1() * Math.sqrt(2+2 * Math.cos(degree1));
                calculatedDiagonal2 = side1() * Math.sqrt(2-2 * Math.cos(degree2));

                System.out.println("Розрахована за кутом діагональ 1: " + calculatedDiagonal1);
                System.out.println("Розрахована за кутом діагональ 2: " + calculatedDiagonal2);
            }
            else if (degree1 > 90){
                calculatedDiagonal1 = side1() * Math.sqrt(2-2 * Math.cos(degree1));
                calculatedDiagonal2 = side1() * Math.sqrt(2+2 * Math.cos(degree2));

                System.out.println("Розрахована за кутом діагональ 1: " + calculatedDiagonal1);
                System.out.println("Розрахована за кутом діагональ 2: " + calculatedDiagonal2);
            }
        }
        else {
            System.out.println("Фігура є чотирикутником, периметр: " + (side1() + side2() + side3() + side4()));
        }
    }

    public double getDegree1() {
        return degree1;
    }

    public void setDegree1(double degree1) {
        this.degree1 = degree1;
    }

    public double getDegree2() {
        return degree2;
    }

    public void setDegree2(double degree2) {
        this.degree2 = degree2;
    }
}
