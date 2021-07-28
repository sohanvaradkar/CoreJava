package com.learn.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatedChar 
{
	public static void repeatedChar(String s)
	{
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		
		char[] c=s.toCharArray();
		for (char d : c) {
			
			if(hm.containsKey(d))
				hm.put(d, hm.get(d)+1);
			else
				hm.put(d, 1);
			
			
		}
		for (char h : c) {
			//System.out.println(hm.get(h));
			if(hm.get(h)==1)
			{
				System.out.println("first nonrepeated char is : "+h);
				return;
			}
			
		}
	}
	
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter word");
	String Word=sc.nextLine();
	//System.out.println(Word);
	repeatedChar(Word);
}
}
