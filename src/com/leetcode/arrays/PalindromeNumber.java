package com.leetcode.arrays;

/**
 * @author Chayanika Ghosh
 */
public class PalindromeNumber {

    public boolean isPalindrome(int num){
        if(num<0){
            return false;
        }
        int reverseNumb = reverseNum(num);
        Boolean status = compare(num, reverseNumb);
        if(status == true){
            return true;
        }else
            return false;

    }
    public Boolean compare( int num, int reverseNumb){
        if(num%10 == reverseNumb%10) {
            if (num > 0 && reverseNumb > 0) {
                return compare(num / 10, reverseNumb / 10);
            }
            return true;
        }else
            return false;
    }

    public int reverseNum(int num){
        int reverse = 0;
        while(num>0) {
            int value = num % 10;

            reverse = reverse * 10 + value;
            num = num/10;
        }
        return reverse;
    }

    public static void main(String args []){
        PalindromeNumber obj = new PalindromeNumber();
        int num = -1221;
        Boolean status = obj.isPalindrome(num);
        System.out.println(status);
    }
}
