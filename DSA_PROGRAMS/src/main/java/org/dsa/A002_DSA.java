package org.dsa;

import java.util.Arrays;

public class A002_DSA {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        /* Brute Force Solution*/
        int result0 = getMax2(arr);
        System.out.println("Brute Force Search Result: " + result0);
        /* Optimized Solution */
        int result1 = getMax(arr);
        System.out.println("Optmized Solution " + result1);
    }

    private static int getMax(int[] arr){
        int size = arr.length;

        int maxElement = arr[0];
        //Iterate through the array
        for(int i=0; i<size; i++){
            if(arr[i] > maxElement){
                maxElement = arr[i];
            }
        }
        return maxElement;
    }

    private static int getMax2(int[] arr){
        int size = arr.length;
        Arrays.sort(arr);
        return arr[size-1];
    }

}
