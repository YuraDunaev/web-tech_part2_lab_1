package com.company.task_3;

public class StepFunction {
    private double a;
    private double b;
    private double h;

    public StepFunction(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public void printResults() {
        System.out.println("  X  __  F(X)");
        for (double x = a; x <= b; x += h) {
            System.out.println(String.format("%.3f", x) + " " + String.format("%6.3f", Math.tan(x)));
        }
    }

}
