package com.hacker;

import java.util.HashMap;
import java.util.Map;

public class Displaymost_repeated_characterinstring 
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
	
	int maxcount=0;
	char mostchar='\0';
	
	for(Map.Entry<Character, Integer>entry:m.entrySet())
	{
		if(entry.getValue()>maxcount)
		{
			maxcount=entry.getValue();
			mostchar=entry.getKey();
		}
	
	}
	
	if(maxcount>1)
	{
		System.out.println("most repeated character:"+mostchar+" "+"count:"+maxcount);
	}
	else
		System.out.println("No repeated characters found");
}
}
