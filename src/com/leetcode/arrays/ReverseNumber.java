package com.leetcode.arrays;

/**
 * @author Chayanika Ghosh
 */
public class ReverseNumber {

    public void reverse(int num){
        int reverseNum = 0;
        while(num>0) {
            reverseNum = reverseNum * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(reverseNum);
    }

    public static void main(String args []){
        ReverseNumber obj = new ReverseNumber();
        int num = 321;
        obj.reverse(num);
    }
}
