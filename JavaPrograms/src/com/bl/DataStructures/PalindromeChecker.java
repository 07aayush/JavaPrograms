package com.bl.DataStructures;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter the string for paindrome " );
			s=sc.next();
		char[] c= s.toCharArray();
		MyDqueueImpl<Object> m=new MyDqueueImpl<Object>();	//c.length is the Char array length
		for(int i=c.length-1 ; i>=0 ;i--)
		{
			m.insertRear(c[i]);	
		}
		System.out.println("\nThe New MyDeque array is: "+ m);
		System.out.println("");
		
		boolean status=true;
		for(int i=0 ; i<c.length ;i++)
		{
			if(c[i]!=(char) m.deleteFront())
			{
				status=false;	
				break;
			}
			status=true;
		}
		if(status)
		{
			System.out.println("\nit is palindrome");
		}
		else
			System.out.println("not a plindrome");
		sc.close();
	}		

}


