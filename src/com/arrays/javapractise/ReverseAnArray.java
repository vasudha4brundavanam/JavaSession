package com.arrays.javapractise;

public class ReverseAnArray {
    static void reverseAnArray(int[] a)
    {   int left=0;
        int right =a.length-1;
        int temp=0;
        while(left<right)
        {
            temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] input={1,5,31,55,56,57};
        reverseAnArray(input);
        for(int x:input)
        {
            System.out.println(x);
        }
    }
}
