package com.arrays;

import java.util.Scanner;

public class Bubblesort 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter your array");
		Scanner sc=new Scanner(System.in);
	
	      int[] a= new int[5];
	     
		  for(int i=0;i<a.length;i++)
		  {
		  a[i]=sc.nextInt();
		  }
	
		  for(int i=0;i<a.length;i++)
		  {
			  for(int j=0;j<a.length-1;j++)
			  {
				  if(a[j]>a[j+1])
				  {
					  int temp=a[j];
					  a[j]=a[j+1];
					  a[j+1]=temp;
				  }
			  }
		  }
		  
	
	for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
		
	
	
	}
}
