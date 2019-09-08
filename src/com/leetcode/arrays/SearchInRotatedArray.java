package com.leetcode.arrays;

public class SearchInRotatedArray {

    public int[] findpivot(int arr[]){
       int i=0;
        int[] findPivotAndPos = new int [2];
        for(i=0; i<arr.length-1;i++){
           if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
               System.out.println("Pivot found: "+ arr[i]);
               findPivotAndPos[0]= arr[i];
               findPivotAndPos[1]=i;
           }
       }
        return findPivotAndPos;
    }

     public int binarysearch(int arr[], int low, int high, int num){
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(num == arr[mid]){
            return mid;
        }
        if(num> arr[mid]){
            return binarysearch(arr, mid+1,high,num );
        }else
            return binarysearch(arr, low,mid, num);
     }
    public int findnum(int arr[], int n,int num){
        if(arr.length<2){
            return -1;
        }
        int pivotAndPos[] = findpivot(arr);
        int pivot = pivotAndPos[0];
        int pivotPosition = pivotAndPos[1];
        if(pivotPosition==0){
            System.out.println("No pivot found.");
        }
        int i=0;
        if(num == pivot){
            System.out.println("Number Found: " + num);
            return pivotPosition;
        }
        if(num>arr[i]){
            System.out.println("The num is before pivot");
            return binarysearch(arr,i, pivotPosition, num);
        }
        else{
            System.out.println("The num is after pivot");
            return binarysearch(arr, pivotPosition, arr.length-1, num);
        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        SearchInRotatedArray obj = new SearchInRotatedArray();
        int n= arr.length;
        int num = 3;
        int position = obj.findnum(arr, n-1, num);
        System.out.println("The position of the number is: "+ position);
    }
}
