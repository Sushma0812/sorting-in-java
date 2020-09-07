package com.stackroute;
import java.util.Scanner;
/*
 *This class contains methods to sort
 */
public class SortAndSearch {
    public static String[] getDetails() {
        Scanner reader = new Scanner(System.in);
        int i;
        String[] array = new String[10];
        for (i = 0; i < 10; i++) {
            array[i] = reader.next();
        }
        return array;
    }

    public static void sortData(String[] array) {
        for (int i = 0; i < 10; i++) {
            int minimum_index = i;
            String minimum_string = array[i];
            //sorting the string elements
            for (int j = i + 1; j < 10; j++) {
                if (array[j].compareTo(minimum_string) < 0) {
                    minimum_string = array[j];
                    minimum_index = j;
                }
            }
            if (minimum_index != i) {
                String temp = array[minimum_index];
                array[minimum_index] = array[i];
                array[i] = temp;
            }

        }
        //displays sorted string elements
        System.out.println("Sorted elements");
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }

    }

    public static int doSearch(String[] array) {
        int i;
        String key;
        System.out.println("Enter desired element");
        Scanner reader = new Scanner(System.in);
        key = reader.next();
        //searching the desired elements
        for (i = 0; i < 10; i++) {
            if (key.equals(array[i]))
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] string = getDetails();
        sortData(string);
        int value = doSearch(string);
        //displays whether given element is found or not
        if (value == -1) {
            System.out.println("not found");
        } else {
            System.out.println("Found");
        }
    }
}
