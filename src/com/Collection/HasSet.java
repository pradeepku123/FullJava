package com.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HasSet {
   public static void main(String[] args) {
	  NavigableSet<String> set= new TreeSet<String>();
	  set.add("pradeep");
	  set.add("Kumar");
	  // set.add(null);
	  set.add("Iskemare");
	  set.add("yadoome");
	  set.add("Balukeswar");
	  set.add("Mamai");
	  set.add("ruksar");
	  set.add("Sanjaya");
	  set.add("Sanjayb");
	  
	//  set.clear();
/*	  //ITs Traverse The Set using For Each Loop 
	  for(String recString:set) {
		  System.out.print(recString+"  ");
	  }
	  // Traverse The Set using Iterater
	  Iterator<String> revSetIterator = set.iterator();
	  while(revSetIterator.hasNext()){
		  
		      String revIteratorString = revSetIterator.next();
		      System.out.println(revIteratorString);
		      if(revIteratorString.equals("pradeep"))
		       revSetIterator.remove();
		      
		  
	  }

	 // Convert Set To  Arrary
	  Object[] recvsetArray = set.toArray();
	  for(int i=0;i<recvsetArray.length;i++) {
		  System.out.println(recvsetArray[i]);
	  }
*/	   
	  
//	  System.out.println(set.first());
//	  System.out.println(set.last());
//     // set.clear(); // Clear All The  Data Of Set
//	  
//	  System.out.println(set.headSet("Sanjay"));
//	  System.out.println(set.tailSet("Sanjay"));
//	  System.out.println(set.subSet("ruksar123", "Iskemare1123"));
	  System.out.println(set);
   
//	  System.out.println(set.pollFirst());
//	  System.out.println(set.pollLast());
	  
	  
	  System.out.println("its"+set.higher("kumar"));
	  System.out.println(set.size());
	  System.out.println(set.contains("pradeep"));
	  System.out.println(set);
}
}
