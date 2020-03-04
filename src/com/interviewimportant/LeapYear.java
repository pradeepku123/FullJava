package com.interviewimportant;

import java.util.Calendar;

public class LeapYear {
	
	public static void main(String[] args) {
		int year=2020;
		Calendar cal=Calendar.getInstance();
	    cal.set(Calendar.YEAR, year);
	    int month=cal.getActualMaximum(Calendar.DAY_OF_YEAR);
	    if (month==366) {
	    	System.out.println("This year is a leap Year");
	    }
	    else {
	         System.out.println("Year is not a Leap Year");
	    }
	     
	    System.out.println("===========Other Method===========");
	     if(year%400==0 || year%100 !=0 && year%4==0) {
	    	 System.out.println("This year is a leap Year");
	     }
	     else {
	    	 System.out.println("Year is not a Leap Year");
	     }
	}

}
