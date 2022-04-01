package excerice.console.SriumaJava.Collections;

import java.util.LinkedList;

/*
 * Linkedlist -- First in first out - must import java.util.LinkedList;
 * */

public class linkedList {
	
	public static void main(String[] args) {
		
		LinkedList link=new LinkedList(); //obj creation
		
		link.add("Boostrap");
		link.add("animation");
		link.add(8);
		link.add('d');
		
		System.out.println("Listing elements on link");
		System.out.println(link);
		
		link.remove(2);									//remove
		System.out.println("list after delete 'd' ");
		System.out.println(link);
		
		System.out.println(link.get(0));                //get(index)
		
		link.set(1, "presentation"); //set
		System.out.println("after set 1 th index");
		System.out.println(link);
		
		System.out.println(link.indexOf(8));  // indexOf() o/p- true as integer(index) false as -1
		System.out.println(link.indexOf('d'));
		
		link.removeLast();							//removeLast
		System.out.println("after removeLast");
		System.out.println(link);
		System.out.println(link.getLast());			//getLast
		System.out.println(link.getFirst());		//getFirst
		
		
	}

}
