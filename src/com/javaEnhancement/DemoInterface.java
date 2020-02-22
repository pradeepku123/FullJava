package com.javaEnhancement;

public class DemoInterface implements Valid,Invalid {
   public static void main(String[] args) {
	  DemoInterface obj =new DemoInterface();
	  obj.demo();
   }

  @Override
  public void demo() {
	
	   Invalid.super.demo();
   }
}
