package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.util;



public class TwoDArray {

	public static void main(String[] args) {
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int rows = sc2.nextInt();		
		System.out.println("enter the no of cols");
		int cols = sc2.nextInt();
		int[][] twoDarray = new int[rows][cols];
		util.twoDarray(rows,cols,twoDarray);

	}

}
