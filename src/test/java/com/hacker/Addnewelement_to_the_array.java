package com.hacker;

public class Addnewelement_to_the_array 
{
public static void main(String[] args) 
{
int[] a= {1,2,3,4};

int newnumber=5;


int[] newarr=new int[a.length+1];

for(int i=0;i<a.length;i++)
{
	newarr[i]=a[i];
}

newarr[a.length]=5;

for(int i=0;i<newarr.length;i++)
{
	System.out.println(newarr[i]);
}
}
}
