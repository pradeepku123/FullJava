package com.javatest;

 public class Parent {
	
   protected Parent testMethod2(){
	   System.out.println("Parent");
	   return new Parent();
   }
  
}
