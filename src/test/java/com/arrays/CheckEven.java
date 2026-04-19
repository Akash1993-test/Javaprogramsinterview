package com.arrays;

import java.util.Scanner;

public class CheckEven 
{
public static void main(String[] args) 
{
System.out.println("Enter the elements");
Scanner sc=new Scanner(System.in);
int[] a=new int[5];
for(int i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
}

for(int i=0;i<a.length;i++)
{
	if(a[i]%2==0)
	{
		System.out.println(a[i]);
	}
}
}
}
