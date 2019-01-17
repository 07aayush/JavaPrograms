package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.util;

public class FilpCoin {
	

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		int trials;
		System.out.println("Enter the number of times you want to flip coin");
		trials = util.readPositiveInt();
		
		double headsPercentage = util.percentageOfHeads(trials);
		double tailsPercentage = 100-headsPercentage;
		System.out.print("% of Heads = ");
		System.out.printf("%.2f\n", headsPercentage);
		System.out.print("% of Tails = ");
		System.out.printf("%.2f\n", tailsPercentage);
		sc1.close();
	}
}
