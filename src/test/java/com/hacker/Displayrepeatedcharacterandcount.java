package com.hacker;

import java.util.LinkedHashMap;
import java.util.Map;

public class Displayrepeatedcharacterandcount 
{
public static void main(String[] args) 
{
	String str="Java Programming";
	str=str.replaceAll("\\s", "");
	LinkedHashMap<Character,Integer> m=new LinkedHashMap<Character,Integer>();

	for(char ch:str.toCharArray())
	{
		m.put(ch, m.getOrDefault(ch, 0)+1);
	}
		System.out.println(m);
		
	for(Map.Entry<Character,Integer>entry:m.entrySet())	
	{
		if(entry.getValue()>1)
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
}
