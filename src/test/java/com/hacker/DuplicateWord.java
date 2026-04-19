package com.hacker;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord
{

	public static void main(String[] args) 
	{
		
	String string = "Big black bug bit a big black dog on his big black nose";    

	String[] words=string.split(" ");	
	
	Map<String, Integer> m=new HashMap<String, Integer>();
	
	for(String st:words)
	{
		m.put(st, m.getOrDefault(st, 0)+1);
	}
	
	System.out.println(m);
	
	for(Map.Entry<String, Integer>entry:m.entrySet())
	{
		if(entry.getValue()>1)
		{
			System.out.println(entry.getKey());
		}
	}
	
	}

}
