package com.stackroute;
import java.util.Scanner;
/*
 *This class is used to perform quick sort
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {4, 5, 1, 2, 3, 8};
        quicksort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        public static void quicksort ( int[] array, int start, int end){
            //here elements are partitioned one as sorted array amd other as unsorted array
            int partition = partition(array, start, end);
            if (partition - 1 > start) {
                quicksort(array, start, end);
            }
            if (partition - 1 < end) {
                quicksort(array, start, end);
            }
        }

        public static int partition ( int[] array, int start, int end){
            int pivot = array[end];
            //sorting the elements
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




