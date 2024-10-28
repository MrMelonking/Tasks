package Lb1.test;

import java.awt.*;
import java.awt.event.*;

public class LineCircleIntersection extends Frame implements ActionListener {
    Label lineLabel, circleLabel, resultLabel;
    TextField lineX1, lineY1, lineX2, lineY2, circleX, circleY, circleR;
    Button calculateButton;

    public LineCircleIntersection() {
        setLayout(new FlowLayout());

        lineLabel = new Label("Line (x1, y1), (x2, y2):");
        add(lineLabel);

        lineX1 = new TextField(5);
        add(lineX1);
        lineY1 = new TextField(5);
        add(lineY1);
        lineX2 = new TextField(5);
        add(lineX2);
        lineY2 = new TextField(5);
        add(lineY2);

        circleLabel = new Label("Circle (x, y), r:");
        add(circleLabel);

        circleX = new TextField(5);
        add(circleX);
        circleY = new TextField(5);
        add(circleY);
        circleR = new TextField(5);
        add(circleR);

        calculateButton = new Button("Calculate");
        add(calculateButton);
        calculateButton.addActionListener(this);

        resultLabel = new Label("Result:");
        add(resultLabel);

        setSize(300, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double x1, y1, x2, y2, cx, cy, r;
        try {
            x1 = Double.parseDouble(lineX1.getText());
            y1 = Double.parseDouble(lineY1.getText());
            x2 = Double.parseDouble(lineX2.getText());
            y2 = Double.parseDouble(lineY2.getText());
            cx = Double.parseDouble(circleX.getText());
            cy = Double.parseDouble(circleY.getText());
            r = Double.parseDouble(circleR.getText());
        }
        catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input");
            return;
        }

        double dx = x2 - x1;
        double dy = y2 - y1;
        double a = dx * dx + dy * dy;
        double b = 2 * (dx * (x1 - cx) + dy * (y1 - cy));
        double c = (x1 - cx) * (x1 - cx) + (y1 - cy) * (y1 - cy) - r * r;
        double d = b * b - 4 * a * c;

        if (d < 0) {
            resultLabel.setText("No intersection");
        } else if (d == 0) {
            double t = -b / (2 * a);
            double xi = x1 + t * dx;
            double yi = y1 + t * dy;
            resultLabel.setText("Intersection: (" + xi + ", " + yi + ")");
        } else {
            double t1 = (-b + Math.sqrt(d)) / (2 * a);
            double t2 = (-b - Math.sqrt(d)) / (2 * a);
            double xi1 = x1 + t1 * dx;
            double yi1 = y1 + t1 * dy;
            double xi2 = x1 + t2 * dx;
            double yi2 = y1 + t2 * dy;
            resultLabel.setText("Intersections: (" + xi1 + ", " + yi1 + "), (" + xi2 + ", " + yi2 + ")");
        }
    }

    public static void main(String[] args) {
        new LineCircleIntersection();
    }
}
