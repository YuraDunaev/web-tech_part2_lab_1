package com.company.task_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Basket {
    public ArrayList<Ball> balls;

    public Basket() {
        balls = new ArrayList<Ball>();
        Random random = new Random();
        int n = Math.abs(random.nextInt() % 10) + 1;

        for (int i = 0; i < n; i++) {
            addBall(Color.values()[Math.abs(random.nextInt()) % 3]);
        }

    }

    public void addBall(Color color) {
        Random random = new Random();
        Ball ball = new Ball((Math.abs(random.nextInt()) % 10000) / 100d, color);
        balls.add(ball);
    }

    public void printBalls() {
        double fullWeight = 0;
        int blueBallsCount = 0;

        for (Ball ball: balls) {
            if (ball.color == Color.Blue) {
                blueBallsCount++;
            }
            fullWeight += ball.weight;
            System.out.print(ball.color + " " + ball.weight + " \n");
        }

        System.out.println("FullWeight: " + fullWeight);
        System.out.println("Count of Blue Balls: " + blueBallsCount);
    }
}
