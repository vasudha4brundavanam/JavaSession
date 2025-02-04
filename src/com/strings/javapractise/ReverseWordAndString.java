package com.strings.javapractise;

import java.net.SocketOption;

public class ReverseWordAndString {
     static String reversingWordsAndString(String input)
    {
        String output="";
        String[] wordList=input.split(" ");
        for(int i=wordList.length-1;i>=0;i--)
        {
            StringBuilder sb=new StringBuilder(wordList[i]);
            output += sb.reverse()+" ";
        }
        return output.trim();
    }

    public static void main(String[] args) {
        String input=" I am a SDET Engineer at AT&T";
        System.out.println(reversingWordsAndString(input));

    }


}
