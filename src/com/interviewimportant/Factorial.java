package com.interviewimportant;

public class Factorial {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number=9;
		int result=1;
//  Factorial of number
		 for(int i=1;i<=number;i++) {
			 result*=i;
			 System.out.println(result);
		 }
		
	}

}
