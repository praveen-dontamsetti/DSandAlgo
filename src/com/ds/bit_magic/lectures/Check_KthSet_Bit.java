package com.ds.bit_magic.lectures;

public class Check_KthSet_Bit {
    public static void main(String[] args) {
        //approach 1 by using left shift bit operator
        int n=5,k=3;
        if( (n & 1 << (k-1) )!=0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        //approach 2 by using right shift bit operator
        int m=13,l=3;
        if( (m>>k-1 & 1 ) == 1 ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}
