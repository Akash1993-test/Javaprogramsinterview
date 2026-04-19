package com.string;

public class Convertcapitaltosmall 
{
public static void main(String[] args) 
{

	String str="HI THIS is JspIDERS";
    char[] ch=str.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
 	   if(ch[i]>='a' && ch[i]<='z')
 		   ch[i]=(char)(ch[i]-32);
 		   else if(ch[i]>='A' && ch[i]<='Z')
 			   ch[i]=(char)(ch[i]+32);
 		   
 	   
    }    
    System.out.println("Input String");
    System.out.println(str);
    System.out.println("Output String");
    for(int i=0;i<ch.length;i++)
    {
 	   System.out.print(ch[i]);
    }
    

}
}
