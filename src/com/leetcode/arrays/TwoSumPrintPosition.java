package com.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumPrintPosition {
    public int[]  getpositions(int arr[] , int target){
        Map<Integer, Integer> hmap = new HashMap<>();
        int arr1[] = new int[arr.length];
        for(int i =0; i<arr.length;i++) {
            int value = target - arr[i];
            if (!hmap.containsKey(value)) {
                hmap.put(arr[i], i);
            } else
                arr1[0] = hmap.get(value);
            arr1[1] = i;
        }return arr1;
    }

    public static void main(String args[]){
        int arr[] = {2, 7, 11, 15};
        int num = 9;
        TwoSumPrintPosition obj = new TwoSumPrintPosition();
        int ans[] = obj.getpositions(arr, num);
        System.out.println("Positions are: " + ans[0] + " " +ans[1]);
    }

}
