package com.bl.Algorithms;

import java.util.Scanner;

import com.bl.utility.Util;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings to be checked for anagram ...!");
		String str1 = sc.next();
		String str2 = sc.next();
		boolean isAnagaram = Util.checkAnagram(str1, str2);
		if(isAnagaram)
			System.out.println("'"+str1+"' and '" + str2+ "' are anagram...!");
		else
			System.out.println("'"+str1+"' and '" + str2+ "' aren't anagram ...!");
		sc.close();
	}

}
