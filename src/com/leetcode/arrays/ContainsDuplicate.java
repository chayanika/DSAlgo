package com.leetcode.arrays;

import java.util.HashMap;

public class ContainsDuplicate {

    public boolean getstatus(int arr[]){
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++){
            if(hmap.containsKey(arr[i])){
                return true;
            }else{
                hmap.put(arr[i],1);
            }
        }
        return false;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,1};
        ContainsDuplicate obj = new ContainsDuplicate();
        boolean value = obj.getstatus(arr);
        System.out.println(value);
    }
}

