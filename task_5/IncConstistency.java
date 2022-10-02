package com.company.task_5;

import java.util.Random;

public class IncConstistency {

    private int[] array;

    public IncConstistency(int n) {
        array = new int[n];

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = Math.abs(rand.nextInt() % 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int getItemsToRemoveCount() {
        int res = 0;
        int currMax = array[0];

        for(int i = 0; i < array.length - 1; i++){
            if (array[i + 1] <= currMax) {
                res++;
            }
            else {
                currMax = array[i + 1];
            }
        }

        return res;
    }

    public void print() {
        for (int value : array) {
            System.out.printf("%d  ", value);
        }

        System.out.println();
    }
}
