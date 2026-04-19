package com.basic;

public class Pallindromeno 
{
 public static void main(String[] args) 
 {
 
	 int r,n=454,sum=0,temp;
	 
	 temp=n;
	 while(n>0)
	 {
		 r=n%10;
		 sum=(sum*10)+r;
		 n=n/10;
	 }
	 if(temp==sum)
		 System.out.println("number is pallindrome");
	 else
	 System.out.println("number is not pallindrome");
 }
}
