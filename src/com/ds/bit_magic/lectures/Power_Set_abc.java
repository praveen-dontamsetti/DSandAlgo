package com.ds.bit_magic.lectures;

public class Power_Set_abc {
    public static void main(String[] args) {
        String str="abc";
        int length=str.length();
        int combination_count= 1<<length; // pow(2,n) where n is length of string

        for(int counter=0;counter<combination_count;counter++) {

            for (int j = 0; j < length; j++) {
                if ((counter & 1 << j) != 0) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
        // Time Complexity = pow(2,n) * n
    }
}
