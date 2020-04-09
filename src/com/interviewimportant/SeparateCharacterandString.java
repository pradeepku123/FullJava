package com.interviewimportant;

public class SeparateCharacterandString {
	public static void main(String[] args) {
		String AlphaNumeric="Pr3de45pKu23mar";
		String alpha="";
		String Number="";
		for(int i=0;i<AlphaNumeric.length();i++) {
			char tempChar=AlphaNumeric.charAt(i);	
			if(Character.isDigit(tempChar)) {
			   Number=Number+tempChar;
				
			}
			else
			{
				alpha=alpha+tempChar;
			}
		}
		System.out.println("Only Numer::"+Number);
		System.out.println("Only Digit::"+alpha);
		
	}
	

}
