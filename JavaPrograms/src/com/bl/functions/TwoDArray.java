package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.Util;



public class TwoDArray {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		String row; 
			do {
				 System.out.println("Enter number of rows(M)...! ");
				row = sc1.next();
			}while(!Util.isNumber(row));
			
			int rows = Integer.parseInt(row);
	       
	      
	       String col;
	       do {
	    	   System.out.println("Enter number of columns(N)...!");
				col = sc1.next();
			}while(!Util.isNumber(col));
			int cols = Integer.parseInt(col);
	       
	       System.out.println("Enter "+(rows*cols)+" Two-D array elements");
	       int[][] twoDIntArray = new int[rows][cols];
	       Util.read2DArrayElements(twoDIntArray, rows, cols);
	       System.out.println("2-D Array elemnts are : ");
	       Util.display2DArrayElements(twoDIntArray,rows,cols);
	       sc1.close();

	}

}
