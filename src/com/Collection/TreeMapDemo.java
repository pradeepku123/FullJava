package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
   public static void main(String[] args) {
	   /* SortedMap Demo */ 
	  
    SortedMap<Integer, String> objTree=new TreeMap<Integer, String>();
    objTree.put(Integer.valueOf(104),"Pradeep");
    objTree.put(Integer.valueOf(102), "Kumar");
    objTree.put(Integer.valueOf(103),"Behera");
//  objTree.put(null,"work");   You Cant Insert Null Variable
  
    System.out.println("Sorted Map InterFacce Impliment On TREE MAP"+objTree);
   }
}
