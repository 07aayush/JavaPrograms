package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.util;



public class TwoDArray {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		// TODO Auto-generated method stub
	       System.out.println("Enter number of rows(M)...! ");
	       int rows = sc1.nextInt();
	       System.out.println("Enter number of columns(N)...!");
	       int cols = sc1.nextInt();
	       System.out.println("Enter "+(rows*cols)+" Two-D array elements");
	       int[][] twoDIntArray = new int[rows][cols];
	       util.read2DArrayElements(twoDIntArray, rows, cols);
	       System.out.println("2-D Array elemnts are : ");
	       util.display2DArrayElements(twoDIntArray,rows,cols);

	}

}
