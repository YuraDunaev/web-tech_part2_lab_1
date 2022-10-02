package com.company.task_6;

import java.util.Random;

public class Matrix {

    private int[] array;
    private int[][] matrix;

    public Matrix(int n) {
        array = new int[n];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(random.nextInt() % 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public void createMatrix() {
        matrix = new int[array.length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                matrix[i][j] = array[(j + i) % array.length];
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
