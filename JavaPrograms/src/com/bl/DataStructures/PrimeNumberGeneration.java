package com.bl.DataStructures;

import java.util.Scanner;

import com.bl.utility.Util;

public class PrimeNumberGeneration {
	
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	Util  util = new Util();	
	System.out.println("Enter range to print prim number ");
	int range =  sc.nextInt();
	
	int[] primenumber = Util.printingPrimeNumber(range);
	util.twoDPrime(primenumber);

}
}