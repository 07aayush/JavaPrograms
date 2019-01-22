package com.bl.Algorithms;

import java.util.Scanner;

import com.bl.utility.Util;

public class NibbleSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		Util input=new Util();
		System.out.println("enter the number to swap");
		int Number=sc.nextInt();
		Number=Util.nibbleSwap(Number);
		System.out.println("Result is "+Number);
		sc.close();


	}

}
