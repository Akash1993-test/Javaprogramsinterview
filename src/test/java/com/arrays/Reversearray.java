	package com.arrays;

public class Reversearray 
{
 public static void main(String[] args) 
 {
	int[] a= {1,2,3,4,5};
	
	for(int i=0; i<a.length/2; i++)
	{
	 int temp=a[i];
	 a[i]=a[a.length-1-i];
	 a[a.length-1-i]=temp;
	 
	}
  System.out.println("reversed array");

  for(int i=0;i<a.length;i++)
  {
	  System.out.println(a[i]);
  }
 }
}
