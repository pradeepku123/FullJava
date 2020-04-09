package com.interviewimportant;

public class CheckRepeatOccurance {
  public static void main(String[] args) {
	String TestString="orrjk86kojf5rrj23kjrrhhrrjrr";
	int Temp=0;
    for(int i=0;i<TestString.length()-1;i++) {
    	if(TestString.charAt(i)== 'r' && TestString.charAt(i+1)== 'r'	) {
    		Temp++;
    	}
    }
    System.out.println(Temp);
}
}
