package com.example;

public class Calculator {

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num2 - num1;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return num1 / num2;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double squareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of negative number!");
        }
        return Math.sqrt(num);
    }

    public int functionOfNumber(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Cannot calculate function of negative number!");
        }
        if (num == 0 || num == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public double naturalLogarithm(double num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Cannot calculate natural logarithm of non-positive number!");
        }
        return Math.log(num);
    }

    public double commonLogarithm(double num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Cannot calculate common logarithm of non-positive number!");
        }
        return Math.log10(num);
    }

}
