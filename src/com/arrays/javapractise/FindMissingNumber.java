package com.arrays.javapractise;

public class FindMissingNumber {
    public static int findMissingNumber(int n,int[] a)
    {
        int sum=n*(n+1)/2;
        int arraysum=0;
   for(int each:a)
   {
       arraysum+=each;
   }
   return sum-arraysum;

    }

    public static void main(String[] args) {
        int[] input={1,2,3,4,5,6,7,8,9,11};
        int n=11;
        System.out.print(findMissingNumber(n,input));
    }
}
