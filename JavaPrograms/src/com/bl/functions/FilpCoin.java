package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.util;

public class FilpCoin {
	
	static Scanner sc1 = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int trials = getNumOfTrials();
		double headsPercentage = util.percentageOfHeads(trials);
		double tailsPercentage = 100-headsPercentage;
		System.out.print("% of Heads = ");
		System.out.printf("%.2f\n", headsPercentage);
		System.out.print("% of Tails = ");
		System.out.printf("%.2f\n", tailsPercentage);
	}

	private  static int getNumOfTrials() 
	{
		int trials = 0;
		boolean flag = false;
		while(!flag)
		{
			System.out.println("Enter number of times the coin to be flipped...!");
			trials = sc1.nextInt();
			if(trials <= 0)
				System.out.println("Enter a positive number...!");
			else
				flag = true;
		}
		return trials;
	}
	}

		
	
