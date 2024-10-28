package Pz2.Task2;

public class Matrix {
    private double[] elements;
    private int rows;
    private int columns;

    public Matrix(double[] elements, int rows, int columns) {
        this.elements = elements;
        this.rows = rows;
        this.columns = columns;
    }

    public double[] getElements() {
        return elements;
    }

    public void setElements(double[] elements) {
        this.elements = elements;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < elements.length; i++) {
            if (i % columns == 0) {
                sb.append("\n");
            }
            sb.append(elements[i]).append(" ");
        }
        return sb.toString();
    }

    public Matrix transpose() {
        double[] newElements = new double[rows * columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newElements[i + j * rows] = elements[j + i * columns];
            }
        }
        return new Matrix(newElements, columns, rows);
    }

    public double determinant() {
        if (rows != columns) {
            throw new IllegalArgumentException("Матриця має мати однакову кількість рядків і стовпців для отримання визначника");
        }
        if (rows == 1) {
            return elements[0];
        }
        if (rows == 2) {
            return elements[0] * elements[3] - elements[1] * elements[2];
        }
        double det = 0;
        for (int i = 0; i < columns; i++) {
            det += Math.pow(-1, i) * elements[i] * submatrix(0, i).determinant();
        }
        return det;
    }

    public int rank() {
        int r = 0;
        for (int i = 0; i < rows && i < columns; i++) {
            if (Math.abs(determinant()) > 1e-10) {
                r++;
            }
            elements = transpose().elements;
            rows = columns;
            columns = elements.length / rows;
        }
        return r;
    }

    public Matrix addRow(int row, double[] newRow) {
        if (columns != newRow.length) {
            throw new IllegalArgumentException("Новий рядок повинен містити кількість елементів рівну кількості стовбців");
        }
        double[] newElements = new double[elements.length + columns];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        for (int i = 0; i < columns; i++) {
            newElements[row * columns + i] = newRow[i];
        }
        return new Matrix(newElements, rows + 1, columns);
    }

    public Matrix removeRow(int row) {
        if (rows - 1 < 0) {
            throw new IllegalArgumentException("Неможливо видалити рядок з матриці менше ніж з одним рядком");
        }
        double[] newElements = new double[elements.length - columns];
        System.arraycopy(elements, 0, newElements, 0, row * columns);
        System.arraycopy(elements, (row + 1) * columns, newElements, row * columns, newElements.length - row * columns);
        return new Matrix(newElements, rows - 1, columns);
    }

    public Matrix addColumn(int column, double[] newColumn) {
        if (rows != newColumn.length) {
            throw new IllegalArgumentException("Новий стовбець повинен містити кількість елементів рівну кількості рядків");
        }
        double[] newElements = new double[elements.length + rows];
        for (int i = 0; i < rows; i++) {
            System.arraycopy(elements, i * columns, newElements, i * (columns + 1), columns);
            newElements[i * (columns + 1) + column] = newColumn[i];
        }
        return new Matrix(newElements, rows, columns + 1);
    }

    public Matrix removeColumn(int column) {

        double[] newElements = new double[elements.length - rows];
        for (int i = 0; i < rows; i++) {
            if (columns - 1 < 0) {
                throw new IllegalArgumentException("Неможливо видалити стовбець з матриці менше ніж з одним стовбцем");
            }
            System.arraycopy(elements, i * columns, newElements, i * (columns - 1), column);
            System.arraycopy(elements, (i * columns) + column + 1, newElements, i * (columns - 1) + column, elements.length - (i * columns) - column - 1);
        }
        return new Matrix(newElements, rows, columns - 1);
    }

    private Matrix submatrix(int row, int column) {
        double[] newElements = new double[(rows - 1) * (columns - 1)];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            if (i == row) {
                continue;
            }
            for (int j = 0; j < columns; j++) {
                if (j == column) {
                    continue;
                }
                newElements[index] = elements[i * columns + j];
                index++;
            }
        }
        return new Matrix(newElements, rows - 1, columns - 1);
    }
}

