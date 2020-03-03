package com.interviewimportant;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.print("Prime Number Series::");
		int flag=0;
		
		
		for(int j=2;j<100;j++) {
			
			for(int i=2;i<=11;i++) {
				if(j%i==0 && !(j==i)) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.print(j+"\t");
			}
			flag=0;
			
		}
	
	}

}
