package com.hacker;

public class Largestword_in_String
{
public static void main(String[] args) 
{

	String str="I Love Java Programming";
	String[] words=str.split(" ");
	
	
	String largestword="";
	
	for(String word:words)
	{
	if(word.length()>largestword.length())
	{
		largestword=word;
	}
	}
	
	
	

//	for(int i=0;i<words.length;i++)
//	{
//		if(words[i].length()>largestword.length())
//		{
//			largestword=words[i];
//		}
//	}
	
	System.out.println("Largest word is:"+largestword);
}
}
