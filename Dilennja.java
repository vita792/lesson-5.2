package com.company;

public class Dilennja implements Action {
    @Override
    public double result(double a, double b) {
        double result =  (a / b) + (a % b);
        return result;
    }
}
