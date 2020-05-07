package com.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HsshMapDemo {
	public static void main(String[] args) {
		Map< Integer,String> obj=new HashMap<Integer, String>();
		obj.put(Integer.valueOf(103), "Pradeep"); 
		obj.put(Integer.valueOf(101), "Ranjan");
		obj.put(Integer.valueOf(105), "Shyam");
		obj.put(Integer.valueOf(100),null);
		obj.put(null,null);
		obj.put(null,"Hello");
		System.out.println("Valu of Key And Pair Associated With Now Map Obj:-"+obj);
		Map<Integer, String> linkedMap=new LinkedHashMap<Integer, String>();
		linkedMap.put(Integer.valueOf(103), "Pradeep");
		linkedMap.put(Integer.valueOf(101), "Ranjan");
		linkedMap.put(Integer.valueOf(105), "Shyam");
		linkedMap.put(Integer.valueOf(100),null);
		System.out.println(linkedMap+"Linked Map");
		// obj.clear(); // Clear The Map Object Which Clear The All Entry
		
//		System.out.println(obj.containsKey(150));
//		System.out.println(obj.containsValue("Shyam"));
		
//		System.out.println(obj.remove(103));
//		System.out.println(obj.remove(103,null));  //if remove Operation Not Sucessful Then its Return Flase if Remove Operatipon Perform Ok Then Its Return True

//      System.out.println(obj.replace(103, "new Null As String"));
//		System.out.println(obj.replace(103,null, "new Null As String"));  //Replace With Old Valu Mention its Return On Sucessful Operation  On The Method Perform Sucessful Operarion On  Doing Replace Operation 
//		 Map<Integer, String> newObjFor= new HashMap<Integer, String>();
//		 newObjFor.putAll(obj);
		
		//in Map data Are Stored in Form Of a Entry Set Of Entruy Here I Am Retriving All Entry Using Method Of Entry Set Whing is Stored As Set Object Reference & using For EACH lOOP I AM rETRIVEING THE Data
/*		 Set<Entry<Integer, String>> recvRentrySet = obj.entrySet();
		 for(Entry<Integer, String> tempEntry:recvRentrySet) {
			 
			 System.out.println(tempEntry.getKey()+" KEY OF "+tempEntry.getValue());
			 
		 }
*/		
		//Here using KeySet All The KeySet Present in the Map Collected & Return
/*		Set<Integer> recvkeySet = obj.keySet()
		for(Integer revInteger: recvkeySet) {
			System.out.println(revInteger);
		}
        Collection<String> objValues = obj.values();
        for(String revString:objValues) {
        	System.out.println(revString);
        }
*/      
	
//        System.out.println(obj.values().size()); //Size Of Map Object
		//Tracerse The Linked Map
/*		//Traverse The HashMAP using For Each lop To All Object
        for(Entry entry:obj.entrySet()) {
        	System.out.println(entry);
        	System.out.println(entry.getKey()+" Vakues Are "+entry.getValue());
        }
		
        // Using Iterator you Can Get The Values
         
         Iterator<Entry<Integer, String>> recvIterator = obj.entrySet().iterator(); 
         
         while(recvIterator.hasNext()) {
        	   Entry<Integer, String> recvEntry = recvIterator.next();
        	   System.out.print(recvEntry.getKey());
        	   System.out.println(recvEntry.getValue());
        	   
         }
*/       
         
		System.out.println("Valu of Key And Pair Associated With Now Map Obj:-"+obj);
		
	}
}
