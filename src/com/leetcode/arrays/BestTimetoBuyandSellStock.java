package com.leetcode.arrays;

import java.util.ArrayList;

public class BestTimetoBuyandSellStock {

    public void getBestBuySell(int arr[]) {
        int n = arr.length;
        BuySell bs = new BuySell();
        int i = 0;
        int count = 0;
        ArrayList<BuySell> arrlist = new ArrayList<>();
        while (i < n - 1) {
            if (arr[i] >= arr[i + 1]) {
                i++;
            }
            bs.buy = i++;
            if (arr[i] >= arr[i - 1]) {
                i++;
            }
            bs.sell = i - 1;
        }
        arrlist.add(bs);
        count++;

        if(count ==0) {
            System.out.println("Nothing bought and sold. No profit");
        }else{
            for(int c=0;c<count;c++){
                System.out.println("Bought: " + arrlist.get(c).buy +"\n" +"Sold: " + arrlist.get(c).sell);
            }
            }
        }


    public static void main(String args[]) {
        BestTimetoBuyandSellStock stock = new BestTimetoBuyandSellStock();
        int arr[] = {7, 1, 5, 3, 6, 4};
        int price[] = { 100, 180, 260, 310, 40, 535, 695 };
        int n = price.length;

        stock.getBestBuySell(price);
    }
}
