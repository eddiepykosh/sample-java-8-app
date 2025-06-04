package com.example.calculator;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Calculator Application");
        System.out.println("Addition: 5 + 3 = " + calc.add(5, 3));
        System.out.println("Subtraction: 10 - 4 = " + calc.subtract(10, 4));
        System.out.println("Multiplication: 6 * 7 = " + calc.multiply(6, 7));
        System.out.println("Division: 15 / 3 = " + calc.divide(15, 3));
        System.out.println("Modulo: 17 % 5 = " + calc.modulo(17, 5));
    }

    /**
     * Adds two numbers
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts two numbers
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two numbers
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides two numbers
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return (double) a / b;
    }

    /**
     * Returns the modulo of two numbers
     */
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Modulo by zero is not allowed");
        }
        return a % b;
    }

    /**
     * Checks if a number is positive
     */
    public boolean isPositive(int number) {
        return number > 0;
    }
}
