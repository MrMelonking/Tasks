package Lb3.Task2;

public class IntersectionRectTri {

    private Point rectPoint1;
    private Point rectPoint2;
    private Point rectPoint3;
    private Point rectPoint4;
    private Point triPoint1;
    private Point triPoint2;
    private Point triPoint3;
    private Line rectLine1;
    private Line rectLine2;
    private Line rectLine3;
    private Line rectLine4;
    private Line triLine1;
    private Line triLine2;
    private Line triLine3;

    private double xInterception;
    private double yInterception;


    public IntersectionRectTri(Point rectPoint1, Point rectPoint2, Point rectPoint3, Point rectPoint4, Point triPoint1, Point triPoint2, Point triPoint3 ) {
        this.rectPoint1 = rectPoint1;
        this.rectPoint2 = rectPoint2;
        this.rectPoint3 = rectPoint3;
        this.rectPoint4 = rectPoint4;
        this.triPoint1 = triPoint1;
        this.triPoint2 = triPoint2;
        this.triPoint3 = triPoint3;
        rectLine1 = new Line(this.rectPoint1, this.rectPoint2);
        rectLine2 = new Line(this.rectPoint2, this.rectPoint3);
        rectLine3 = new Line(this.rectPoint3, this.rectPoint4);
        rectLine4 = new Line(this.rectPoint1, this.rectPoint4);

        triLine1 = new Line(this.triPoint1, this.triPoint2);
        triLine2 = new Line(this.triPoint2, this.triPoint3);
        triLine3 = new Line(this.triPoint1, this.triPoint3);
    }

    public Point getRectPoint1() {
        return rectPoint1;
    }

    public void setRectPoint1(Point rectPoint1) {
        this.rectPoint1 = rectPoint1;
    }

    public Point getRectPoint2() {
        return rectPoint2;
    }

    public void setRectPoint2(Point rectPoint2) {
        this.rectPoint2 = rectPoint2;
    }

    public Point getRectPoint3() {
        return rectPoint3;
    }

    public void setRectPoint3(Point rectPoint3) {
        this.rectPoint3 = rectPoint3;
    }

    public Point getRectPoint4() {
        return rectPoint4;
    }

    public void setRectPoint4(Point rectPoint4) {
        this.rectPoint4 = rectPoint4;
    }

    public Point getTriPoint1() {
        return triPoint1;
    }

    public void setTriPoint1(Point triPoint1) {
        this.triPoint1 = triPoint1;
    }

    public Point getTriPoint2() {
        return triPoint2;
    }

    public void setTriPoint2(Point triPoint2) {
        this.triPoint2 = triPoint2;
    }

    public Point getTriPoint3() {
        return triPoint3;
    }

    public void setTriPoint3(Point triPoint3) {
        this.triPoint3 = triPoint3;
    }

    public Line getRectLine1() {
        return rectLine1;
    }

    public void setRectLine1(Line rectLine1) {
        this.rectLine1 = rectLine1;
    }

    public Line getRectLine2() {
        return rectLine2;
    }

    public void setRectLine2(Line rectLine2) {
        this.rectLine2 = rectLine2;
    }

    public Line getRectLine3() {
        return rectLine3;
    }

    public void setRectLine3(Line rectLine3) {
        this.rectLine3 = rectLine3;
    }

    public Line getRectLine4() {
        return rectLine4;
    }

    public void setRectLine4(Line rectLine4) {
        this.rectLine4 = rectLine4;
    }

    public Line getTriLine1() {
        return triLine1;
    }

    public void setTriLine1(Line triLine1) {
        this.triLine1 = triLine1;
    }

    public Line getTriLine2() {
        return triLine2;
    }

    public void setTriLine2(Line triLine2) {
        this.triLine2 = triLine2;
    }

    public Line getTriLine3() {
        return triLine3;
    }

    public void setTriLine3(Line triLine3) {
        this.triLine3 = triLine3;
    }

