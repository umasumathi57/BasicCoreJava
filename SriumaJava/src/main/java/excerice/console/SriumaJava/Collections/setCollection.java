package excerice.console.SriumaJava.Collections;

import java.util.HashSet;
import java.util.TreeSet;

/*
 * Set - 1)HashSet  
 * 		2)TreeSet
 * */

public class setCollection {
	
	public static void main(String[] args) {
		
		//Hashset -display o/p in random order 
		// must import java.util.HashSet
		
		HashSet set=new HashSet();
		
		set.add("rose");
		set.add("jasmine");
		set.add(29);
		
		System.out.println("set all elements");
		System.out.println(set);
		
		set.remove("jasmine");
		System.out.println("after remove");
		System.out.println(set);
		
		
	// Tree set - must import java.util.TreeSet;
		TreeSet set1=new TreeSet();
		
//		 Contains() 
//			contains() method checks whether a string contains a sequence of characters.
//			Returns true if the characters exist and false if not.
		
	
		System.out.println("contains answer");
		System.out.println(set.contains("rose"));
		System.out.println(set1.contains("rose"));

	}
	

}
