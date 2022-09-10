package com.ds.bit_magic.practice;

public class Sparse_number {
    public static void main(String[] args) {
        int n=5;
        System.out.println((n & (n<<1)) == 0 ? true : false);
    }
}
