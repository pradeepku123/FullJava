package com.Collection;

import java.util.Vector;

public class LinkedListOne {

	public static void main(String[] args) {
		LinkedListOne al =new LinkedListOne();
		Vector v=new Vector();
		System.out.println("Size::"+v.size());
		System.out.println("Capacity::"+v.capacity());
		for(int i=0;i<10;i++) {
			v.add(i);
		}
		System.out.println(v);
		
	   v.addElement("A");
	   v.remove(5);
	   System.out.println(v);
	   System.out.println("Size::"+v.capacity());
	   System.out.println("Capacity"+v.size());
		
		

	}

}
