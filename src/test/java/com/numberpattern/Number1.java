package com.numberpattern;

public class Number1 
{
public static void main(String[] args) 
{
int i,j,row=6;

for(i=1;i<=row;i++)
{
	int number=1;   
	for(j=1;j<=i;j++)
	{
		System.out.print(number+ " ");   
		//incrementing the value of number   
		number++;   
	}
	System.out.println();
}
	
	
}
}
