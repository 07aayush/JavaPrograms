package com.bl.utility;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/// Until class for generics method
public class util {
	
	static  Scanner sc = new Scanner(System.in);
	
	/**
	 * @param s1 to replace the name
	 * @param s2  the replaced name
	 * @return
	 */
	public static String stringReplace(String s1,String s2)
	{
		//used string replace methods
		return s1.replace("user name", s2);
	}
	
/********************************************************************************************************/
	
	/**
	 * staic method to calculate percentage of getting head, for a given number of
	 * times the coin flipped
	 * 
	 * @param trials the number of times the coin to be flipped
	 * @return a double value of percentage of head appeared
	 */
	public static double percentageOfHeads(int trials)
	{
		int heads = 0;
		for(int i = 0; i < trials; i++)
		{
			if(Math.random() >= 0.5)
				heads++;
		}
		if(heads == 0)
			return 0;
		return (heads*1.0)/trials*100;		
	}
/********************************************************************************************************/	
	
	/**
	 * @param year
	 * @return boolean
	 * if it is multple of 400 then return true
	 * if it is multiple of 4 then return true
	 * else
	 * if it is multiple of 100 then return false
	 */
	public static boolean year(int year)
	{
		 { 
			 if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))

		      return true; 
		    }
		return false; 
	}
/********************************************************************************************************/
	
	/**
	 * @param n
	 * used math function
	 * used for loop to initialize the state
	 * use the range between the n which should be greater than 0 
	 * and n should be lesser than 31
	 * else
	 * display msg saying overflow
	 */
	
	public static void powerOfTwo(int n)
	{
		
		for(int i=0;i<=n;i++)
		{
			System.out.println("2^"+i+" = "+(int)Math.pow(2, i));
			
		}
	}
		
/********************************************************************************************************/
	
	/**
	 * @param n
	 * @return  return the sum
	 * declare double because the harmonic number will
	 * be in decimals
	 * 
	 */
	public static double nthHarmonic(int n) 
	{ 
	    // H1 = 1 
	    double h = 1; 
	  
	    // loop to apply the formula  
	    // Hn = H1 + H2 + H3 ... + Hn-1 + Hn-1 + 1/n 
	    for (int i = 1; i <= n; i++) { 
	        h = h+(double)1 / i; 
	    } 
	  
	    return h; 
	} 
	
/********************************************************************************************************/

    /**
     * @param n
     * check if n is divisible by 2,then print 2,and divide by 2
     * used math func (math.sqrt)
     * Print the number of 2s that divide n 
     * n must be odd at this point.  So we can 
     * skip one element (Note i = i +2) 
     * While i divides n, print i and divide n
     * this condition is to handle the case when 
     * n is a prime number greater than 2 
     */
    public static int primeFactors(int n) 
    { 
        
        while (n%2==0) 
        { 
            System.out.print(2 + " "); 
            n /= 2; 
        } 
  
        
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            
            while (n%i == 0) 
            { 
                System.out.print(i + " "); 
                n /= i; 
            } 
        } 
  
        if (n > 2) 
            System.out.print(n); 
		return -1;
	}
    
/********************************************************************************************************/
    
    /**
     * @param a
     * used math.ramdom range(0.5)
     * if won the +$1(cash increased) or when lost -$1(cash decresed)
     * finally when stake(cash) is equal to goal 
     * wins will be incremented.
     */
    public static void playGame(int stake, int goal, int trials) {
		int wins = 0;
		int bets = 0;
		for(int i = 1; i <= trials ; i++) {
			int cash = stake;
			//play until he/she wins/loose the game
			while( cash > 0 && cash < goal) {
				bets++;
				if(Math.random() >= 0.5)// $1 per bet
					cash++;
				else
					cash--;		   
			}
			if(cash == goal)
				wins++;
		}
		System.out.println("Total no. of bets made  = "+bets);
		System.out.println("Total no. of wins = "+ wins);
		double winPercentage = (wins*100.0)/trials;
		System.out.println("Win % = "+winPercentage);
		System.out.println("Loss % = "+(100-winPercentage));
	}

/********************************************************************************************************/
    
    /**
     * @param no_of_times
     * @return 
     * used boolean array 
     * as array stores multiple values
     * and boolean returns only true or false
     * hence it finds the distinct number
     * and displays result
     * and finally to display how many random numbers were
     * generated to display 'n' distinct numbers.
     */
    public static int RandomNumberGeneration(int No_Of_Times)
	{
		boolean[] isDistinct = new boolean[No_Of_Times];
		int dcount=0;
		int randcount =0;
		while(dcount<No_Of_Times)
		{	
			int randomnumber = (int ) (Math.random()*No_Of_Times);
			randcount++;
			if(!isDistinct[randomnumber])
			{
				dcount++;
				isDistinct[randomnumber]=true;
				System.out.println("Distinct coupons are : "+randomnumber);
			}
		}
		return randcount;
    }
    
