package com.arrays;

import java.util.Scanner;

public class Secondlarge 
{
public static void main(String[] args) 
{

	System.out.println("Enter elements");
	Scanner sc=new Scanner(System.in);
	
	   int[] a= new int[5];
	  
	   for(int i=0;i<a.length;i++)
		  {
		  a[i]=sc.nextInt();
		  }
	   
	   int largest=a[0];
	   
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]>largest)
		   {
			   largest=a[i];
			   
		   }
	   }
	   
	  int seclarge=a[0];
	  
	  for(int i=0;i<a.length;i++)
	   {
		   if(a[i]>seclarge)
		   {
			   if(a[i]!=largest)
			   {
			   seclarge=a[i];
			   }
		   }
	   }
	  
	  System.out.println(seclarge);
	   
	   
}
}
