package com.company.task_1;

public class Formula {
    private double x;
    private double y;

    public Formula(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double calculate()
    {
        double numerator = 1 + Math.pow(Math.sin(this.x + this.y), 2);
        double denominator = 2 + Math.abs(this.x - (2 * this.x ) / ( 1 + Math.pow(this.x, 2) * Math.pow(this.y, 2)));

        return numerator / denominator + this.x;
    }
}
