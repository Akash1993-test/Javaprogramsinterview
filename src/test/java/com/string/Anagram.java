package com.string;

public class Anagram 
{
 public static void main(String[] args) 
{


	 String str1="Keep";
	 String str2="peeK";
	int len1=str1.length();
	int len2=str2.length();
	int c1=0;
	int c=0;
	if(len1==len2)
	{
	 for(int i=0;i<len1;i++)
	 {
		 c=0;
		for(int j=0;j<len2;j++)
		  {
			 
			 if(str1.charAt(i)==str2.charAt(j))
			 {
				 c++;
				 
			 }
			
		   }
		if(c==0)
		{
			c1=1;
			
		}
			
	 }
	 if(c1==1)
	 {
		 System.out.println("no is not anagram");
		 
	 }
	 else
	 {
		 System.out.println("no is anagram");
	 }
	 
   }
	
	
}
}
