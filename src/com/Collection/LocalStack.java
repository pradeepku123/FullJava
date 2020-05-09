package com.Collection;

import java.util.ArrayList;

public class LocalStack {
   private static int stackIndex=0;
   private static int offset;
   private static ArrayList<Object> localStack;
   public LocalStack(int localStackSize) {
    localStack=new ArrayList<Object>(localStackSize);
   }
   public Boolean localStackPush(Object element) {
	   stackIndex++;
	   return localStack.add(element);   
   }
   public Object localStackPop() {
	   stackIndex--;
	   return localStack.remove(stackIndex);
   }
   public Object localStackPeek() {
	   stackIndex--;
	   return localStack.get(stackIndex++);
   }
   public void dispalyLocalStack() {
	  System.out.print("[");
	  for(Object object:localStack) {
		  System.out.print(object+",");  
	  }
	  System.out.println("]");
   }
}
