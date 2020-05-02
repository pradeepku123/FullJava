package com.Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapImpliment {
	
	public static void main(String[] args) {
		HashMap<Integer,String> mapObj=new HashMap<Integer, String>();
		mapObj.put(Integer.valueOf(101), "Pradeep Kumar Behera");
		mapObj.put(102, "Prabhat Kumar behera0");
		System.out.println(mapObj);
		HashSet<Integer> hasSet=new HashSet<Integer>();
		hasSet.add(101);
		hasSet.iterator();
		// Key Specific Value Retrival
		System.out.println("Hello World::"+mapObj.get(101));
		System.out.println(mapObj.containsKey(102)); //Check Contains Key
		System.out.println(mapObj.containsValue("Pradeep Kumar Behera"));
		//Traverse The Map With For Loop
		Set<Entry<Integer, String>> set = mapObj.entrySet();
		for(Entry entry:set) {
		    System.out.println(entry+"Entry");
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
		//Traverse The MAP With Iterator 
		Iterator<Entry<Integer, String>> mapIterator = mapObj.entrySet().iterator();
		while (mapIterator.hasNext()) {
			Entry entry =  mapIterator.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
			
		}
	}

}
