package com.bl.Algorithms;

import java.util.Scanner;

import com.bl.utility.util;

public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("enter the rupees");
		int enter_Currency = sc.nextInt();
		util.countNotes(enter_Currency);
		sc.close();
	}

}
