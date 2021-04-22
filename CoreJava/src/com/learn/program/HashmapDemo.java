package com.learn.program;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashmapDemo {
public static void main(String[] args) {
	Map<Integer, String> map=new ConcurrentHashMap<>();
	map.put(null, "S");
	map.put(null, "So");
	System.out.println(map.hashCode());
	//map.ge
	for(Map.Entry m : map.entrySet()){    
	    System.out.println(m.getValue());    
	   } 
	
}
}
