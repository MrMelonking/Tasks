package Lb3.Task2;

public class IntersectionRectCir{

    private Point cirPoint;


    private Point topRectPoint;

    private double rectLength;

    private double rectWidth;

    private double radius;


    public IntersectionRectCir(Point cirPoint, double radius, Point topRectPoint, double rectLength, double rectWidth) {
        this.cirPoint = cirPoint;
        this.topRectPoint = topRectPoint;
        this.rectLength = rectLength;
        this.rectWidth = rectWidth;
        this.radius = radius;
    }

    public Point getCirPoint() {
        return cirPoint;
    }

    public void setCirPoint(Point cirPoint) {
        this.cirPoint = cirPoint;
    }

    public Point getTopRectPoint() {
        return topRectPoint;
    }

    public void setTopRectPoint(Point topRectPoint) {
        this.topRectPoint = topRectPoint;
    }

    public double getRectLength() {
        return rectLength;
    }

    public void setRectLength(double rectLength) {
        this.rectLength = rectLength;
    }

    public double getRectWidth() {
        return rectWidth;
    }

    public void setRectWidth(double rectWidth) {
        this.rectWidth = rectWidth;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void intersectionRectCir(){
        double closestX = Math.max(topRectPoint.getX(), Math.min(cirPoint.getX(), topRectPoint.getX()) + rectWidth);
        double closestY = Math.max(topRectPoint.getY() - rectLength, Math.min(cirPoint.getY(), topRectPoint.getY()));

        double distanceX = cirPoint.getX() - closestX;
        double distanceY = cirPoint.getY() - closestY;

        // Перевіряємо, чи центр кола знаходиться всередині прямокутника або на його межі
        if ((distanceX * distanceX + distanceY * distanceY) < (radius * radius)) {
            System.out.println("Центр кола перетинає прямокутник.");
            System.out.println("Точка перетину: (" + closestX + ", " + closestY + ")");
        } else {
            System.out.println("Центр кола не перетинає прямокутник.");
        }
    }
}
