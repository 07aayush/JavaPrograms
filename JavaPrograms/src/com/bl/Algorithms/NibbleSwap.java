package com.bl.Algorithms;

import java.util.Scanner;

import com.bl.utility.Util;

public class NibbleSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number to swap");
		int Number=sc.nextInt();
		Number=Util.nibbleSwap(Number);
		System.out.println("Result is "+Number);
		int num=0;
		if(Util.isPowerTwo(num)== true)
		{
			System.out.println("the number is power of 2");
		}
		else
			System.out.println("number is not power of 2");
			
		
		sc.close();


	}

}
