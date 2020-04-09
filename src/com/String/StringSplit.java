package com.String;

public class StringSplit {
	public static void main(String[] args) {
	  String Date="19-05-1993";
	  selectDateOfBirth(Date);
		
	}
	public static void selectDateOfBirth(String UserData) {
		String[] userDataExtract=UserData.split("-");
	    for(String dataRecive : userDataExtract) {
	    	System.out.println(dataRecive);
	    	
	    }
	    int DD=Integer.parseInt(userDataExtract[0]);
    	System.out.println(DD);
    	 int MM=Integer.parseInt(userDataExtract[1]);
     	System.out.println(MM);
     	 int YYYY=Integer.parseInt(userDataExtract[2]);
     	System.out.println(YYYY);
	}

}
