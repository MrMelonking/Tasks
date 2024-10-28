package Lb2.Task10;

public class Matrix {
    private double[][] elements;


    public Matrix(double[][] elements) {
        this.elements = elements;
    }

    public double getElement(int row, int col) {
        return elements[row][col];
    }

    public void setElement(int row, int col, double value) {
        elements[row][col] = value;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (double[] row : elements) {
            for (double element : row) {
                str.append(element).append(" ");
            }
            str.append("\n");
        }
        return str.toString();
    }

    public int getRowCount() {
        return elements.length;
    }

    public int getColumnCount() {
        if (getRowCount() == 0) {
            return 0;
        }
        return elements[0].length;
    }

    public Matrix transpose() {
        double[][] transposedElements = new double[getColumnCount()][getRowCount()];
        for (int i = 0; i < getRowCount(); i++) {
            for (int j = 0; j < getColumnCount(); j++) {
                transposedElements[j][i] = elements[i][j];
            }
        }
        return new Matrix(transposedElements);
    }
}
