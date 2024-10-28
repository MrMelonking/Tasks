package Lb4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Task {
    public static void main(String[] args) {
        Frame frame = new Frame("Розрахунок точок перетину лінії та кола");
        frame.setBackground(new Color(0xdddddd));
        frame.setSize(800, 800);
        frame.setLayout(null);
        frame.setVisible(true);

        Label linePoint1Label = new Label("Координати початку лінії:");
        frame.add(linePoint1Label);
        linePoint1Label.setLocation(8, 30);
        linePoint1Label.setSize(150, 20);

        TextField linePoint1TextFieldX = new TextField("0");
        frame.add(linePoint1TextFieldX);
        linePoint1TextFieldX.setLocation(8 + 160, 30);
        linePoint1TextFieldX.setSize(40, 20);

        TextField linePoint1TextFieldY = new TextField("0");
        frame.add(linePoint1TextFieldY);
        linePoint1TextFieldY.setLocation(8 + 210, 30);
        linePoint1TextFieldY.setSize(40, 20);

        Label linePoint2Label = new Label("Координати кінця лінії:");
        frame.add(linePoint2Label);
        linePoint2Label.setLocation(8, 60);
        linePoint2Label.setSize(150, 20);

        TextField linePoint2TextFieldX = new TextField("0");
        frame.add(linePoint2TextFieldX);
        linePoint2TextFieldX.setLocation(8 + 160, 60);
        linePoint2TextFieldX.setSize(40, 20);

        TextField linePoint2TextFieldY = new TextField("0");
        frame.add(linePoint2TextFieldY);
        linePoint2TextFieldY.setLocation(8 + 210, 60);
        linePoint2TextFieldY.setSize(40, 20);

        Label circleCenterLabel = new Label("Координати центру кола:");
        frame.add(circleCenterLabel);
        circleCenterLabel.setLocation(8, 90);
        circleCenterLabel.setSize(150, 20);

        TextField circleCenterTextFieldX = new TextField("0");
        frame.add(circleCenterTextFieldX);
        circleCenterTextFieldX.setLocation(8 + 160, 90);
        circleCenterTextFieldX.setSize(40, 20);

        TextField circleCenterTextFieldY = new TextField("0");
        frame.add(circleCenterTextFieldY);
        circleCenterTextFieldY.setLocation(8 + 210, 90);
        circleCenterTextFieldY.setSize(40, 20);

        Label circleRadiusLabel = new Label("Радіус кола:");
        frame.add(circleRadiusLabel);
        circleRadiusLabel.setLocation(8, 120);
        circleRadiusLabel.setSize(150, 20);

        TextField circleRadiusTextField = new TextField("0");
        frame.add(circleRadiusTextField);
        circleRadiusTextField.setLocation(8 + 160, 120);
        circleRadiusTextField.setSize(40, 20);

        Button calculateButton = new Button("Розрахувати");
        frame.add(calculateButton);
        calculateButton.setLocation(8 + 160, 150);
        calculateButton.setSize(80, 20);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int linePoint1X = Integer.parseInt(linePoint1TextFieldX.getText());
                int linePoint1Y = Integer.parseInt(linePoint1TextFieldY.getText());
                int linePoint2X = Integer.parseInt(linePoint2TextFieldX.getText());
                int linePoint2Y = Integer.parseInt(linePoint2TextFieldY.getText());
                int circleCenterX = Integer.parseInt(circleCenterTextFieldX.getText());
                int circleCenterY = Integer.parseInt(circleCenterTextFieldY.getText());
                int circleRadius = Integer.parseInt(circleRadiusTextField.getText());

                double[] result = calculateIntersectionPoints(linePoint1X, linePoint1Y, linePoint2X, linePoint2Y, circleCenterX, circleCenterY, circleRadius);

                Label resultLabel = new Label("", Label.CENTER);
                frame.add(resultLabel);
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
}

