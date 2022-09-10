package com.ds.bit_magic.lectures;

public class Power_Of_Two_Check {
    public static void main(String[] args) {
        //Assumption  input greater than 0
        //approach 1 :
        int m=32;
        int count2=0;
        while ( m>0 ){
            m= (m & (m-1));
            count2++;
            if(count2>1){
                break;
            }
        }
        if(count2==1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        //approach 2 : modified approach 1
        int n=16;
        if((n & n-1) ==0){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }

        //approach 3 : naive solution

        int x=40;
        boolean result=true;
        while( x != 1){
            if(x%2!=0 ){
                result=false;
                break;
            }
            x=x/2;
        }
        System.out.println(result?"Yes":"No");
    }
}