    public void sides() {
        double rectLength1 = rectLine1.lengthOfLine();
        double rectLength2 = rectLine2.lengthOfLine();
        double rectLength3 = rectLine3.lengthOfLine();
        double rectLength4 = rectLine4.lengthOfLine();

        double triLength1 = triLine1.lengthOfLine();
        double triLength2 = triLine2.lengthOfLine();
        double triLength3 = triLine3.lengthOfLine();

        System.out.println("Довжина першої лінії чотирикутника: " + rectLength1);
        System.out.println("Довжина другої лінії чотирикутника: " + rectLength2);
        System.out.println("Довжина третьої лінії чотирикутника: " + rectLength3);
        System.out.println("Довжина четвертої лінії чотирикутника: " + rectLength4);
        System.out.println("Довжина першої лінії трикутника: " + triLength1);
        System.out.println("Довжина другої лінії трикутника: " + triLength2);
        System.out.println("Довжина третьої лінії трикутника: " + triLength3);
    }

    public double rectSide1(){
        return rectLine1.lengthOfLine();
    }
    public double rectSide2(){
        return rectLine2.lengthOfLine();
    }
    public double rectSide3(){
        return rectLine3.lengthOfLine();
    }
    public double rectSide4(){
        return rectLine4.lengthOfLine();
    }
    public double triSide1(){
        return triLine1.lengthOfLine();
    }
    public double triSide2(){
        return triLine2.lengthOfLine();
    }
    public double triSide3(){
        return triLine3.lengthOfLine();
    }

    public void IntersectionRectTri(){
        double rectSlope1 = (rectPoint2.getY() - rectPoint1.getY()) / (rectPoint2.getX() - rectPoint1.getX());
        double rectIntercept1 = rectPoint1.getY() - rectSlope1 * rectPoint1.getX();

        double rectSlope2 = (rectPoint3.getY() - rectPoint2.getY()) / (rectPoint3.getX() - rectPoint2.getX());
        double rectIntercept2 = rectPoint2.getY() - rectSlope2 * rectPoint2.getX();

        double rectSlope3 = (rectPoint4.getY() - rectPoint3.getY()) / (rectPoint4.getX() - rectPoint3.getX());
        double rectIntercept3 = rectPoint3.getY() - rectSlope3 * rectPoint3.getX();

        double rectSlope4 = (rectPoint4.getY() - rectPoint1.getY()) / (rectPoint4.getX() - rectPoint1.getX());
        double rectIntercept4 = rectPoint1.getY() - rectSlope4 * rectPoint1.getX();

        double triSlope1 = (triPoint2.getY() - triPoint1.getY()) / (triPoint2.getX() - triPoint1.getX());
        double triIntercept1 = triPoint1.getY() - triSlope1 * triPoint1.getX();

        double triSlope2 = (triPoint3.getY() - triPoint2.getY()) / (triPoint3.getX() - triPoint2.getX());
        double triIntercept2 = triPoint2.getY() - triSlope2 * triPoint2.getX();

        double triSlope3 = (triPoint3.getY() - triPoint1.getY()) / (triPoint3.getX() - triPoint1.getX());
        double triIntercept3 = triPoint1.getY() - triSlope3 * triPoint1.getX();

        double[] rectSlopeArray = new double[4];
        rectSlopeArray[0] = rectSlope1;
        rectSlopeArray[1] = rectSlope2;
        rectSlopeArray[2] = rectSlope3;
        rectSlopeArray[3] = rectSlope4;

        double[] rectInterArray = new double[4];
        rectInterArray[0] = rectIntercept1;
        rectInterArray[1] = rectIntercept2;
        rectInterArray[2] = rectIntercept3;
        rectInterArray[3] = rectIntercept4;

        double[] triSlopeArray = new double[3];
        triSlopeArray[0] = triSlope1;
        triSlopeArray[1] = triSlope2;
        triSlopeArray[2] = triSlope3;

        double[] triInterArray = new double[3];
        triInterArray[0] = triIntercept1;
        triInterArray[1] = triIntercept2;
        triInterArray[2] = triIntercept3;

        for (int i = 0; i < rectSlopeArray.length; i++){
            for (int j = 0; j < triSlopeArray.length; j++){
                xInterception = (rectInterArray[i] - triInterArray[j]) / (triSlopeArray[j] - rectSlopeArray[i]);
                yInterception = triSlopeArray[j] * xInterception + triInterArray[j];

                if (xInterception >= 0 || xInterception <= 0) {
                    System.out.println("Перетин по координаті х: " + xInterception);
                    System.out.println("Перетин по координаті у: " + yInterception);
                }
                else {
                    System.out.println("Не перетинається");
                }
            }
        }
    }
}
