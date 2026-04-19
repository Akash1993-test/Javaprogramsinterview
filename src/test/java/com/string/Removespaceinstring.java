package com.string;

public class Removespaceinstring 
{
public static void main(String[] args) 
{
	String str="hi        this        is          jspiders";
	String s="";
	 char[] ch=str.toCharArray();
	 for(int i=0;i<ch.length;)
	 {
		 while(i<ch.length && ch[i]!=' ')
		 {
		 s=s+ch[i];
		 i++;
		 } 
       
	 while(i<ch.length && ch[i]==' ')
		 i++;
        s=s+' ';
    }
	 System.out.println(s);
}
}



