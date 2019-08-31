package com.example.student.bai2;

public class Calculator {
    public Calculator() {
    }

    public static int celsiusToFahrenheit(int c) {
        return c * 9/5 + 32;
    }

    public static int fahrenheitToCelsius(int f) {
        return (f - 32) * 5/9;
    }
}
