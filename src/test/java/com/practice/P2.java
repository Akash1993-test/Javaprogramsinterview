package com.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class P2 
{
public static void main(String[] args) 
{
String str="Java Programming";
str=str.replaceAll("\\s", "");

LinkedHashMap<Character,Integer> m=new LinkedHashMap<Character, Integer>();
for(char ch:str.toCharArray())
{
	m.put(ch, m.getOrDefault(ch, 0)+1);
}

System.out.println(m);

int maxcount=0;
char mostoccurchar='\0';
for(Map.Entry<Character, Integer>entry:m.entrySet())
{
	if(entry.getValue()>maxcount)
	{
		maxcount=entry.getValue();
		mostoccurchar=entry.getKey();
	}
}

if(maxcount>1)
{
	System.out.println("most repeated character: "+ mostoccurchar+" count:"+maxcount);
}
else
	System.out.println("no repeated characters found");

}
}
