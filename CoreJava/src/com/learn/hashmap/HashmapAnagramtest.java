package com.learn.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashmapAnagramtest 
{
	public static void checkanagram(String arr[]) 
	{
		HashMap<String, List<String>> hs=new HashMap<String, List<String>>();
		//{"abc","cup","bca","puc","book","koob"}
		//String str=new String();
		//String str1="";
		for (int i = 0; i < arr.length; i++) 
		{
			String str=arr[i];
			//System.out.println(str);
			char[] ch=str.toCharArray();
			Arrays.sort(ch);
			String sortword=new String(ch);
			
			if (hs.containsKey(sortword)) {
				hs.get(sortword).add(str);
				
			}
			else {
				
			List<String> al=new ArrayList<>();
			al.add(str);
			hs.put(sortword, al);
			
			
			
				
			}
			//System.out.println(hs.toString());
			//System.out.println(hs.toString());
		}
		System.out.println(hs.toString());
		
		
	}
	
public static void main(String[] args) 
{
	
	/*
	 * Set<String> st=new HashSet<>(); st.add("abc"); st.add("abc");
	 * System.out.println(st.size());//1
	 * 
	 * List<String> al=new ArrayList<>(); al.add("abc"); al.add("abc");
	 * System.out.println(al.size());//2
	 */	 
	
	String[] str= {"abc","cup","bca","puc","book","koob"};
	
	checkanagram(str);
	
}
}
