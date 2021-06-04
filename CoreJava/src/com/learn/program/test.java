package com.learn.program;

import java.util.ArrayList;

public class test{  
public static void main(String args[])
{  
	int test=123456;
	int temp = test;
	ArrayList<Integer> a = new ArrayList<Integer>();
	do{
	    a.add(temp % 10);
	    temp /= 10;
	} while  (temp > 0);

for(int i=0;i<a.size();i++){  
if(a.get(i)%2!=0){  
System.out.print(a.get(i));  
}  
}  
 
for(int i=0;i<a.size();i++){  
if(a.get(i)%2==0){  
System.out.print(a.get(i));  
}  
}  
}}