package com.arrays;

import java.util.Scanner;

public class Displaysmallalphabets 
{
public static void main(String[] args) 
{

	 Scanner sc=new Scanner(System.in);
		
	   char[] ch= new char[5];
	
	  for(int i=0;i<ch.length;i++)
	   {
		  ch[i]=sc.next().charAt(0);
	   }

	  for(int i=0;i<ch.length;i++)
	  {
		  if(ch[i]>='a' && ch[i]<='z')
		  {
			  System.out.println(ch[i]);
		  }
	  }
}
}
