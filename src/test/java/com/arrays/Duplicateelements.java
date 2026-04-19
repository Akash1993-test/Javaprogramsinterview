package com.arrays;

import java.util.HashMap;
import java.util.Map;

import net.bytebuddy.implementation.EqualsMethod;

public class Duplicateelements 
{
public static void main(String[] args) 
{

	int[] a= {1,2,3,2,1};
	
Map<Integer,Integer> m=new HashMap<Integer,Integer>();

for(Integer ai:a)
{
	m.put(ai, m.getOrDefault(ai,0)+1);
	
}

System.out.println(m);
	
	for(Map.Entry<Integer,Integer>mi:m.entrySet())
	{
		if(mi.getValue()>1)
		{
			System.out.println(mi.getKey());
		}
	}
	
	
	
	
	

	
	
}
}
