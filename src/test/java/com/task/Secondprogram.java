package com.task;

import java.util.LinkedHashMap;
import java.util.Map;

public class Secondprogram 
{
public static void main(String[] args) 
{
//	Input:"aaabbcddd"
//		 
//		output: a3b2c1d3	
	
	String str="aaabbcddd";
	
	Map<Character,Integer> m=new LinkedHashMap<Character,Integer>();
	
	for(char ch:str.toCharArray())
	{
		m.put(ch, m.getOrDefault(ch, 0)+1);
		
	}
	
	for(Map.Entry<Character,Integer>entry:m.entrySet())
	{
		System.out.print(entry.getKey()+" "+entry.getValue());
	}
	//System.out.println(m);
	
	
	
}
}
