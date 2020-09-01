package com.stackroute;

import java.util.Scanner;

/*
 *This class is used to perform quick sort
 */
public class QuickSort {
    public static void quicksort(int[] array, int start, int end]) {
        int partition = partition(array, start, end);
        if (partition - 1 > start) {
            quicksort(array, start, end);
        }
        if (partition - 1 < end) {
            quicksort(array, start, end);
        }
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        for (int i = start; i < end; i++) {
            if (array[i] < pivot) {
                int temp = array[start];
                array[start] = array[i];
                array[i] = temp;
            }
        }
        int temp = array[start];
        array[start] = pivot;
        array[end] = temp;
        return start;

    }
}

public static void main(String[]args){
        int[]array={4,5,1,2,3.8};
        quicksort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
        }
}