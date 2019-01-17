package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.util;

public class Gambler {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter initial stake...!");
		int stake = sc.nextInt();
		System.out.println("Enter your goal...!");
		int goal = sc.nextInt();
		System.out.println("Enter No. of times you want to play...!");
		int trials = sc.nextInt();
		util.playGame(stake, goal,trials);
		sc.close();
	}

}
