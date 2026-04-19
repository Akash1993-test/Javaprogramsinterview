package com.starpattern;

public class Reversepyramid 
{
public static void main(String[] args)
{
	int rows=6;  
	for (int i=1; i<=rows; i++)  
	{  
	for (int j=1; j<=i; j++)  
	{  
	System.out.print(" ");  
	}  
	for (int k=0; k<=rows-i; k++)  
	{  
	System.out.print("*" + " ");  
	}  
	System.out.println();  
	}  
	
	
	
	
	
	
}
}
