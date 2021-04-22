package com.learn.hashmap;

import java.util.HashSet;

public class Hashmapmergearray 
{
	public static void findMissing(int[] n,int[] m) 
	{
		HashSet<Integer> hs =new HashSet<>();
		
		for (int i = 0; i < m.length; i++) 
		{
			hs.add(m[i]);
		}
		//System.out.println(hs.toString());
		
		for (int i = 0; i < n.length; i++) {
			//System.out.print(n[i]);
			if(!hs.contains(n[i]))
			{
				System.out.println(n[i]);
			}
			/*else
			{
				//System.out.println(m[i]);
			}*/
		}
	}
	
public static void main(String[] args) {
	int[] arr1= {1,2,3};
	int[] arr2= {2,3,4};
	
	findMissing(arr1,arr2);
}
}
