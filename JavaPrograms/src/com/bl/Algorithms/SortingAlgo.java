package com.bl.Algorithms;

import java.util.Scanner;

import com.bl.functions.StopWatch;
import com.bl.utility.util;

public class SortingAlgo {

	public static void main(String[] args) throws InterruptedException {
		long startTimer=0;
		long stopTimer=0;
		long elapsed;
		
		int num;
		int[] numbers;
		int searchResult =0;
		int key;
		
		
		
		Scanner sc = new Scanner(System.in);
		util u=new util();
		
		StopWatch sh = new StopWatch();
	//	System.out.println("Enter range");
		//int n= sc.nextInt();
	//	int[] array=new int[n];
		//String[] strArray=new String[n];
		/*
		System.out.println("Enter array");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Enter string array");
		for(int i=0;i<n;i++)
		{
			strArray[i]=sc.next();
		}
*/
		
		// FOR BINARY SEARCH INT
		
		/*
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
		startTimer =System.currentTimeMillis();
		System.out.println(startTimer);
		searchResult=util.Binary_Search(numbers, key);
		Thread.sleep(10);
		stopTimer= System.currentTimeMillis();
		System.out.println(stopTimer);
		elapsed = stopTimer - startTimer;
		System.out.println("Elapsed time : "+elapsed);
		if(searchResult!=-1)
		System.out.println("key found at postition "+searchResult);
		else
		System.out.println("key "+key+ "not found");
			
		  */
		 
	
		// FOR BINARY SEARCH STRING
		
		String[] arr = { "contribute", "ide", "practice","taken", "hello", "practice"}; 
        String x = "ide"; 
		
        startTimer =System.currentTimeMillis();
		System.out.println(startTimer);
        int result = util.binarySearch(arr, x);
        Thread.sleep(10);
		stopTimer= System.currentTimeMillis();
		System.out.println(stopTimer);
		elapsed = stopTimer - startTimer;
		System.out.println("Elapsed time : "+elapsed);
  
      
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at "+ "index " + result); 
			
		/*
		//INSERTON SORT USING INT
		startTimer =System.currentTimeMillis();
		util.insertionSortUsingInt(array);
		Thread.sleep(100);
		stopTimer= System.currentTimeMillis();
		elapsed = stopTimer - startTimer;
		System.out.println("Elapsed time : "+elapsed);
		 
		
		//INSERTION SORT USING STRINGS
		startTimer =System.currentTimeMillis();
		System.out.println(startTimer);
		util.insertionSortUsingString(strArray);
		Thread.sleep(10);
		stopTimer= System.currentTimeMillis();
		System.out.println(stopTimer);
		elapsed = stopTimer - startTimer;
		System.out.println("Elapsed time : "+elapsed);
		
		
		//BUBBLE SORT USING INTEGERS
		startTimer =System.currentTimeMillis();
		System.out.println(startTimer);
		util.bubbleSortOfIntegers(array);
		Thread.sleep(100);
		stopTimer= System.currentTimeMillis();
		elapsed = stopTimer - startTimer;
		System.out.println("Elapsed time : "+elapsed);
		
		
		//BUBBLE SORT USING STRINGS
		startTimer =System.currentTimeMillis();
		System.out.println(startTimer);
		util.bubbleSortOfStrings(strArray);
		Thread.sleep(100);
		stopTimer= System.currentTimeMillis();
		elapsed = stopTimer - startTimer;
		System.out.println("Elapsed time : "+elapsed);
		
		
		*/
		
		
		
		
		
		
		
	}
 }    
