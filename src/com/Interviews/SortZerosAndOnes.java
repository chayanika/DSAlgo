package com.Interviews;

/**
 * @author Chayanika Ghosh
 */
public class SortZerosAndOnes {
public int[] sorted(int arr1[]){
    int len = arr1.length-1;
    int i=0;
    while(i!=len){
        if(arr1[i] == 1 && arr1[len]== 0){
            int swap = arr1[i];
            arr1[i] = arr1[len];
            arr1[len] = swap;
            len--;
        }
        else if(arr1[i]==1 && arr1[len]==1){
            len--;
        }else if(arr1[i]==0 && arr1[len] ==0){
            i++;
        }else if(arr1[i]==0 && arr1[len] ==1){
            i++;
            len --;
        }

    }
    return arr1;
}

    public static void main(String[] args) {
        int arr1[] = {1,0,1,0,1,0,1,0,1,0};
        SortZerosAndOnes obj = new SortZerosAndOnes();
        int finalArr[] = obj.sorted(arr1);
        for (int i=0;i<finalArr.length; i++){
            System.out.println(finalArr[i]);
        }
    }
}
