package com.interviewimportant;

public class ReverseOfANumber {
	static int number=37134;
	static int actualnumber=number;
	static int remain;
	static int reverse;
	
	public static void main(String[] args) {
		
		
		while(number!=0) {
			
			remain=number%10;
			number=number/10;
			reverse=(reverse*10)+remain;	
		}
		System.out.print(reverse);
		System.out.println("\n================palindrum or not===================");
		//if actual number equal to reverse number 
		if (actualnumber==reverse) {
			System.out.println("Number is palindrum");
		}
		else {
			System.out.println("Number is not palindrum");
		}
		System.out.println("\n================armstung Number or not===================");
        reverse=0;
        number=371;
        int check=number;
		while(number!=0) {
			
			remain=number%10;
			number/=10;
			reverse+=Math.pow(remain, 3);
		}
		if(check==reverse) {
			System.out.print("Armstrung");
		}
		else {
			System.out.print("Not a armstrungNumber");
		}
		
		
	}

}
