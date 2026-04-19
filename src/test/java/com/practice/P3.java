package com.practice;

import java.util.HashMap;
import java.util.Map;

public class P3 
{
public static void main(String[] args) 
{
String str="java programming";
	
	str=str.replaceAll("\\s", "").toLowerCase();
	
	Map<Character,Integer>m=new HashMap<Character,Integer>();
	
	for(char ch:str.toCharArray())
	{
		m.put(ch, m.getOrDefault(ch, 0)+1);
	}
	
	System.out.println(m);	
	
	int count=0;
	
	for(Map.Entry<Character, Integer>entry:m.entrySet())
	{
		if(entry.getValue()==1)
		{
			count++;
			
			if(count==2)
			{
				System.out.println(entry.getKey()+" "+entry.getValue());
				return;
			}
			
		}
	}
	
	System.out.println("second non repeated character not found");
}
}
