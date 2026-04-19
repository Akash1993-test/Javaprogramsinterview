package com.arrays;

import java.util.Scanner;

public class Printuniqueelements 
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
	   
	   for(int i=0;i<a.length;i++)
	   {
		   int count=0;
		   
		   
		   for(int j=0;j<a.length;j++)
		   {
			   if(i!=j)
			   {
			    if(a[i]==a[j])
			    {
				   count++;
				   
			    }
			   }
		   }
		   
		   if(count==0)
		   {
			   System.out.println(a[i]+" is unique");
		   }
		   
	   }
	   
	   
	   
	   
	   
	   
	   
}
}
