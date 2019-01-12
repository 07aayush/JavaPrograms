package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.util;

public class StopWatch {

	public long startTimer=0;
	public long stopTimer=0;
	public long elapsed;
	
	
	/**
	 * start method for starting the stopwatch
	 * get the time from the system
	 * display it in seconds
	 */
	public void Start()
	{
		startTimer=System.currentTimeMillis();
		System.out.println("current time is "+startTimer);
		System.out.println("time displayed in seconds: "+(startTimer/1000)/60);
	}
	
	/**
	 * stop method for stopping the stopwatch
	 * get the time from system  
	 */
	public void Stop()
	{
		stopTimer=System.currentTimeMillis();
		System.out.println("current time is "+stopTimer );
		System.out.println("time displayed in seconds: "+(startTimer/1000)/60);

		
	}
	
	/**
	 * @return
	 *  subtract the starttime the stoptime
	 *  and return the elapsed time
	 */
	public long getElapsedTime()
	{
		elapsed = stopTimer-startTimer;
		return elapsed;
	}
	
	
	/**
	 * @param args
	 *  use the scanner and press 
	 *  1 to get the start time and
	 *  2 to get the stop time
	 *  invoke start and stop methods
	 *  finally invoke "getElapsedTime" to get
	 *  the time difference  and to dispaly it in seconds 
	 *  divide the elapsed time by 1000. 
	 */
	public static void main(String[] args)
	{
		
		Scanner sc1 = new Scanner(System.in);
		StopWatch sh = new StopWatch();
	
		System.out.println("enter 1 to start");
		int a = sc1.nextInt();
		sh.Start();
		
		System.out.println();
		System.out.println("enter 2 to stop");
		int b = sc1.nextInt();
		sh.Stop();
		
		long l = sh.getElapsedTime();
		System.out.println();
		System.out.println("current elapsed time in milliSeconds is "+l);
		System.out.println();
		System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
		
	}
	}


