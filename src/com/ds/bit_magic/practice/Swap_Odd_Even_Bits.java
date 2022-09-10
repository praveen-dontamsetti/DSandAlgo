package com.ds.bit_magic.practice;

public class Swap_Odd_Even_Bits {
    public static void main(String[] args) {
        int n=23;
        int even = n & 0xAAAAAAAA; //even format
        even=even>>1;
        int odd = n & 0x55555555; //odd format
        odd=odd<<1;
        System.out.println(even+odd);
    }
}
