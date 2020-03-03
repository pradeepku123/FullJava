package com.interviewimportant;

public class FibonacisSeries {
	public static void main(String[] args) {
		int firstElement=0,secondElement=1,nextElement=0;
		System.out.print("Fibonascci::"+firstElement+"\t"+secondElement);
		for(int i=0;i<10;i++) {
			nextElement=firstElement+secondElement;	
			System.out.print("\t"+nextElement);
			firstElement=secondElement;
			secondElement=nextElement;
		}
	}

}
