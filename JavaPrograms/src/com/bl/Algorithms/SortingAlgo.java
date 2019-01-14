package com.bl.Algorithms;

import java.util.Scanner;

import com.bl.functions.StopWatch;
import com.bl.utility.util;

public class SortingAlgo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StopWatch sh = new StopWatch();

	/* for Binary Search Integer
	 
	 	
		int num;
		int[] numbers;
		int searchResult;
		int key;

		System.out.println("enter the no of integers");
		num =sc.nextInt();
		
		System.out.println("enter "+num+" integers");
		numbers = new int[num];
		for(int i =0;i<numbers.length;i++)
		{
			numbers[i]=sc.nextInt();
			
		}
		
		System.out.println("enter the number to be searched");
		key = sc.nextInt();
		sh.Start();
		searchResult=util.Binary_Search(numbers, key);
		sh.Stop();
		sh.getElapsedTime();
		if(searchResult!=-1)
		
			System.out.println("key found at postition "+searchResult);
			else
				System.out.println("key "+key+ "not found");
	*/
/*
		String[] arr = { "contribute", "ide", "practice","taken", "hello", "practice"}; 
        String x = "hello"; 
		sh.Start();

        int result = util.binarySearch(arr, x); 
  
        sh.Stop();
		sh.getElapsedTime();
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at "+ "index " + result); 
    } 
		
	*/
	
		System.out.println("enter the number of elements you want to enter");
		int no_Of_Elements = sc.nextInt();
		
		System.out.println("enter "+no_Of_Elements+" number of elements");
		 int[] arr = new int[no_Of_Elements];
		 
		 for(int i = 0;i<no_Of_Elements;i++)
			 arr[i]=sc.nextInt();
		System.out.println("before sorting");
		util.printArray(arr);
		System.out.println("After sorting");
		util.insertionSort(arr);
		util.printArray(arr);
		
   
     }    
 }    
