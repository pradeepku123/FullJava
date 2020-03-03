package com.interviewimportant;

public class ReverseStringWithAndWithOutinBuildFunction {
		
	public static void main(String[] args) {
		 String myName=new String("pradeepkumarbehera");
		  
		  System.out.println("Lenth of String"+myName.length());
		  String temp="";
		  for(int i=myName.length()-1;i>=0;i--) {
			  
			 // System.out.print(myName.charAt(i));
			  temp=temp+myName.charAt(i);
			  System.out.println(temp);
		  }
		  System.out.println("===================================");
		  StringBuffer strbuff=new StringBuffer(temp);
		  System.out.println(strbuff.reverse());
		  System.out.println("===================================");
		  char[] chartemp = temp.toCharArray();
		  //System.out.println(chartemp.length);
		  for(int i=0;i<chartemp.length;i++) {
			  
			  System.out.print(chartemp[i]);
			  
		  }
		  System.out.println();
		  for(int i=chartemp.length-1;i>=0;i--){
			  
			  System.out.print(chartemp[i]);
			  
		  }
		  System.out.println("\n================Delete Repeate Occurance===================");
		   int j=0;
		   System.out.println(chartemp);
		   String newreverse="";
		  for(int i=0;i<chartemp.length;i++) {
			      if(chartemp[i]!=' ');
			      newreverse=newreverse+chartemp[i];
			      j=i+1;
			      while(j<chartemp.length) {
				  if(chartemp[i]==chartemp[j]) {
					  chartemp[j]=' '; 
				  }
				  j++;
			  }
		  }
		  System.out.println("After Remove::"+newreverse+"\n");
		  
            for(int i=chartemp.length-1;i>=0;i--){
			  
			  System.out.print(chartemp[i]);
			  
		  }
        myName="lfhnsdl+4##$DFdfd#$@VV";
        System.out.println("\n================Delete Occurance Except alphbet & number===================");
        System.out.println(myName.replaceAll("[^a-zA-Z0-9]",""));
		  
	}
}
