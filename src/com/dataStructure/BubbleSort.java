package com.dataStructure;

import org.testng.annotations.Test;

public class BubbleSort {
	public static int[] inputData= {66,45,53,26,18,47,21,14};
	int temphead=0;
	int temp;
	@Test
	public void bubbleSortImp() {
		int datalength=inputData.length;
		dipalyInputData();
		System.out.println("--------------------------------------------------------------");
		while(datalength>=0) {
			for(int i=0;i<datalength-1;i++) {
				if(inputData[i]>inputData[i+1]) {
					checkCondition(i);	
				}
				dipalyInputData();
			}
			
			datalength--;
			System.out.println("--------------------------------------------------------------");
			dipalyInputData();
			
		}

	}
	public void dipalyInputData() {
		for(int dataRecvive:inputData) {
			System.out.print(dataRecvive+"\t");
		}
		System.out.println();
	}
	public void checkCondition(int i) {

		temp=inputData[i+1];
		inputData[i+1]=inputData[i];
		inputData[i]=temp;				 

	}
}
