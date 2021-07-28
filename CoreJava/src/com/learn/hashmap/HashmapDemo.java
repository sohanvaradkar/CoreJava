package com.learn.hashmap;
import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
public static void main(String[] args) {
	Map<String, Integer> map=new HashMap<>();
	map.put(null, 1);
	map.put(null, 2);
	System.out.println("putting  "+map.put("sohan", 2));
	//hash
	//map.
	//map.ge
	for(Map.Entry m : map.entrySet()){    
	   System.out.println(m.getKey());  
	   System.out.println(m.getValue()); 
	   } 
	
}
}
