package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
   public static void main(String[] args) {
	   /* SortedMap Demo */ 
	  
    NavigableMap<Integer, String> objTree=new TreeMap<Integer, String>();
    objTree.put(Integer.valueOf(104),"Pradeep");
    objTree.put(Integer.valueOf(102), "Kumar");
    objTree.put(Integer.valueOf(107),"Behera");
    objTree.put(Integer.valueOf(109),"Behera");
    objTree.put(Integer.valueOf(129),"Behera129");
    objTree.put(Integer.valueOf(103),"Behera103");
    objTree.put(Integer.valueOf(111),"Behera111");
    objTree.put(Integer.valueOf(112),"Behera112");
    objTree.put(Integer.valueOf(110),"Behera110");
    objTree.put(Integer.valueOf(105),"Behera105");
    
//  objTree.put(null,"work");   You Cant Insert Null Variable
    
    //Check The Comparator
    
  /*  Comparator<? super Integer> recComparator = objTree.comparator();
    System.out.println(recComparator);//  Return Comparator Object Which is Used In Future Used
  */
    
//      System.out.println(objTree.firstKey()); // Return First Element Present In  The  sorted Map
//      System.out.println(objTree.headMap(107)); //Head Of The map
//      System.out.println(objTree.tailMap(107));  //its Return the map Which is After The Key Element From Current element
//      System.out.println(objTree.lastKey()); // Retuen The last Element Of The Sorted Set
//      
//      System.out.println(objTree.subMap(129, 103)); // its Depennds On The From_Key To To_Key Which is Provide The Range Of The Key 
//      	
        // it is return The All The key Set Of The map Whis is Set Of The Entry Which is full Of The  Entryies whic h is Colleced a Set Of Entity<Integer ,String>
   /*     for(Entry<Integer, String> tempSet:objTree.entrySet()) {
        	System.out.println(tempSet);
        }
        // Collect The Key of The The all Key Of Element Only
        for(Integer tempInt:objTree.keySet()) {
        	System.out.println(tempInt);
        }
        for(String recvString:objTree.values()) {
        	System.out.println(recvString);
        }
   */
         
//          while(objTree.entrySet().iterator().hasNext()) {
//        	    
//        	   System.out.println(objTree.entrySet().iterator().next());
//          }
    /*
                      Iterator<Entry<Integer, String>> recvIte = objTree.entrySet().iterator();
                      while(recvIte.hasNext()) {
                    	  Entry<Integer, String> entry=recvIte.next();
                    	  System.out.println(recvIte.next());
                      }
    */
       
    
    
    System.out.println("Sorted Map InterFacce Impliment On TREE MAP"+objTree);
   }
}
