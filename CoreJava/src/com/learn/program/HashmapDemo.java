package com.learn.program;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashmapDemo {
public static void main(String[] args) {
	Map<Integer, String> map=new HashMap<>();
	map.put(null, "S1");
	map.put(1, "S2");
	map.put(2, "S3");
	map.put(3, "S4");
	

	for(Map.Entry m : map.entrySet()){    
	    System.out.println(m.getValue()+" :: "+m.getKey());    
	   } 
	
}
}
