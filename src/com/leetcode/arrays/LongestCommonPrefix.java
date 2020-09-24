package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author Chayanika Ghosh
 */
public class LongestCommonPrefix {
    public static String compare(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        String commonString = null;
        int lengthOfs1 = ch1.length;
        int lengthOfs2 = ch2.length;
        if (lengthOfs1 > lengthOfs2) {
            for (int i = 0, j = 0; i < ch2.length; i++, j++) {
                if (ch1[i] == ch2[j]) {
                    commonString = Objects.toString(commonString, "")+ch1[i];
                }
                else
                    return commonString;
            }
        } else {
            for (int i = 0, j = 0; i < ch1.length; i++, j++) {
                if (ch1[i] == ch2[j]) {
                    commonString = Objects.toString(commonString, "")+ch1[i];
                }else
                    return commonString;
            }
        }
        return commonString;
    }

    public String sendStringtoCompare(String[] input) {
        String commonString = null;
        int i = 0;

        if (input.length == 0 || input.length == 1) {
            return null;
        }
        if(i+1> input.length){
            return null;
        }else{
            commonString = compare(input[i], input[i + 1]);
        }

        for (i = 2; i < input.length; i++) {
            if(commonString == null){
                return null;
            }else
            commonString = compare(commonString, input[i]);
        }
        return commonString;
    }

    public static void main(String args[]) {
        LongestCommonPrefix obj = new LongestCommonPrefix();
        String input[] = {"flow","flower","flight"};
        String commonStr = obj.sendStringtoCompare(input);
        System.out.println(commonStr);
    }
}
