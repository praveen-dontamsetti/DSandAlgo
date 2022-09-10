package com.ds.bit_magic.lectures;

public class One_Odd_Occurence {
    public static void main(String[] args) {
        int[] arr = {4, 3, 4,4,4,5,5};
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            result= result^ arr[i];
        }
        System.out.println(result);

        //Time Complexity = n
    }
}
