package com.sorting;
import java.util.*;

public class BubbleSort {
	
	void bubbleSort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {// array length traversing
			for(int j=0;j<n-i-1;j++)//n = length of array  
			{
				if(arr[j]> arr[j+1])// if 1st number is greater than secound number then the swap 
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	//print the array
	void printArray(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++)  
		{
			System.out.print(arr[i] +" ");
			System.out.println();
			
		}
		
		
	}


	public static void main(String[] args)
	{
		BubbleSort bs=new BubbleSort();
		int arr[]= {60,40,80,90,10};
		System.out.println("before sorting array");
		bs.printArray(arr);
		
		bs.bubbleSort(arr);
		System.out.println("after sorting the array");
		bs.printArray(arr);

	}

}
