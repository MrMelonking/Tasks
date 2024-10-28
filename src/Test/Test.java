package Test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static java.lang.Math.*;

class IntersectionPointCalculator extends Frame {
    private TextField tfPoint1X, tfPoint1Y, tfPoint2X, tfPoint2Y,
            tfCenterX, tfCenterY, tfRadius, tfResult1, tfResult2;

    public IntersectionPointCalculator() {
        GridLayout layout = new GridLayout(8, 2);

        add(new Label("Point 1 (x, y):"));
        add(new Label("Point 2 (x, y):"));

        tfPoint1X = new TextField();
        tfPoint2X = new TextField();

        tfPoint1Y = new TextField();
        tfPoint2Y = new TextField();

        add(tfPoint1X);
        add(tfPoint1Y);

        add(tfPoint2X);
        add(tfPoint2Y);

        add(new Label("Circle (center x, y, radius):"));
        tfRadius = new TextField();
        tfCenterX = new TextField();
        tfCenterY = new TextField();

        add(tfCenterX);
        add(tfCenterY);
        add(tfRadius);

        add(new Label("Result 1:"));
        tfResult1 = new TextField();
        tfResult1.setEditable(false);
        add(tfResult1);

        add(new Label("Result 2:"));
        tfResult2 = new TextField();
        tfResult2.setEditable(false);
        add(tfResult2);

        Button calculateButton = new Button("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //calculateIntersectionPoints();
            }
        });
        add(calculateButton);

        pack();
        setVisible(true);
       /* calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int linePoint1X = Integer.parseInt(tfPoint1X.getText());
                int linePoint1Y = Integer.parseInt(tfPoint2X.getText());
                int linePoint2X = Integer.parseInt(tfPoint1Y.getText());
                int linePoint2Y = Integer.parseInt(tfPoint2Y.getText());
                int circleCenterX = Integer.parseInt(tfRadius.getText());
                int circleCenterY = Integer.parseInt(tfCenterX.getText());
                int circleRadius = Integer.parseInt(tfCenterY.getText());

                double[] result = calculateIntersectionPoints(linePoint1X, linePoint1Y, linePoint2X, linePoint2Y, circleCenterX, circleCenterY, circleRadius);

                Label resultLabel = new Label("", Label.CENTER);
                layout.add(resultLabel);
                resultLabel.setLocation(8, 180);
                resultLabel.setSize(1000, 20);

                if (result[0] == -1 && result[1] == -1 && result[2] == -1 && result[3] == -1) {
                    resultLabel.setText("Точки перетину відсутні.");
                } else {
                    resultLabel.setText("Точки перетину: (" + result[0] + ", " + result[1] + ") and (" + result[2] + ", " + result[3] + ")");
                }
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }



    private static double[] calculateIntersectionPoints(int linePoint1X, int linePoint1Y, int linePoint2X, int linePoint2Y, int circleCenterX, int circleCenterY, int circleRadius) {
        double[] result = new double[4];

        double a = linePoint2Y - linePoint1Y;
        double b = linePoint1X - linePoint2X;
        double c = a * linePoint1X + b * linePoint1Y;

        double discriminant = b * b - a * a + 2 * a * circleCenterX - 2 * b * circleCenterY + circleRadius * circleRadius;

        if (discriminant < 0) {
            result[0] = -1;
            result[1] = -1;
            result[2] = -1;
            result[3] = -1;
        } else {
            double sqrtDiscriminant = Math.sqrt(discriminant);
            double x1 = (-b * circleCenterY + a * (sqrtDiscriminant - a * circleCenterX) + sqrtDiscriminant * circleRadius) / (a * a + b * b);
            double y1 = a * x1 + c;
            double x2 = (-b * circleCenterY + a * (sqrtDiscriminant + a * circleCenterX) - sqrtDiscriminant * circleRadius) / (a * a + b * b);
            double y2 = a * x2 + c;

            result[0] = x1;
            result[1] = y1;
            result[2] = x2;
            result[3] = y2;
        }
        return result;
    }
    */

       /* public static void main (String[]args){
            new IntersectionPointCalculator();

        }*/
    }
}

