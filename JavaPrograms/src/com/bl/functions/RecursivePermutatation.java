package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.Util;

public class RecursivePermutatation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number or String that you want to permute..!");
		String str = sc.next();
		int n = str.length();
		System.out.println("Number of possible Permutations are");
		Util.permutationRecursive(str,0,n-1);
		sc.close();
	}

}