/********************************************************************************************************/
    
     /**
     * @param m indicate number of rows
     * @param n incicate number of cols
     * @param a traverse and store in array
     * 
     * store the 2d array in sequential form
     */
    public static int read2DArrayElements(int[][] arr,int rows, int cols) {
		for (int i = 0; i < rows; i++)
		{
			for(int j = 0; j< cols;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		return -1;
	}

	/**
	 * function to display 2-D array elements to the console
	 * 
	 * @param arr the 2-D array whose elements to be read
	 * @param rows the number of rows of 2-D array
	 * @param cols the number of columns of 2-D array
	 */
	public static int display2DArrayElements(int[][] arr,int rows, int cols) {
		try(PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out),true)){
			for (int i = 0; i < rows; i++)
			{
				for(int j = 0; j< cols;j++)
				{
					pw.write(arr[i][j] + "  ");
				}
				pw.println();
			}//end of the outer-loop
		}//end of try-with resource
		return -1;
	}
    
	
/********************************************************************************************************/
    
    /**
     * function to display and to count the distinct numbers in an array
     * take 3 variables and a count
     * traverse the numbers using (i,j,k for ;loop)
     * then check whether thir sum equals to 0
     * finally print the distinct numbers and return the count
     * @param numbers
     * @return
     */
    public static int countDistinctTriplet(int[] b, int length)
    {
    	
    	int i,j,k,count =0;
    	for(i = 0 ;i<length-2;i++ )
    	{
    		for(j=i+1;j<length-1;j++)
    		{
    			for(k=j+1;k<length;k++)
    			{
    				// printing distinct triples (i, j, k) where a[i] + a[j] + a[k] = 0
    				if(b[i]+b[j]+b[k]==0)
    				{
    					System.out.println(b[i] + " " + b[j] + " " + b[k]);
						count++;
    				}
    			}
    		}
    	}
    	return count;
    } 
    
/********************************************************************************************************/
    
    /**
     *  coumputes Euclidian distance
	 * 
	 * @param x value of x-axis of pint p(x,y)
	 * @param y value of y-axis of pint p(x,y)
	 * @return Euclidian distance from the origin to the poin p(x,y)
	 */
    public static double EuclideanDistance(double x , double y)
    {
        double dist = Math.sqrt(x*x + y*y);
		return dist;
	}
    
/********************************************************************************************************/

    /**
	 * generates an array of permutations of a given string by iterative approach 
	 * @param inputStr the string for which the permutations has to be generated
	 * @return string array of permutations of inputStr
	 */
	public static String[] stringPermutationsByIterative(String inputStr) {
		List<String> results = new ArrayList<String>();
		char[] chars = inputStr.toCharArray();
		results.add(new String("" + chars[0]));
		for(int j=1; j<chars.length; j++) {
			char c = chars[j];
			int cur_size = results.size();
			//creating new permutations by combining char 'c' with each of the existing permutations
			for(int i=cur_size-1; i>=0; i--) {
				String str = results.remove(i);
				for(int l=0; l<=str.length(); l++) {
					results.add(str.substring(0,l) + c + str.substring(l));
				}
			}
		}
		String[] permutations = results.toArray(new String[results.size()]);
		return permutations;
	}
	
	/**
	 * function to display string array elements
	 * @param str String array
	 */
	public static void displayStringArray(String[] str) {
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
	
/********************************************************************************************************/

	/**
	 * computes and returns the two roots of a quadratic equation 
	 * 
	 * @param a variable 
	 * @param b variable
	 * @param c constant
	 * @return array of roots
	 */
      public static double[] quadraticRoots(double a, double b, double c) {
	  double[] roots = new double[2];
	  //check for division by zero
		if(a == 0.0) {
			System.out.println("can't find the quadritc roots for an equation of degree less than 2...!");
			return roots = null;
		}

		double delta = b*b-4*a*c;
		roots[0] = (-b+Math.sqrt(delta))/(2*a);
		roots[1] = (-b-Math.sqrt(delta))/(2*a);
		return roots;
	}

/********************************************************************************************************/

      
	/**
	 * computes and returns windchill(the effective temperature)
	 * Formulae : 35.74 + 0.6215t + (0.4275t - 35.75)v^0.16
	 * 
	 * @param temperature the temperature (in Fahrenheit) 
	 * @param windSpeed the wind speed (in miles per hour)
	 * @return windChill
	 */
	public static double windChill(double temperature, double windSpeed)
	{
		double windChill = 0.0;
		windChill = 35.74 + 0.6215*temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed, 0.16);
		return windChill;
	}
	
