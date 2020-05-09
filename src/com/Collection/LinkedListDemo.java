package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	 public static void main(String[] args) {
		LinkedList<String> demoLinkedList=new LinkedList<String>();
		demoLinkedList.add("Pradeep");
		demoLinkedList.add("Kumar");
		demoLinkedList.add("Behera");
		System.out.println(demoLinkedList);
		demoLinkedList.addFirst("GandiJi");
		System.out.println(demoLinkedList);
		demoLinkedList.add("Ya i MAyb Be First");
		System.out.println(demoLinkedList);
		demoLinkedList.addLast("Ya I am The Last Perstion");
		System.out.println(demoLinkedList);
		demoLinkedList.removeLast();
		System.out.println(demoLinkedList);
		demoLinkedList.removeFirst();
		System.out.println(demoLinkedList);
		ArrayList<String> al=new ArrayList<String>(demoLinkedList);
		Collections.sort(al);
		System.out.println(al);
		
		// Traverse The ArrayList
	/*	for(String RecvStringOfLinkedList:demoLinkedList) {
			System.out.println(RecvStringOfLinkedList);
		} */
		System.out.println(demoLinkedList.get(0));
		System.out.println(demoLinkedList.get(1));
		System.out.println(demoLinkedList.get(2));
		System.out.println(demoLinkedList.get(3));
		
		//Lets Traverse With Iterator
		
	      Iterator<String> irteratorLinkedList = demoLinkedList.iterator();
	      while(irteratorLinkedList.hasNext()) {
	    	  String recviteratoerString = irteratorLinkedList.next();
	    	  System.out.println(recviteratoerString);
	      }
	}

}
