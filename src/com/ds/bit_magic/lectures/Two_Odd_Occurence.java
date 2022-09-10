package com.ds.bit_magic.lectures;

public class Two_Odd_Occurence {
    public static void main(String[] args) {

        int[] arr = {4, 3, 4,4,4,5,5,1};

        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            result= result ^ arr[i];
        }
        int result1=0,result2=0;
        int last_set_bit = result & ~( result - 1);
        for(int i=0;i<arr.length;i++){

            if((arr[i] & last_set_bit) !=0){
                result1= result1 ^ arr[i];
            }else{
                result2= result2 ^ arr[i];
            }
        }
        System.out.println(result1);
        System.out.println(result2);

        //Time Complexity = n
    }
}
