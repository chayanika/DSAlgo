package com.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumRetunPosition {

    public int[]  getpositions(int arr[] , int num){
        Map<Integer, Integer> hmap = new HashMap<>();
        int arr1[] = new int[arr.length];
        for(int i =0; i<arr.length;i++) {
            int value = num - arr[i];
            if (!hmap.containsKey(value)) {
                hmap.put(arr[i], i);
            } else if(hmap.containsKey(value)) {
                arr1[0] = hmap.get(value);
                arr1[1] = i;
            }else {
                System.out.println("No such pair found with sum = " + num);
            }
        }
        return arr1;
    }

    public static void main(String args[]){
        int arr[] = {2, 7, 11, 15};
        int num = 9;
        TwoSumRetunPosition obj = new TwoSumRetunPosition();
        int ans[] = obj.getpositions(arr, num);
        System.out.println("Positions are: " + ans[0] + " " +ans[1]);
    }
}
