package com.learn.program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MostRepeatedWord 
{
	 public static void main(String[] args) 
	    { 
	        HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
	     
	        BufferedReader reader = null;
	         
	        try
	        {
	            reader = new BufferedReader(new FileReader("C:\\\\SOHAN\\\\test.txt"));
	            
	            String currentLine = reader.readLine();
	             
	            while (currentLine != null)
	            { 
	                String[] words = currentLine.toLowerCase().split(" ");
	               //  System.out.println(words.toString());
	                for (String word : words)
	                {
	                    if(wordCountMap.containsKey(word))
	                    {   
	                        wordCountMap.put(word, wordCountMap.get(word)+1);
	                    }
	                 
	                    else
	                    {
	                        wordCountMap.put(word, 1);
	                    }
	                }
	                
	                currentLine = reader.readLine();
	            }
	           
	            String mostLeastRepeatedWord = null;
	            
	            int minvalue = Collections.min(wordCountMap.values());
	           //System.out.println(minvalue);
	            Set<Entry<String, Integer>> entrySet = wordCountMap.entrySet();
	           System.out.println(entrySet);
	            for (Entry<String, Integer> entry : entrySet)
	            {
	            	System.out.println(entry.getValue());
	                if(entry.getValue() == minvalue) //checking first with one count
	                {
	                    mostLeastRepeatedWord = entry.getKey();
	                   
	                }
	            }
	             
	            System.out.println("The most least repeated word in input file is : "+mostLeastRepeatedWord+" count "+minvalue);
	             
	        } 
	        catch (IOException e) 
	        {
	            e.printStackTrace();
	        }
	        finally
	        {
	            try
	            {
	                reader.close();           //Closing the reader
	            }
	            catch (IOException e) 
	            {
	                e.printStackTrace();
	            }
	        }
	    }  
}
