package com.dataStructure;

import org.testng.annotations.Test;

public class MergeSort {
	public static int[] inputData= {66,45,53,26,18,47,21,14};
	int temphead=0;
	int temp;
	int boundA=1;
	int boundB=1;
	int bounderies=6;
	@Test
	public void mergeSort() {
		dipalyInputData();
		System.out.println("----------------------------------------------------------");
		int limit=inputData.length/2;
		limit=1;
		System.out.println("Requred Step:"+limit);
		for(int i=0;i<limit;i++) {
			while(bounderies!=0) {


				for(int j=0;j<boundA;j++) {
					for(int k=0;k<boundB;k++) {
						if(inputData[j]>inputData[k]) {
							checkCondition(j, k);
						}
					}
				}
			}

		}
	}
	public void dipalyInputData() {
		for(int dataRecvive:inputData) {
			System.out.print(dataRecvive+"\t");
		}
		System.out.println();
	}
	public void checkCondition(int i,int j) {

		temp=inputData[i+j];
		inputData[i+j]=inputData[i];
		inputData[i]=temp;				 

	}
}
