package com.company.task_9;

enum Color
{
    Blue,
    Green,
    Red
};

public class Ball {
    public double weight;
    public Color color;

    public Ball(double weight, Color color) {
        this.weight = weight;
        this.color = color;
    }
}
