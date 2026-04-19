package com.arrays;

import java.util.Scanner;

public class Checknumberisprimeno 
{
 public static void main(String[] args)
 {
	 System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
     boolean flag = false;
     
     if(num==1)
     {
    	 flag=true;
     }
     for(int i = 2; i <= num/2; i++)
     {
         // condition for nonprime number
         if(num % i == 0)
         {
             flag = true;
             break;
         }
     }

     if (flag==false)
         System.out.println(num + " is a prime number.");
     else
         System.out.println(num + " is not a prime number.");
 }
}
