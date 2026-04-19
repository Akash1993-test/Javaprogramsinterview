package com.practice;

import java.util.LinkedHashMap;

public class P1 
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


}
}
