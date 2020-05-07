package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		int i=0;
		al.add("pradeep");
		al.add("kumar");
		al.add("behera");
		al.add("sarat");
		al.add("sanjay");
		al.add("jijo");
		//System.out.println(al.get(5));  //if you acess out of Rang Then its Throws IndexOutofBoundException
/*		for(String recvArrayList:al) {
			System.out.println("Values Which Extract Index:: "+i+" "+recvArrayList);
			i++;
		}
		i=0;
		//Extract Valu Of Array List using Iterator
		  Iterator<String> iterartorObjForArrayList = al.iterator();
		  while(iterartorObjForArrayList.hasNext()) {
			     String recvStringofIteratorList = iterartorObjForArrayList.next();
			     System.out.println("Values Of Iteratror index: "+i+"  "+recvStringofIteratorList);
			     i++;
		  } 
		  i=0;
		  ListIterator<String> cursurIterator = al.listIterator();
		  while(cursurIterator.hasNext()) {
			  System.out.println(cursurIterator.next());
			  if(i==3)
			  System.out.println("Previous"+cursurIterator.previous());
			  i++;
		  }
		  */
		
		 al.set(2,"Replace");
		
		System.out.println("Default Display:-"+al);
	}

}
