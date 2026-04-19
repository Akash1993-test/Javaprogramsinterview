package com.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Displaythecharacter_highestoccur 
{
public static void main(String[] args) 
{
String str="Java Programming";
str=str.replaceAll("\\s", "");

LinkedHashMap<Character,Integer>m=new LinkedHashMap<Character, Integer>();

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

System.out.println(mostchar);
if(maxcount>1)
{
	System.out.println("most character: "+mostchar+" count: "+maxcount);
}

else
	System.out.println("most character not present");

}
}
