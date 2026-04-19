package com.string;

import java.util.Scanner;

public class Checksubstringpresent 
{
 public static void main(String[] args) 
 {
	    Scanner sc =new Scanner(System.in);
		System.out.println("enter the main string");
		String str1=sc.nextLine();
		System.out.println("enter the sub string");
		//Scanner sc1=new Scanner(System.in);
		String str2=sc.nextLine();
		char[] mainstr=str1.toCharArray();
		char[] substr=str2.toCharArray();
	    int count=substr.length;
		int tempcount=0;
		int j=0;
		 for(int i=0;i<mainstr.length;i++)
		 {
			 while(i<mainstr.length && j<substr.length)
			 {
				 if(mainstr[i]==substr[j])
					 
				 {
					 tempcount++;
					 j++;
					i++;
				 }
				 else
					 break;
			 }
			 if(count==tempcount)
			 {
				 System.out.println("sub-string is present");
				 break;
			 }
			 
			 
		 
			tempcount=0;
			j=0;
		 }
		 if(count!=tempcount)
		 {
			 System.out.println("sub-string is not present");
		 }
 }
}
