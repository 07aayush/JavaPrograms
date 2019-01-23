package com.bl.Algorithms;

import java.util.Scanner;

import com.bl.utility.Util;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		int c = sc.nextInt();
		String str = Util.toBinary(c);
		int bin=Integer.parseInt(str);
		System.out.println(bin);
		
		int dec=Util.toDecimal(bin);
		System.out.println(dec);
		if(Util.isPowerTwo(dec) == true)
			System.out.println(dec+" is pow of 2");
		else
			System.out.println(dec+" is not pow of 2");
		sc.close();
	}

}
