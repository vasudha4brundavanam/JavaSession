package com.arrays.javapractise;

public class MergeSortedArray {
    private static int[] mergeSortedArray(int[] array1,int[] array2)
    {
        int size=array1.length+array2.length;
        int[] mergedArray=new int[size] ;
        int i=0;
        int k=0;
        int j=0;
        while(i<array1.length && k<array2.length)
        {
            if(array1[i]<array2[k])
            {
                mergedArray[j++]=array1[i++];
            }
            else
            {
                mergedArray[j++]=array2[k++];

            }

            }
        while(i<array1.length)
        {
            mergedArray[j++]=array1[i++];
        }
        while(k<array2.length)
        {
            mergedArray[j++]=array2[k++];
        }
        return mergedArray;
    }
    public static void main(String[] args) {
int input1[]={1,2,3,4,7,9};
int input2[]={2,5,9,10,14};
    int output[]=    mergeSortedArray(input1,input2);
    for(int i:output)
        System.out.print(i+ " ");
    }
}
