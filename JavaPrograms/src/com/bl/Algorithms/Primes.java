package com.bl.Algorithms;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.bl.utility.Util;
public class Primes {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range of prime numbers required (0 - N and N > 2)...!");
		int range = sc.nextInt();

		// finding all the prime numbers in the given range
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);//2 is the first prime number
		for(int i = 3; i<= range ; i = i+2) {
			if(Util.isPrime(i))
				primes.add(i);
		}

		//printing all the prime numbers
		System.out.println("Prime numbers in the range of 0 - "+range + " are :");
		for (Integer p : primes) 
		{
			System.out.println(p);
		}

		//finding the prime numbers which are anagram
		HashMap<String,String> primeAnagrams = Util.anagramsOfNumbers(primes);
		System.out.println("Prime numbers which are anagrams of each other are :");
		for(Map.Entry<String, String> entry : primeAnagrams.entrySet())
		{
			System.out.print(entry.getKey() +"\t");
			//append the value to key 
			String[] vals = entry.getValue().split(",");
			for(String s : vals) {
				System.out.print(Integer.parseInt(s) + "\t");
			}
			System.out.println();
		}

		//finding the prime numbers which are palindrome
		HashMap<String,String> primePalindromes = Util.palindromesOfNumbers(primes);
		System.out.println("Prime numbers which are Palindromes of each other are :");
		for(Map.Entry<String, String> entry : primePalindromes.entrySet())
		{
			System.out.print(entry.getKey() +"\t");
			//append the value to key 
			String[] vals = entry.getValue().split(",");
			for(String s : vals) {
				System.out.print(Integer.parseInt(s) + "\t");
			}
			System.out.println();
			sc.close();
		}
	}
		
	}


