package Pz2.Task1;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    // Constructor that accepts real and imaginary parts
    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // Constructor that accepts a module and an argument
    public ComplexNumber(double module, Double argument) {
        this.realPart = module * Math.cos(argument);
        this.imaginaryPart = module * Math.sin(argument);
    }

    // Getters and Setters
    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    // toString
    @Override
    public String toString() {
        return realPart + " + " + imaginaryPart + "i";
    }

    // Module calculation
    public double module() {
        return Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
    }

    // Calculation of the argument
    public double argument() {
        return Math.atan2(imaginaryPart, realPart);
    }

    // Calculation of the real part
    public double realPart() {
        return realPart;
    }

    // Calculation of the imaginary part
    public double imaginaryPart() {
        return imaginaryPart;
    }

    // Arithmetic operations
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(realPart + other.realPart, imaginaryPart + other.imaginaryPart);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(realPart - other.realPart, imaginaryPart - other.imaginaryPart);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double real = realPart * other.realPart - imaginaryPart * other.imaginaryPart;
        double imaginary = realPart * other.imaginaryPart + imaginaryPart * other.realPart;
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.realPart * other.realPart + other.imaginaryPart * other.imaginaryPart;
        double real = (realPart * other.realPart + imaginaryPart * other.imaginaryPart) / denominator;
        double imaginary = (imaginaryPart * other.realPart - realPart * other.imaginaryPart) / denominator;
        return new ComplexNumber(real, imaginary);
    }

    // Degree
    public double degree() {
        return Math.toDegrees(argument());
    }

    // Root
    public ComplexNumber root(int n) {
        double module = Math.pow(module(), 1.0 / n);
        double argument = this.argument() / n;
        return new ComplexNumber(module, argument);
    }
}
