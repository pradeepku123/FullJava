package com.interviewimportant;

public class CountTheOcurance {
	public static void main(String[] args) {
		String TestString="mynameispradeepkumarbehera";
		char[] TestStringCharArray = TestString.toCharArray();
		for(int i=0;i<TestStringCharArray.length;i++) {
			System.out.print(TestStringCharArray[i]+"-");
		}
	}

}
