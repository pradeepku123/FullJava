package com.interviewimportant;

public class ReverseOfEahWord {
	public static void main(String[] args) {
		String givenString="My Name pradeep";
		String[] array = givenString.split(" ");
		System.out.println(array.length);
		String  tempgivenWord="";
		for(int i=0;i<array.length;i++) {
			for(int j=array[i].length()-1;j>=0;j--) {
				
				System.out.print(array[i].charAt(j));
				
			}
			System.out.print("\t");
		}
		System.out.println("\n"+tempgivenWord);
		
	}
}
