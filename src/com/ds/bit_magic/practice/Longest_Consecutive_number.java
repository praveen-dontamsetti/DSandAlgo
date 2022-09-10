package com.ds.bit_magic.practice;

public class Longest_Consecutive_number {
    public static void main(String[] args) {
        int N=46;
        int count=0;
        while(N>0){
            N=N & (N>>1);
            count++;
        }
        System.out.println(count);
    }


}
