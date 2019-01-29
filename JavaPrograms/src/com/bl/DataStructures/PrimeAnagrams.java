package com.bl.DataStructures;

import java.util.Scanner;

import com.bl.utility.Util;

public class PrimeAnagrams {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter range : ");
		int range = sc.nextInt();
		int[] primenumber = new int[range];
		primenumber=Util.printingPrimeNumber(range);
		
		int[] anagram = Util.checkAnagram(primenumber);		
		Util.twoDPrimeAnagram(anagram);
		sc.close();
	


	
}
}