/**********************************************************************************************************************************************/
											//ALGORITHM PROGRAMS//
	
	
	/**
	 * @param str1 the first string
	 * @param str2 the second string
	 * @return
	 * checks two strings Anagram or not
	 * 
	 */
	public static boolean checkAnagram(String str1, String str2) {
		char[] str1Chars = str1.toLowerCase().toCharArray();
		char[] str2Chars = str2.toLowerCase().toCharArray();
		Arrays.sort(str1Chars);
		Arrays.sort(str2Chars);
		str1 = new String(str1Chars);
		str2 = new String(str2Chars);
		return str1.equals(str2);
	}
	
/********************************************************************************************************/

	
	/**
	 * @param num  num to check prime or not
	 * checks the number is prime or not
	 * @return to return true o false
	 */
	public static boolean isPrime(int num) 
	{
		for(int i = 2 ; i <= num/2 ; i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}
	
/********************************************************************************************************/

	
	/**
	 * checks two strings are palindrome or not
	 * @param str1 first string
	 * @param str2 second string
	 * @return true or false
	 */
	public static boolean checkPalindrome(String str1, String str2)
	{
		String temp = new StringBuilder(str2).reverse().toString();//reversed of str2
		if(str1.trim().toLowerCase().equals(temp))
			return true;
		return false;
	}
	
/********************************************************************************************************/

	/**
	 * finds and returns anagrams of a set of numbers
	 * @param nums array of numbers
	 * @return a map having al the anagrams
	 */
	public static HashMap<String,String> anagramsOfNumbers(ArrayList<Integer> nums)
	{
		HashMap<String,String> primeAnagrams = new HashMap<String,String>();
		boolean anagram = false;
		for(int i = 0 ;i < nums.size() - 1; i++) {
			for(int j= i+1; j < nums.size(); j++) {
				Integer p1 = nums.get(i);
				Integer p2 = nums.get(j);
				anagram = util.checkAnagram(p1.toString(), p2.toString());
				if(anagram) {
					if(primeAnagrams.containsKey(p1))
					{
						String oldValue = primeAnagrams.get(p1);
						primeAnagrams.put(p1.toString(), oldValue+","+p2.toString());
					}
					else
						primeAnagrams.put(p1.toString(), p2.toString());
				}//end of anagram condition
			}
		}
		return primeAnagrams;
	}
	/**
	 * finds and returns palindromes of a set of numbers
	 * @param nums array of numbers
	 * @return a Map having all the palindromes
	 */
	public static HashMap<String,String> palindromesOfNumbers(ArrayList<Integer> nums)
	{
		HashMap<String,String> allPalindromes = new HashMap<String,String>();
		boolean palindrome = false;
		for(int i = 0 ;i < nums.size() - 1; i++) 
		{
			for(int j= i+1; j < nums.size(); j++) 
			{
				Integer p1 = nums.get(i);
				Integer p2 = nums.get(j);
				palindrome = util.checkPalindrome(p1.toString(), p2.toString());
				if(palindrome) 
				{
					if(allPalindromes.containsKey(p1))
					{
						String oldValue = allPalindromes.get(p1);
						allPalindromes.put(p1.toString(), oldValue+","+p2.toString());
					}
					else
						allPalindromes.put(p1.toString(), p2.toString());
				}//end of palindrome condition

			}
		}//end of i loop
		return allPalindromes;
	
	
	}
	
	/**
	 * @param num to store the integer numbers
	 * @param key to search the given integer in the stored array
	 * @return if the key is found else return -1
	 */
	public static int Binary_Search(int[] num,int key)
	{
		int l = 0;
		int r = num.length -1;
		
		while(l<=r)
		{
	        int m =((l + r) / 2);
	        if(key<num[m])
	        
	        	r=m-1;
	        else if(key>num[m])
	        	l=m+1;
	        else
	        	return m;
		}
		return -1;
	}
	
/********************************************************************************************************/

	/**
	 * @param num to store the string numbers
	 * @param key to search the given integer in the stored array
	 * @return if the key is found else return -1
	 */
	public static int binarySearch(String[] arr, String x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            int res = x.compareTo(arr[m]); 
  
            // Check if x is present at mid 
            if (res == 0) 
                return m; 
  
            // If x greater, ignore left half 
            if (res > 0) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        return -1; 
    }
	
/********************************************************************************************************/

	public static int insertionSort(int array[])
	{
		  int n = array.length;  
	        for (int j = 1; j < n; j++) 
	        {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) 
	            {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	        }
			return -1;  
	    }  
	}


