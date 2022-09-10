package com.ds.bit_magic.practice;

public class First_Right_Set_Bit {
    public static void main(String[] args) {
        int n=13;

        int right_set_bit= n & ~(n-1);

        int result = (int)(Math.log(right_set_bit)/Math.log(2.0)) + 1;

        System.out.println(result);

    }
}
