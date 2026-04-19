package com.hacker;

public class Pallindromeofstring 
{

	public static void main(String[] args)
	{
		String str="Akash";
	    char[] ch=str.toCharArray();
	    String revstr="";
	    for(int i=str.length()-1;i>=0;i--)
	    {
	    	revstr=revstr+ch[i];
	    }
	    System.out.println(revstr);	
	    System.out.println(str.length());	
	    System.out.println(ch.length);
	    
	    if(str.equals(revstr))
	    {
	    	System.out.println("String is pallindrome");
	    }
	    else
	    	System.out.println("String is not pallindrome");
	    
	}
}
