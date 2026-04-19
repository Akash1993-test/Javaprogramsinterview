package com.practice;

public class Largestword 
{
public static void main(String[] args) 
{
String str="java programming language";

String[] words=str.split(" ");

String largestword="";
for(String word:words)
{
	if(word.length()>largestword.length())
	{
		largestword=word;
	}
}

System.out.println(largestword);
}
}
