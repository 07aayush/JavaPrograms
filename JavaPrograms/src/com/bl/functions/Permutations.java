package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.util;


public class Permutations {

	public static void main(String[] args) {

		
		
			
			Scanner sc1 = new Scanner(System.in);
			
			
			System.out.println("enter the String input");
			String Input=sc1.next();
		util.permutations(Input.toCharArray(), 0);
		
		
		System.out.println("enter the String input");
		String In=sc1.next();
		util.perm(" ", In);
		
		}
	}
