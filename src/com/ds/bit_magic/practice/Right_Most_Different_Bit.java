package com.ds.bit_magic.practice;

public class Right_Most_Different_Bit {
    public static void main(String[] args) {
        int n=10;
        int m=12;

        int xor=m ^ n;

        int right_most_bit = xor & ~(xor-1);

        int position = (int)(Math.log(right_most_bit)/Math.log(2.0)) +1;

        System.out.println(position);
    }
}
