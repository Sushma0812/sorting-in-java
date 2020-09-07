package com.stackroute;
/*
 *Thi class contains methods used to perform merge sort
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 6, 9, 4};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, 0, array.length - 1);
        //displays sorted array
        System.out.println("Sorted Array");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //this method is used to sort the array elements
    public static void merge(int[] array, int start, int mid, int end) {
        int low = mid - start + 1;
        int high = end - mid;
        int[] arrayPartOne = new int[low];
        int[] arrayPartTwo = new int[high];
        for (int i = 0; i < low; i++) {
            arrayPartOne[i] = array[start + i];
        }
        for (int j = 0; j < high; j++) {
            arrayPartTwo[j] = array[mid + 1 + j];
        }
        int i = 0, j = 0;
        int k = start;
        while (i < low && j < high) {
            if (arrayPartOne[i] <= arrayPartTwo[j]) {
                array[k] = arrayPartOne[i];
                i++;
            } else {
                array[k] = arrayPartTwo[j];
                j++;
            }
            k++;
        }
        while (i < low) {
            array[k] = arrayPartOne[i];
            i++;
            k++;

        }
        while (j < high) {
            array[k] = arrayPartTwo[j];
            j++;
            k++;
        }
    }
    //this method is used to sort the elements in the array
    void sort(int[] array, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(array, start, mid);
            sort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }
}
