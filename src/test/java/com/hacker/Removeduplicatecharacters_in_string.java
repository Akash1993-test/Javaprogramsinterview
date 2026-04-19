package com.hacker;

import java.util.LinkedHashSet;

public class Removeduplicatecharacters_in_string 
{
public static void main(String[] args) 
{
String str="Java programming";
str=str.replaceAll("\\s", "");

LinkedHashSet<Character>set=new LinkedHashSet<Character>();

for(char ch:str.toCharArray())
{
	set.add(ch);
}
	System.out.println(set);
	
	StringBuilder sb=new StringBuilder();
	
	for(char ch:set)
	{
		sb.append(ch);
	}
	
	System.out.println(sb);
}
}
