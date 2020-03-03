package com.interviewimportant;

import java.util.Scanner;

public class SwapOfTwoNumber {
	public static void main(String[] args) {
		int x=12,y=25;
		System.out.println("========Simple Method===========");
		System.out.println("Before Swap::"+x+"\t"+y);
	     int z=x;
	     x=y;
	     y=z;
	     System.out.println("After swap::"+x+"\t"+y);
	     System.out.println("========without third Variable Method===========");
	      System.out.println("Before Swap::"+x+"\t"+y);
	      x=x+y;
	      y=x-y;
	      x=x-y;
	      System.out.println("After swap::"+x+"\t"+y);
	      System.out.println("========without third Variable Method in single line===========");
	      System.out.println("Before Swap::"+x+"\t"+y);
	      y=(x+y)-(x=y);
	      System.out.println("After swap::"+x+"\t"+y); 
	}

}
