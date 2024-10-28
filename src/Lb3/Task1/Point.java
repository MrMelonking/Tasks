package Lb3.Task1;

public class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public String pointInQudrant() {
        String res;
        if (x >= 0)
            if (y >= 0)
                res = "I qudrant";
            else
                res = "IV qudrant";
        else if (y >= 0)
            res = "II qudrant";
        else
            res = "III qudrant";
        return res;
    }
    @Override
    public String toString() {
        return "Point2D [x=" + x + ", y=" + y + "]";
    }

}
