package com.bl.Algorithms;

import java.util.Scanner;

import com.bl.utility.util;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc =new Scanner(System.in);
		

		System.out.println("Enter range");
		int n= sc.nextInt();
		int[] array=new int[n];
		String[] strArray=new String[n];
		
		
		System.out.println("Enter array");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		util.bubbleSort(array);		
		}
	}


