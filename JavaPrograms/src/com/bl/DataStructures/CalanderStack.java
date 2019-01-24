package com.bl.DataStructures;

import java.util.Scanner;

import com.bl.utility.Util;

public class CalanderStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyStack<Integer> dateQueue=new MyStack<Integer>();
		MyStack<String> weekDayqueue=new MyStack<String>();	
		String[] days= {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		String[] months= {"","January","February","March","April","May","June","July","August","September","October","November","December"};
		int [] date= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		if(month==2 && Util.isLeapYearFourDigits(year)) {
			date[month]=29;
		}
		int day=Util.dayOfWeek(1, month, year);
		//System.out.println("\tSUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
		for(int i=days.length-1;i>=0;i--) {
			weekDayqueue.push(days[i]);
		}
		@SuppressWarnings("unused")
		int val = date[month];
		for(int i=date[month];i>=1;i--) {
			dateQueue.push(i);
		}

		for(int i=0;i<days.length;i++) {
			System.out.print(weekDayqueue.pop()+"\t");
		}
		System.out.println();
		for(int i=0;i<(day*5);i++) {
			System.out.print(" ");
		}
		for(int i=0;i<=date[month];i++) {
			if(i<10) {
				System.out.print(" "+dateQueue.pop()+"\t");
			}
			if(i>9) {
				System.out.print(" "+dateQueue.pop()+"\t");
			}
			if((i+day)%7==0){
				System.out.println();
			}
		}

	}

}

