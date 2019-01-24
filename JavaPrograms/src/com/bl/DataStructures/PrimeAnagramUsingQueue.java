package com.bl.DataStructures;

import java.util.Scanner;

import com.bl.utility.Util;

public class PrimeAnagramUsingQueue {

	static int counter=0;

	static QueueUsingForAnagram  qlt=new QueueUsingForAnagram ();

	/**
	 * to find Prime and Anagram of given range nos 
	 * @param start : range start of nos to check prime and anagarm
	 * @param end   : range end
	 * @return      : void
	 */ 
	public static void  primeAndAngaram3(int start,int end)
	{	 

		//make any size array---TO STORE PRIME NOS
		int[] primearr=new int[end]; 

		//to find prime nos of the input range
		for (int i = start; i <= end; i++)
		{  
			//#1//call goes to isPrime2 method--to check prime or not
			if (Util.isPrime5(i)) 
			{  	
				primearr[counter]=i; //insert no--->if it is prime

				counter++;
			}  
		}  

		//to print normal array---of prime nos
		for (int k=0; k<counter; k++)
		{  
			System.out.print(primearr[k]+" ");
		}

		System.out.println(" ");
		System.out.println("Now prime and anagram nos r as follows:");
		System.out.println(" ");

		//getting the prime nos store in----primearr[]
		for (int j=0; j<counter; j++)
		{  
			//#2//call goes to get palindrome of a  no
			int reverse= Util.Anagram5(primearr[j]);  //palindrome of each primeno---of primearr[]

			//matching the palindrome of every no---with the Array ele(of prime no)
			for(int k=0; k<=counter; k++)
			{
				if(primearr[k]==reverse) //if matched then push prime and reverse/anagram in LINKED LIST
				{
					qlt.insertAtEnd(primearr[j]);

					qlt.insertAtEnd(reverse);
				}
			}
		}

	}

	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
		//take input start range of nos to find prime
		System.out.print("Enter the first number : ");  
		int start = sc.nextInt();

		//take input end range of nos to find prime
		System.out.print("Enter the second number : ");  
		int end = sc.nextInt();

		//print range to nos whose pprime to be find
		System.out.print("List of prime numbers between " + start + " and " + end +"\n");  

		primeAndAngaram3 (start, end);

		//display the linked list
		qlt.show();
		sc.close();

	}
}