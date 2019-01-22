package com.bl.Algorithms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.bl.utility.Util;

public class WordSearch {

	public static void main(String[] args) {

		//String path = "/home/bridgelabz/Desktop/Aayush/sample.txt";
		String[] words;
		String line= "";
		String key;
		int result;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the path");
		String path = sc.next();
		try(BufferedReader br = new BufferedReader(new FileReader(path)))
		{
			String temp = null;
			while((temp = br.readLine())!= null)
			{
				line += temp;
			}
			words = line.split(",");
			System.out.println("\nwords list before sorting: \n ");
			Util.printStringArray(words);
			Arrays.sort(words);
			System.out.println("\nWords list after sorting: \n");
			Util.printStringArray(words);
			do {
				System.out.println("\nEnter the key...!");
				key = Util.getString();
			}while(key.trim().equals("") || key == null);

			result = Util.binarySearch(words, key);
			if(result >= 0)
				System.out.println("Key '"+ key+"' found at position "+result);
			else
				System.out.println("Key '"+key+"' not found...!");
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}