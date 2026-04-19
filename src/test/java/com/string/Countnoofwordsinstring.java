package com.string;

public class Countnoofwordsinstring 
{
public static void main(String[] args) 
{


	String str=" Hi     This        is          Akash  ";

	if (str == null || str.trim().isEmpty())//null: check string is empty
	{
	    System.out.println("Number of words: 0");
	} else {
	    String[] words = str.trim().split("\\s+");//split: breaks string into parts, \\s+: one or more white space characters 
	    System.out.println("Number of words: " + words.length);
	}
	
	
	
	
	
	
	
}

}
