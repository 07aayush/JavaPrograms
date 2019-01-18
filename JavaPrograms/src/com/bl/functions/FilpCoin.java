package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.Util;

public class FilpCoin {
	

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		String input;
		do {
			System.out.println("Enter the number of times you want to flip coin");
			input = sc1.next();
		}while(!Util.isNumber(input));
        int trials = Integer.parseInt(input);
        while(trials < 0)
        {
        	System.out.println("Enter a positive integer number..!");
        	trials = sc1.nextInt();
        }
		double headsPercentage = Util.percentageOfHeads(trials);
		double tailsPercentage = 100-headsPercentage;
		System.out.print("% of Heads = ");
		System.out.printf("%.2f\n", headsPercentage);
		System.out.print("% of Tails = ");
		System.out.printf("%.2f\n", tailsPercentage);
		sc1.close();
	}
}
