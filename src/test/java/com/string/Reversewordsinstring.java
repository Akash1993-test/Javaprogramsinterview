package com.string;

public class Reversewordsinstring 
{
public static void main(String[] args) 
{

	String str="Hi this is Jspiders";
	 char[] ch=str.toCharArray();
	String revstr="";
	for(int i=0;i<ch.length;i++)
	{
		int k=i;
		while(i<ch.length && ch[i]!=' ')
		{
			i++;
		}
		int j=i-1;
		while(j>=k)
		{
			revstr=revstr+ch[j];
			j--;
		}
		if(i<ch.length && ch[i]==' ')
			revstr=revstr+ch[i];
	}
	System.out.println(revstr);
}
}
