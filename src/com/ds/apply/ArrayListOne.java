package com.ds.apply;
import java.util.*;

public class ArrayListOne {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Hello");
		System.out.println(al.get(0));
		ArrayList<Integer> al2=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			al2.add(Integer.valueOf(i));
		}
		System.out.println(al2);
		for(Integer i:al2) {
			System.out.print(i);
		}
	}
	

}
