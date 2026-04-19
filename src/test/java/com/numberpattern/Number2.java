package com.numberpattern;

public class Number2 
{
public static void main(String[] args)
{
	int i,j,number=1,row=6;

	for(i=1;i<=row;i++)
	{
		   
		for(j=1;j<=i;j++)
		{
			System.out.print(number++ + " ");   
			//incrementing the value of number   
		}
		System.out.println();
	}	
}
}
