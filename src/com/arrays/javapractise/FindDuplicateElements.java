package com.arrays.javapractise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElements {
    public static List<Integer> findDuplicateElements(int[] a)
    {
        Set<Integer> s=new HashSet<>();
        List<Integer> duplicates=new ArrayList<>();
        for(int each : a) {
            if(s.contains(each))
            {
                duplicates.add(each);
            }
            else
            s.add(each);
        }
        return duplicates;
    }
    public  static void main(String ags[])
    {
        int[] input={12,12,13,14,15,17,17,19,20,21,21};

        List<Integer> duplicates=findDuplicateElements(input);
        System.out.println("the following number are duplicates in array:");
        for(int each:duplicates)
            System.out.println(each);
    }
}
