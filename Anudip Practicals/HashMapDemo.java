//Write a Java program to associate the specified value with the specified key in a HashMap

package practice;

import java.util.*; 

public class HashMapDemo {
	
	  public static void main(String args[]) {  
	  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
	  hash_map.put(1, "Purple");
	  hash_map.put(2, "White");
	  hash_map.put(3, "Yellow");
	  
	  for(Map.Entry x:hash_map.entrySet()){  
	   System.out.println(x.getKey()+" "+x.getValue());  
	  }  
	 }  
	}
