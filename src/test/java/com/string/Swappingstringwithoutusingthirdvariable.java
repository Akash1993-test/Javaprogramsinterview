package com.string;

public class Swappingstringwithoutusingthirdvariable 
{

	public static void main(String[] args) 
	{
	
		String a = "Love";  
        String b = "You";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;  
        b = a.substring(0, a.length() - b.length());   
        System.out.println(b.length());
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b);  
        
//        System.out.println(a.length());
//        b=a.substring(0, 2);
       
        
        
        
        
	}
}
