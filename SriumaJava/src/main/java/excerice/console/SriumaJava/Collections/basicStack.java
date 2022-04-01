package excerice.console.SriumaJava.Collections;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

//Collections - Dynamic temporary memory, no type & size restriction, security 
/*
 * Syntax: collectioncls<cls> object=new collectioncls<cls>();
 *  type restriction: 
 *  1) generic - no specific( all data types)  2) non generic - specific (Int,float)
 *  base -- iterable (interface)
 *  1)List { position, duplicates}
 *  2)Set  {no position, no duplicates}
 *  3)Map  {Key class- unique , value class- change}
 */ 


/*
 * List 
 * 1)Stack- last in first out
 * 5 methods
 * 1-push 2-pop 3-search 4-peek 5-clear
 * */ 


public class basicStack {
	
	public static void main(String[] args) {
		
		Stack s=new Stack();                     //generic
		Stack<String> s1=new Stack<String>();    //non generic
		
		List s2=new Stack();        			// base cls obj creation
		
		
		s.push("sriuma");						//push - adding elements
		s.push(99);
		System.out.println("listing s obj elements");
		System.out.println(s);
		
		s.add('b');								//add
		System.out.println("After add ");
		System.out.println(s);
		
		Iterator<Object> it=s.iterator();    //Iterator
		System.out.println("Iterator ");
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
		
		s.pop();							//Pop
		System.out.println("after Pop");
		System.out.println(s);
		
		System.out.println("after peek");

		System.out.println(s.peek());		//peek - indicate top element(last element)
		
//		System.out.println("after clear");
//		
//		s.clear();							//clear
//		System.out.println(s);
//		System.out.println(s.isEmpty()); 	//isEmpty 
		
		//s.search("sriuma");					
		System.out.println("after search");		//search
		System.out.println(s.search("sriuma"));
		System.out.println(s.search('b'));

	}		

}
