package Pz2.Task3;

import java.util.Arrays;

    public class Polygon {
        private Point[] vertices;

        public Polygon(Point[] vertices) {
            this.vertices = vertices;
        }

        public Point[] getVertices() {
            return vertices;
        }

        public void setVertices(Point[] vertices) {
            this.vertices = vertices;
        }

        @Override
        public String toString() {
            return "Вершини багатокутника: " + Arrays.toString(vertices);
        }

        public boolean isConvex() {
            int n = vertices.length;
            if (n < 3) {
                return false;
            }

            boolean isNegative = false;
            boolean isPositive = false;

            for (int i = 0; i < n; i++) {
                int dx1 = vertices[(i + 2) % n].getX() - vertices[(i + 1) % n].getX();
                int dy1 = vertices[(i + 2) % n].getY() - vertices[(i + 1) % n].getY();
                int dx2 = vertices[i].getX() - vertices[(i + 1) % n].getX();
                int dy2 = vertices[i].getY() - vertices[(i + 1) % n].getY();
                int crossProduct = dx1 * dy2 - dy1 * dx2;

                if (crossProduct < 0) {
                    isNegative = true;
                } else if (crossProduct > 0) {
                    isPositive = true;
                }

                if (isNegative && isPositive) {
                    return false;
                }
            }

            return true;
        }

        public double[] calculateSideLengths() {
            int n = vertices.length;
            double[] sideLengths = new double[n];

            for (int i = 0; i < n; i++) {
                int nextIndex = (i + 1) % n;
                int dx = vertices[nextIndex].getX() - vertices[i].getX();
                int dy = vertices[nextIndex].getY() - vertices[i].getY();
                sideLengths[i] = Math.sqrt(dx * dx + dy * dy);
            }

            return sideLengths;
        }

        public double[] calculateDiagonalLengths() {
            int n = vertices.length;
            double[] diagonalLengths = new double[n];

            for (int i = 0; i < n; i++) {
                int nextIndex = (i + 1) % n;
                int prevIndex = (i + n - 1) % n;
                int dx1 = vertices[nextIndex].getX() - vertices[i].getX();
                int dy1 = vertices[nextIndex].getY() - vertices[i].getY();
                int dx2 = vertices[prevIndex].getX() - vertices[i].getX();
                int dy2 = vertices[prevIndex].getY() - vertices[i].getY();
                double diagonal1 = Math.sqrt(dx1 * dx1 + dy1 * dy1);
                double diagonal2 = Math.sqrt(dx2 * dx2 + dy2 * dy2);
                diagonalLengths[i] = (diagonal1 + diagonal2) / 2;
            }

            return diagonalLengths;
        }
        public double[] calculateAngles() {
            int n = vertices.length;
            double[] angles = new double[n];

            for (int i = 0; i < n; i++) {
                int nextIndex = (i + 1) % n;
                int prevIndex = (i + n - 1) % n;
                double dx1 = vertices[nextIndex].getX() - vertices[i].getX();
                double dy1 = vertices[nextIndex].getY() - vertices[i].getY();
                double dx2 = vertices[prevIndex].getX() - vertices[i].getX();
                double dy2 = vertices[prevIndex].getY() - vertices[i].getY();
                double angle1 = Math.atan2(dy1, dx1);
                double angle2 = Math.atan2(dy2, dx2);
                angles[i] = (angle1 - angle2) / 2;
            }

            return angles;
        }
        public double[] calculateMedians() {
            int n = vertices.length;
            double[] medians = new double[n];

            for (int i = 0; i < n; i++) {
                int nextIndex = (i + 1) % n;
                int medianX = (vertices[i].getX() + vertices[nextIndex].getX()) / 2;
                int medianY = (vertices[i].getY() + vertices[nextIndex].getY()) / 2;
                double dx = vertices[i].getX() - medianX;
                double dy = vertices[i].getY() - medianY;
                medians[i] = Math.sqrt(dx * dx + dy * dy);
            }

            return medians;
        }
        public double[] calculateHeights() {
            int n = vertices.length;
            double[] heights = new double[n];

            for (int i = 0; i < n; i++) {
                int nextIndex = (i + 1) % n;
                int prevIndex = (i + n - 1) % n;

                double dx = vertices[nextIndex].getX() - vertices[prevIndex].getX();
                double dy = vertices[nextIndex].getY() - vertices[prevIndex].getY();
                double numerator = Math.abs(dy * vertices[i].getX() - dx * vertices[i].getY() + vertices[nextIndex].getX() * vertices[prevIndex].getY() - vertices[nextIndex].getY() * vertices[prevIndex].getX());
                double denominator = Math.sqrt(dx * dx + dy * dy);
                heights[i] = numerator / denominator;
            }

            return heights;
        }
    }

