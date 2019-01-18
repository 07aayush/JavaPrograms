package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.Util;

public class Gambler {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("welcome to the world of gambling..!");
		System.out.println();


		String input; 
		do {
			System.out.println("Enter the stake ");
			input = sc.next();
		}while(!Util.isNumber(input));

		int Stake = Integer.parseInt(input);


		String input1;
		do {
			System.out.println("Enter your goal ");
			input1 = sc.next();
		}while(!Util.isNumber(input1));

		int goal = Integer.parseInt(input1);

		String input2;
		do {
			System.out.println("Enter the number of games you want to play ");
			input2 = sc.next();
		}while(!Util.isNumber(input2));

		int games = Integer.parseInt(input2);
		sc.close();
		Util.gambler(Stake, goal, games);









	}

}
