
package com.stackroute;

import java.util.Scanner;

/*
 *This class contains methods to sort the elements using merge sort and search the element using binary search
 */
public class MergeSortAndBinarySearch {
    public static String[] getDetails() {
        Scanner reader = new Scanner(System.in);
        int i;
        System.out.println("Enter elements");
        String[] array = new String[10];
        for (i = 0; i < 10; i++) {
            array[i] = reader.next();
        }
        return array;
    }


    public static String[] mergeSort(String[] array) {
        if (array.length >= 2) {
            String[] left = new String[array.length / 2];
            String[] right = new String[array.length - array.length / 2];

            for (int i = 0; i < left.length; i++) {
                left[i] = array[i];
            }
            for (int i = 0; i < right.length; i++) {
                right[i] = array[i + array.length / 2];
            }
            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }
        return array;
    }

    public static void merge(String[] array, String[] left, String[] right) {
        int sizeOne = 0;
        int sizeTwo = 0;

        for (int i = 0; i < array.length; i++) {
            if (sizeTwo >= right.length || (sizeOne < left.length && left[sizeOne].compareToIgnoreCase(right[sizeOne]) < 0)) {
                array[i] = left[sizeOne];
                sizeOne++;
            } else {
                array[i] = right[sizeTwo];
                sizeTwo++;
            }
        }

    }

    public static int doSearch(String[] array) {
        int low = 0;
        int high = array.length - 1;
        int mid;
        String key;
        System.out.println("Enter desired element");
        Scanner reader = new Scanner(System.in);
        key = reader.next();
        while (low <= high) {
            mid = (low + high) / 2;
            if (array[mid].compareTo(key) < 0) {
                low = mid + 1;
            } else if (array[mid].compareTo(key) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] string = getDetails();
        String[] stringOne;
        stringOne = mergeSort(string);
        System.out.println("Sorted elements");
        for (int i = 0; i < stringOne.length; i++) {
            System.out.println(stringOne[i]);
        }
        int high = string.length - 1;
        int value = doSearch(string);
        if (value == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element Found");
        }
    }

}
