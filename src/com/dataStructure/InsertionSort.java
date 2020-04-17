package com.dataStructure;

import org.testng.annotations.Test;

public class InsertionSort {
	public static int[] inputData= {66,45,53,26,18,47,21,14};
	int head=1;
	int temp;
	int tempvar;
	int temphead;
	@Test
	public void InsertionSortImpliment() {
		dipalyInputData();
		
    for(int i=0;i<inputData.length-1;i++) {
			tempvar=inputData[head];
			temphead=head-1;
			while(temphead!=-1) {
				if(inputData[temphead]>tempvar) {
					checkCondition();
					temphead--;
					
				}
				else if(inputData[temphead]<tempvar)
				{
					
					
					inputData[temphead+1]=tempvar;
					break;
					
				}
			}
			head++;
			dipalyInputData();
		
		}
	}
	public void dipalyInputData() {
		for(int dataRecvive:inputData) {
			System.out.print(dataRecvive+"\t");
		}
		System.out.println();
	}
	public void checkCondition() {

		temp=inputData[temphead+1];
		inputData[temphead+1]=inputData[temphead];
		inputData[temphead]=temp;				 

	}

}
