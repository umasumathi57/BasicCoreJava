package excerice.console.SriumaJava.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

// 1)Array List   
// 2)Vector 
//Collections

public class arrListVector {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(67);
		al.add(99);
		al.add(12);
		al.add(104);
		System.out.println("elements in arraylist");
		System.out.println(al);
		
		Vector<Integer> v=new Vector<Integer>();
		
		v.addAll(al);
		System.out.println("after addingall to vector");
		System.out.println(v);
		
		//collections methods
		
		Collections.sort(al);                     // sort - default provide ascending order
		System.out.println("after sort");
		System.out.println(al);
		
		Collections.reverse(al);					// reverse ( no sorting will happens, only given elements  will display reverse order)
		System.out.println(al);
		
		System.out.println("min"+Collections.min(v)); // min
		System.out.println("max"+Collections.max(v));	// max
		
		
		Collections.replaceAll(al, 104, 79);
		System.out.println("after replace on oth index");
		System.out.println(al);
		
		v.retainAll(al);				//* RetainAll - remove different elements 
		System.out.println("after retain vectorlist from arraylist ");  
		System.out.println(v);
		
		al.removeAll(v);				//*RomveAll - remove common elements
		System.out.println("after removeall");
		System.out.println(al);
		
		
	}

}
