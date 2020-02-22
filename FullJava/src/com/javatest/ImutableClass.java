package com.javatest;

public class ImutableClass {
	public static void main(String[] args) {
		Test t1=new Test(10);
		t1.TestData();
		Test t2=t1.modify(100);
		t2.TestData();
		Test t3=new Test(10);
		t3.TestData();
	}
}
final class Test{
   private int x;
   Test(int x){
	   this.x=x;
   }
   public Test modify(int x) {
	  if(this.x==x) {
		  return this;
	  }
	  else {
		  
		  return (new Test(x));  
	  }
		  
   }
   public void TestData() {
	   System.out.println(this+"    "+this.x);
   }
}
