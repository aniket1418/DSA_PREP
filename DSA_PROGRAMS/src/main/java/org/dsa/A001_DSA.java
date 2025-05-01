package org.dsa;

import java.util.HashMap;
import java.util.Map;

public class A001_DSA {

    public static void main(String[] args){
        System.out.println("Hello World");
        int[] arr = {10,5,10,15,5};
        countFreq(arr);
        countFreq2(arr);
    }

    /* SOLUTION 1 - Brute force
    /* Time complexity - O(n*n)
    *  Space complexity - O(N) */
    public static void countFreq(int[] arr){
        int n = arr.length;

        /* Count the frequency of number */
        /* Declare the frequency array */
        boolean[] visitedArray = new boolean[n];
        for(int i =0; i < n; i++){

            if(visitedArray[i]){
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    visitedArray[j] = true;
                    count++;
                }
            }
            System.out.println( arr[i] + " count : " + count);
        }
    }

    /* Solution 2 - Using HashMap */
    public static void countFreq2(int[] arr){
        int n = arr.length;
        Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++){
            if (freqMap.containsKey(arr[i])){
                freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
            }
            else{
                freqMap.put(arr[i], 1);
            }
        }

        /* TIME TO PRINT THE HASHMAP */
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
