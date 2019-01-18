package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.Util;

public class DistinctTriplets {

	public static void main(String[] args) {
		
		Scanner sc1= new Scanner(System.in);
		
		String input;
		do {
			System.out.println("enter the valid number of ints");
			
			input = sc1.next();
		}while(!Util.isNumber(input));
		int num = Integer.parseInt(input);
		int[] arr = new int [num];//create array & read values one by one
		System.out.println("Enter "+num +" Values :");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=sc1.nextInt();
		}
		int sum=Util.countDistinctTriplet(arr, num);//pass the arguments to method 1
		System.out.println("No.of Tripltes :"+sum);
		sc1.close();
	}

}
