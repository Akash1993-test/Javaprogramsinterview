package com.string;

public class Reverseofstring 
{
public static void main(String[] args) 
{

    String str="Akash";
    char[] ch=str.toCharArray();
    String revstr="";
    for(int i=ch.length-1;i>=0;i--)
    {
    	revstr=revstr+ch[i];
    }
    System.out.println(revstr);	
    System.out.println(str.length());	
    System.out.println(ch.length);
}
}
