package com.arrays.javapractise;

public class IsArraySorted {
    static boolean isArraySorted(int[] input)
    {
        int i=0;
        while(i<input.length-1)
        {
            if(input[i]>input[i+1]) {
                return false;
            }
       i++;
        }
        return true;
    }
    public static void main(String[] args) {
       int[] input={1,0,2,3,5,11};
       System.out.print(isArraySorted(input));
    }

}
