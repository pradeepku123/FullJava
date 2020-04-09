package com.interviewimportant;

public class ReverseOfStringWord {
	public static void main(String[] args) {
		String givenString="My Name pradeep";
		String[] array = givenString.split(" ");
		System.out.println(array.length);
		String  tempgivenWord="";
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+" ");
			tempgivenWord=tempgivenWord+array[i]+" ";
		}
		System.out.println("\n"+tempgivenWord);
		
	}
	
}
