package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        final Random random = new Random();

        // HW
        double[] array = new double[15];
        int temp1 = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 - random.nextDouble() * 15;
            System.out.println("[" + array[i] + "]");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                temp1 = i;
                break;
            }
        }
        //Average
        int temp = 0;
        double summ = 0;
        for (int i = temp1; i < array.length; i++) {
            if (array[i] > 0) {
                summ += array[i];
                temp++;
            }
        }
        summ = summ / temp;
        System.out.println("Среднее арифметическое после первого отрицательного [" + summ + "]");

        //HW for quick wits
        for (int i = 0; i < array.length; i++) {
            double min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                double tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + array[i] + "]");
        }

    }
}
