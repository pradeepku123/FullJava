package com.javatest;

public class Array {
		public static void main(String[] args) {
		   int[][][] x=new int[10][15][5];
		  
		   for(int i=0;i<x.length;i++) {
			   for(int j=0;j<x[i].length;j++) {
				   for(int k=0;k<x[i][j].length;k++) {
					     x[i][j][k]= 10;
				   }
			   }
		   }
		   
		    for(int [][]z:x) {
		    	for(int[] k:z) {
		    		for(int j:k) {
		    			System.out.println(j);
		    		}
		    	}
		    }
		    
		    int[][] xz=new int[5][6];
		    
		    for(int i=0;i<xz.length;i++) {
		    	for(int j=0;j<xz[i].length;j++) {
		    		xz[i][j]=i+j;
		    		System.out.println(xz[i][j]);
		    	}
		    }
		   /*
		   for(int i=0;i<x.length;i++) {
			   for(int j=0;j<x[i].length;j++) {
				   for(int k=0;k<x[i][j].length;k++) {
					     System.out.print(x[i][j][k]+" ");
				   }
				   System.out.println();
			   }
			   System.out.println("--------------------");
		   }
			*/	   
    }
}
