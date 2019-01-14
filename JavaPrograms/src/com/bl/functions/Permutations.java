package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.util;


public class Permutations
{

	public static void main(String[] args)
	{

	Scanner sc1 = new Scanner(System.in);
	
	System.out.println("Enter a string...!");
	String input = sc1.nextLine();
	String[] iterativePerms = null;
	
	System.out.println("Permutations of \"" + input +"\" by iterative...!");
	iterativePerms = util.stringPermutationsByIterative(input);
	System.out.println("Number of permuations  :"+ iterativePerms.length);
	util.displayStringArray(iterativePerms);
	
	}
}

			
			