package com.stackroute;

public class InsertionSort{

    public static void main(String[] args) {
        int[] array = {2,5,1,8,3,9,4};
        System.out.println("Sorted Array");
        insertionsort(array);
        for(int i:array){
            System.out.println(i);
        }
    }
    public static void insertionsort(int[] array){
        int length= array.length;
        for(int i=1;i<length;i++){
            int key = array[i];
            int j=i-1;
            while((j>-1) && (array[j]>key)){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }
}
