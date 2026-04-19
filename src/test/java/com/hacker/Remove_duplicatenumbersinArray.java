package com.hacker;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicatenumbersinArray 
{
public static void main(String[] args) 
{
	int[] arr = {1, 2, 2, 3, 3, 4};

//    for (int i = 0; i < arr.length; i++) 
//    {
//        boolean isDuplicate = false;
//
//        for (int j = i + 1; j < arr.length; j++)
//        {
//            if (arr[i] == arr[j]) 
//            {
//                isDuplicate = true;
//                break;
//            }
//        }
//
//        if (isDuplicate==false) {
//            System.out.print(arr[i] + " ");
//        }
//    }
    
    LinkedHashSet<Integer>set=new LinkedHashSet<Integer>();
    
    for(int a:arr)
    {
    	set.add(a);
    	
    }
    System.out.println(set);
}
}

