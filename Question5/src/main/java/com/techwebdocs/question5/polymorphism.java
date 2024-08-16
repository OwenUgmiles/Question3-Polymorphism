/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techwebdocs.question5;

/**
 *
 * @author HP
 */
public class polymorphism {
    class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

// Usage
Calculator calculator = new Calculator();
int sum1 = calculator.add(5, 3); // Calls add(int, int)
double sum2 = calculator.add(2.5, 1.7); // Calls add(double, double)

}
