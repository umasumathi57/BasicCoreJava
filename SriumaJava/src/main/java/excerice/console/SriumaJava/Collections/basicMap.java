package excerice.console.SriumaJava.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;


public class basicMap {
	
	public static void main(String[] args) {
		
		Hashtable<String, Integer> ht=new Hashtable<String, Integer>();//Hashtable
		
		ht.put("tam",94);
		ht.put("eng",86);
		ht.put("mat", 96);
		ht.put("sci", 98);
		ht.put("soci", 97);
		
		System.out.println("elements in hashtable:"+ht);
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();   //HashMap
		
		hm.putAll(ht);
		System.out.println("list in HasMap:"+hm);
		
		
		TreeMap<String,Integer> tmap=new TreeMap<String,Integer>();  //TreeMap
		tmap.putAll(hm);
		System.out.println("list in tmap"+tmap);
		ht.remove("eng");
		System.out.println("after remove key"+ht);
//		ht.remove(97);
//		System.out.println("after remove value"+ht);
		
		
		//the java.util.Map.containsKey() method is used to check whether a particular key is being mapped into the Map or not		
		
		System.out.println("containskey");
		System.out.println(tmap.containsKey("tam"));
		
		System.out.println(tmap.get("tam"));    // get used for provide values for given key
		System.out.println("keyset");
		System.out.println(tmap.keySet());    // collect n print all key
		
		
		Set<String> s=tmap.keySet();     // another way of get keys
		System.out.println("s value"+s);
		
		Collection<Integer> i=tmap.values(); //collection
		
		System.out.println("v values" + i);
		
	
	}
	
	
	
	

}
