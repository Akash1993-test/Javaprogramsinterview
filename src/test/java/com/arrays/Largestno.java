package com.arrays;

import java.util.Scanner;

public class Largestno
{
public static void main(String[] args) 
{


	
	int[] a={6,3,4,5,20};
	
	int largest=a[0];
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>largest)
		{
			largest=a[i];
			
		}
		
	}
	   
	   System.out.println(largest);
	
	 
}
}
