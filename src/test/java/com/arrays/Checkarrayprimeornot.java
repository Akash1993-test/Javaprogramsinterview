package com.arrays;

public class Checkarrayprimeornot 
{

	public static void main(String[] args) 
	{
	int[] a= {1,2,3,4,5,7,8};

	
	for(int i=0;i<a.length;i++)
	{
		int count=0;
		
		for(int j=a[i];j>=1;j--)
		{
			if(a[i]%j==0)
			{
				count=count+1;
				
			}
		}
		
		if(count==2)
			System.out.println(a[i]+"is prime number");
		else
			System.out.println(a[i]+"is not prime number");
		
	}
		
	}
}
