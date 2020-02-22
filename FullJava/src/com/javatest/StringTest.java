package com.javatest;

public class StringTest {
	
	
   public static void main(String[] args) {
	   String s1=new String("pradeep");
	   String s2="pradeep";
	  // System.out.println(s1==s2);
	   String s3="pradeep";
	   //System.out.println(s2==s3);
	   String s4=s1.intern();
	   System.out.println(s2==s4);
	   System.out.println();
	   System.out.println(s2.hashCode());
   }

}
