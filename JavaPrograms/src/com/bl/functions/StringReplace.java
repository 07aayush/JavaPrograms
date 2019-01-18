package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.Util;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1 = new Scanner(System.in);
		String s1 ="Hello user name, how are you";
		String s2;
		do{
			System.out.println("Enter the user name of min 3 chars...!" );
			s2=sc1.next();
		}while(s2.length()<3);
		System.out.println(Util.stringReplace(s1, s2));
		sc1.close();

	}

}
