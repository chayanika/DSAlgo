package com.leetcode.arrays;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Chayanika Ghosh
 */
public class RemoveDuplicatesfromSortedArray {

    public int [] removedupes(int arr[]){
        int newArr[] = new int[arr.length];
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hashSet.add(arr[i]);
        }
        int j=0;
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()){
            newArr[j] = it.next();
            j++;
        }
        arr = newArr;
        return arr;
    }
    public void print(int [] arr){
        for(int i:arr){
            System.out.println(i);
        }
    }

    public int removedupescount(int arr[]){
        int newArr[] = new int[arr.length];
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hashSet.add(arr[i]);
        }
        int j=0;
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()){
            newArr[j] = it.next();
            j++;
        }
        arr = newArr;
        return j;
    }
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1)
            return nums.length;

        int j = 0;

        for (int i = 0; i < nums.length-1; i++){
            if (nums[i] != nums[i+1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray obj = new RemoveDuplicatesfromSortedArray();
        int arr[] = {0,0,1,1,1,2,2,3,3,4,5};
        //int newArr[] = obj.removedupes(arr);
       // obj.print(newArr);
        int count = obj.removeDuplicates(arr);
        System.out.println(count);
    }
}
