package jdk8;

import java.util.ArrayList;
import java.util.List;

public class StartWithString
{
public static void main(String[] args) {
	List<String> l= new ArrayList<String>();
	l.add("apple");
	l.add("mango");
	l.add("banana");
	l.add("banana1");
	l.stream().filter((s)->s.startsWith("b")).forEach(System.out::println);
	
}
}
