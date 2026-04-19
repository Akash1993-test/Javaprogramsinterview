package com.arrays;

import java.util.Scanner;

public class Checkelementpresentornot 
{
public static void main(String[] args) 
{

	System.out.println("Enter elements");
	Scanner sc=new Scanner(System.in);
	
	boolean flag=false;
	   int[] a= new int[5];
	  
	   for(int i=0;i<a.length;i++)
		  {
		  a[i]=sc.nextInt();
		  }
	   
	   System.out.println("Enter search element");
	   int element=sc.nextInt();
	   
	   for(int i=0;i<a.length;i++)
	   {
		   if(element==a[i])
		   {
			   flag=true;
			   break;
		   }
		   
	   }
	   
	   if(flag==true)
	   {
		   System.out.println("Element is present");
	   }
	   else
		   
		   System.out.println("Element is not present");
}
}
