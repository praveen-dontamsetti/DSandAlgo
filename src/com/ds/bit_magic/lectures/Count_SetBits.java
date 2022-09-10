package com.ds.bit_magic.lectures;

public class Count_SetBits {
    public static void main(String[] args) {
        //********  approach 1 : naive solution
        //Time Complexity: O(logn)
        //Auxiliary Space: O(1)
        int n=5;
        int count1=0;
        while(n>0){
            if((n % 2) ==1 ){  // (n & 1) ==1
                count1++;
            }
            n=n/2;             // n=n>>1  right shift by one
        }
        System.out.println(count1);

        //******** approach 2 : Brian Kerninghan's Algorithm
        //Time Complexity: O(logn)  actually O(set bit count)
        //Auxiliary Space: O(1)

        int m=10;
        int count2=0;
        while ( m>0 ){
            m= (m & (m-1));
            count2++;
        }
        System.out.println(count2);

        //*********  approach 3 : lookup table
        //Time Complexity: O(1)
        //Auxiliary Space: O(1)
        int o=23;
        int[] table = new int[256];
        table[0]=0;
        int count3=0;
        for(int i=1;i<256;i++){
            table[i]= (i & 1) + table[i/2];
        }

        count3 = table[ o & 255];
        o=o >> 8;
        count3 = table[ o & 255] + count3;
        o=o >> 8;
        count3 = table[ o & 255] + count3;
        o=o >> 8;
        count3 = table[ o & 255] + count3;

        System.out.println(count3);

        int k=12;

        k=k & ~(k-1);
        int z= (int)(Math.log(k)/Math.log(2.0)) +1;
        System.out.println(z);


        int l=10;
        int p= (int)(Math.log(l)/Math.log(2.0));
        System.out.println(p-1);
        System.out.println(1<<p-1);
    }
}
