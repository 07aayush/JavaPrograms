package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.Util;

public class IterativePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String word=sc.next();
		String[] a=Util.permutationOfStringIterative(word);
		System.out.println("String Permutation Using Iterative ");
		for(String s:a){
			System.out.println(s);
		}
		sc.close();

	}

}
