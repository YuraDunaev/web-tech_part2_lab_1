package com.company.task_2;

import java.awt.*;

public class Graph {

    private Point a1;
    private Point b1;

    private Point a2;
    private Point b2;

    public Graph() {
        a1 = new Point(-4, 5);
        a2 = new Point(-6, 0);

        b1 = new Point(4, 0);
        b2 = new Point(6, -3);
    }

    public boolean contains(Point point) {
        return isInRectangle(point, a1, b1) || isInRectangle(point, a2, b2);
    }

    private boolean isInRectangle(Point point, Point a, Point b) {
        return (a.x <= point.x) && (a.y >= point.y) && (b.x >= point.x ) && (b.y <= point.y);
    }

}
