package com.ds.bit_magic.practice;

public class Bit_Difference {
    public static void main(String[] args) {
        int m=20;
        int n=25;
        int xor=m ^ n;
        int count=0;
        while(xor > 0){
            xor=xor & (xor-1);
            count++;
        }
        System.out.println(count);
    }
}
