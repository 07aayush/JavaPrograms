package com.bl.DataStructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bl.utility.Util;

public class TestUnorderedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			String[] words;
			String key;
			String line= "";
			
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the path");
			String path =sc.next();
			try {
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader( new FileReader(path));
			String temp = null;
			while((temp = br.readLine())!= null)
			{
				line += temp;
			}
			words = line.split(",");
			//create a linked list for the words
			UnorderedListImpl<String> list = new UnorderedListImpl<String>();
			for(int i = 0; i < words.length ; i++) {
				list.add(words[i]);
			}
			//System.out.println("Words list :");
			//display data of each node in the list
			list.print();
	        //read the key to be searched
			do {
				System.out.println("Enter the key...!");
				key = Util.getString();
			}while(key.trim().equals("") || key == null);

			boolean isKeyPresent = list.contains(key);
			if(isKeyPresent) {
				System.out.printf("\nkey '%s' is present in the list\n",key);
				list.remove(key);
			}	
			else {
				System.out.printf("\nkey '%s' is not present in the list\n",key);
				list.add(key);
			}
			//display data of each node in the list
			list.print();
			list.writeToFile(list, path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
			

		}
	

