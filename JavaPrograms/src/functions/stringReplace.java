package functions;

import java.util.Scanner;

import utility.util;

public class stringReplace {

	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		String s1 ="hello <<user name>>, how are you";
		System.out.println("enter the String of min length 3 char");
		String s2=sc1.nextLine();
		if(s2.length()>=3)
		System.out.println(util.stringReplace(s1, s2));
		
	}
	
}
