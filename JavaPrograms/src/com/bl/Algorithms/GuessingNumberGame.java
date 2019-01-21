package com.bl.Algorithms;

import java.util.Scanner;

import com.bl.utility.Util;

public class GuessingNumberGame {

	public static void main(String[] args) {
	
		int num = 0;
		if(args.length  < 1) {
			System.out.println("Provide a number...!");
			return;
		}
		num = Integer.parseInt(args[0]);
		 
		int[] arr = new int[num];
		for(int i =0; i < num ; i++) {
			   arr[i] = i;
			}
		System.out.println("Think a number in the range : 0 to "+(num-1));
		char choice;
		do {
			System.out.println("Have you assumed a number...?");
			System.out.println("Enter your answer as 'y/n'");
			choice = Util.sc.next().toLowerCase().charAt(0);
		}while(choice!='y');
        guess(arr, 0, num-1);
	}

	/**
	 * function to guess a number
	 * @param arr array of integers as input
	 * @param l starting index for searching
	 * @param r ending index for searching
	 */
	public static void guess(int[] arr, int l ,int r) {
		int mid;
		char ans;
		if(l == r)
		{
			System.out.println("Your number is : " + arr[l]);
			return ;//1;
		}
		else {
			mid = (l+r)/2;
			System.out.println("Is your number 'smaller' compared to "+arr[mid]);
			System.out.println("Enter 'y/n'...!");
			ans = Util.sc.next().toLowerCase().charAt(0);
			if(ans == 'y')//low
				guess(arr,l,mid-1);
			else//high
				guess(arr,mid+1,r);
		}
	}


	}


