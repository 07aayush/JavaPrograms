package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.util;

public class DistinctTriplets {

	public static void main(String[] args) {
		System.out.println("Enter number of integers");
		int num;
		Scanner sc1= new Scanner(System.in);
		num=sc1.nextInt();
		
		int[] arr = new int [num];//create array & read values one by one
		System.out.print("Enter "+num +" Values :");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=sc1.nextInt();
			
		}
		int sum=util.countDistinctTriplet(arr, num);//pass the arguments to method 1
		System.out.println("No.of Tripltes :"+sum);
	}

}
