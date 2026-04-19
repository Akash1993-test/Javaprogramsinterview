package com.hacker;

import java.util.LinkedHashMap;
import java.util.Map;

public class Display2nd_Non_repeated_characterinstring 
{
 public static void main(String[] args) 
{

	 String str = "selenium";

	 str=str.replaceAll("\\s", "").toLowerCase();
	 
	 
     
	Map<Character,Integer> m=new LinkedHashMap<Character, Integer>();
	
	for(char ch:str.toCharArray())
	{
		m.put(ch, m.getOrDefault(ch, 0)+1);
	}
	System.out.println(m);
	 
     int count=0;
     
     for(Map.Entry<Character,Integer>entry:m.entrySet())
     {
    	 if(entry.getValue()==1)
    	 {
    		 count++;
    		 
    		 if(count==2)
    		 {
    			 System.out.println("second non repeated character:"+" "+entry.getKey());
    			 return;
    	     }
    		 
         }
     
     }
     
     System.out.println("Second non repeated character not found");
	

}
}
