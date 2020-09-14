package com.leetcode.arrays;

/**
 * @author Chayanika Ghosh
 */
public class TwoSumReturnPositionUsingArray {
        public int[] twoSum(int[] nums, int target) {
            int n = nums.length -1;
            int[] sum = new int[2];
            int i=0;
            if(n==0){
                return null;
            }
            if(n==1){
                return null;
            }
            while(i<n){
                if(target == nums[i]+nums[n]){
                    sum[0] = i;
                    sum[1] = n;
                    return sum;

                }

                if(nums[i]+nums[n] <target){
                    i++;
                }
                else {
                    n--;
                }
            }
            return sum;
        }

        public void printIndexes(int arrWithIndex[]){
            for(int i=0; i<arrWithIndex.length;i++){
                System.out.println(arrWithIndex[i]);
            }
        }


        public static void main(String args []){
            TwoSumReturnPositionUsingArray sol = new TwoSumReturnPositionUsingArray();
            int target = 9;
            int [] nums = {2,7,11,15};
            int arrWithIndex[] = sol.twoSum(nums, target);
            sol.printIndexes(arrWithIndex);
        }
    }

