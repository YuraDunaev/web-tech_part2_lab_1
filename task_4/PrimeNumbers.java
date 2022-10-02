package com.company.task_4;

import java.sql.Array;
import java.util.Random;

public class PrimeNumbers {

    private int[] array;

    public PrimeNumbers(int n) {
        array = new int[n];

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = Math.abs(rand.nextInt() % 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private boolean isPrimeNumber(int number) {
        if (number == 0 || number == 1)
            return false;

        for(int i = 2; i <= Math.sqrt(number); i++)
            if(number % i == 0)
                return false;

        return true;
    }

    public void printNumbersOfPrimes() {
        for (int i = 0; i < array.length; i++) {
            if (isPrimeNumber(array[i])) {
                System.out.println("Number " + i + " is prime and = " + array[i]);
            }
        }
    }
}
