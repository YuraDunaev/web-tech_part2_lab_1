package com.company.task_8;

import java.util.ArrayList;
import java.util.Random;

public class CombineSequences {
    private double[] array1;
    private double[] array2;

    private ArrayList<Integer> indexesArray;

    public CombineSequences(int n, int m) {
        array1 = new double[n];
        array2 = new double[m];

        fillArray(array1);
        fillArray(array2);

        printArray(array1);
        printArray(array2);
    }

    public ArrayList<Integer> getIndexesArray() {
        var result = new ArrayList<Integer>();

        var i = 0;
        var j = 0;

        while (i < array1.length && j < array2.length) {
            if (array2[j] < array1[i]) {
                result.add(i + j);
                j++;
            } else {
                i++;
            }
        }

        if (i >= array1.length) {
            for ( ; j < array2.length; j++) {
                result.add(i + j);
            }
        }

        return result;
    }

    private void fillArray(double[] array) {
        Random random = new Random();
        var number = Math.abs((random.nextInt() % 1000)) / 100d;

        for (int i = 0; i < array.length; i++) {
            var step = Math.abs((random.nextInt() % 1000)) / 100d;
            array[i] = number + step + i * 10;
        }
    }

    public void printArray(double[] array) {
        for (double item: array) {
            System.out.printf("%.2f ", item);
        }
        System.out.println();
    }

}
