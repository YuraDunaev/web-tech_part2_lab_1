package com.company.task_7;

import java.util.Random;

public class ShellSort {
    private int[] array;


    public ShellSort(int n) {
        array = new int[n];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(random.nextInt() % 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void sort() {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];

            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }
}
