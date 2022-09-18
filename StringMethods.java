import java.io.*;
import java.util.*;

class StringMethods 
{
    public static void main(String[] args)
    {
        String s="Computer science ";
        System.out.println("String Length = "+s.length());
        System.out.println("Character at 3rd position =  "+s.charAt(3));
        System.out.println("Substring = "+s.substring(3));
        System.out.println("Substring = "+s.substring(2,5));
        String s1="Msc";
        String s2="CS";
        System.out.println("Concantenated String = "+s1.concat(s2));
        String s4="Learn Share Learn";
        System.out.println("Index of Share = "+s4.indexOf("Share"));
        System.out.println("Index of a = "+s4.indexOf('a',3));
        Boolean out="Computer".equals("computer");
        System.out.println("Checking Equality =  "+out);
        out="Computer".equals("Computer");
        System.out.println("Checking equality = "+out);
        out="Computer".equalsIgnoreCase("ComPutEr");
        System.out.println("Checking equality = "+out);
        int out1=s1.compareTo(s2);
        System.out.println("The difference between ASCII value is =  "+out1);
        String word1="ComPuTer";
        System.out.println("Changing to lower case : "+word1.toLowerCase());
        String word2="ComPuTer";
        System.out.println("Changing to upper case : "+word2.toUpperCase());
        String word4="Learn Share Learn";
        System.out.println("Trim the word : "+word4.trim());
        String str1="Java programming";
        System.out.println("Original string : "+str1);
        String str2=str1.replace('a','e');
        System.out.println("Repalced a with e : "+str2);
    }
}