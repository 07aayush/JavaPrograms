package com.bl.utility;

import java.io.OutputStreamWriter;
import java.util.Random;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
	public static void checkYear(int year)
	{


		if((year % 400== 0) || ((year % 4 == 0) && (year % 100 != 0)))

			System.out.println("year "+year+" is a leap year"); 
		else
			System.out.println("year "+year+" is not leap year");

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
	 */
	public static double nthHarmonic(int n) 
	{ 
		double sum = 1; 
		// loop to apply the formula  
		// Hn = H1 + H2 + H3 ... + Hn-1 + Hn-1 + 1/n 
		for (int i = 1; i <= n; i++) 
		{ 

			sum = sum+(double)1 / i;
			System.out.print(sum +"");
			System.out.println();
		}

		return sum; 
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
		int cash = stake;

		while(trials!=bets)
		{
			bets++;
		}

		for(int i = 1; i <= trials ; i++)
		{
			if(Math.random()>=0.5)
				cash++;
			else
				cash--;
		}
		if(cash==goal)
		{
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
	public static int randomNumberGeneration(int noOfTimes)
	{
		boolean[] isDistinct = new boolean[noOfTimes];
		int dcount=0;
		int randcount =0;

		while(dcount<noOfTimes)
		{	

			int randomnumber = (int ) (Math.random()*noOfTimes);
			randcount++;
			if(!isDistinct[randomnumber])
			{
				dcount++;
				isDistinct[randomnumber]=true;
				System.out.println("Random Number:- " + randomNumberInRange(10000, 100000));

				//System.out.println("Distinct coupons are : "+randomnumber);
			}
		}
		return randcount;
	}

	public static int randomNumberInRange(int min, int max) {
		Random random = new Random();
		return random.nextInt((max - min) + 1) + min;
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
	public static double euclideanDistance(double x , double y)
	{
		double dist = Math.sqrt(x*x + y*y);
		return dist;
	}

	/********************************************************************************************************/

	//	public static string permutationRecursive(String str,int l,int r)

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

		double d = b*b-4*a*c;
		roots[0] = (-b+Math.sqrt(d))/(2*a);
		roots[1] = (-b-Math.sqrt(d))/(2*a);
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
	@SuppressWarnings("unlikely-arg-type")
	public static HashMap<String,String> anagramsOfNumbers(ArrayList<Integer> nums)
	{
		HashMap<String,String> primeAnagrams = new HashMap<String, String>();
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
	@SuppressWarnings("unlikely-arg-type")
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
			int pos =((l + r) / 2);
			if(key<num[pos])

				r=pos-1;
			else if(key>num[pos])
				l=pos+1;
			else
				return pos;
		}
		return -1;
	}

	/********************************************************************************************************/

	/**
	 * @param num to store the string 
	 * @param key to search the given string in the stored array
	 * @return if the key is found else return -1
	 */
	public static int binarySearch(String[] arr, String key) 
	{ 
		int l = 0, r = arr.length - 1; 
		while (l <= r) 
		{ 
			int pos = l + (r - l) / 2; 
			int res = key.compareTo(arr[pos]); 
			if (res == 0) 
				return pos; 
			if (res > 0) 
				l = pos + 1;
			else
				r = pos - 1; 
		} 
		return -1; 
	}

	/********************************************************************************************************/

	/**
	 * function to sort the set of strings using insertion sort
	 * @param A array of integers
	 * @return a sorted array of integers
	 */
	public static int[] insertionSortUsingInt(int array[])
	{
		for(int i =1;i<array.length;i++)
		{
			for(int j = i; j > 0 ; j--)
			{
				if(array[j-1] > array[j])
				{//Swap the two elemets
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}

		}
		System.out.println("Sorted array");
		for(int i =0; i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		return array;
	}	


	/**
	 * @param arr print the sorted aray to the console
	 */
	public static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 
	/********************************************************************************************************/


	/**
	 *  function to sort the set of strings using insertion sort
	 * @param A array of strings
	 * @return a sorted array of strings
	 */
	public static String[] insertionSortUsingString(String[] str)
	{
		for(int i =1;i<str.length;i++)
		{
			for(int j = i; j > 0 ; j--)
			{
				if(str[j-1].compareTo(str[j]) > 0)
				{//Swap the two elemets
					String temp = str[j-1];
					str[j-1] = str[j];
					str[j] = temp;
				}
			}

		}
		System.out.println("\nSorted array");
		for(int i =0; i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}	
		return str;
	}

	/**
	 *@param arr print the sorted aray to the console
	 */
	public static void printString(String str[]) 
	{ 
		int n = str.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(str[i] + " "); 
		System.out.println(); 
	} 
	/********************************************************************************************************/

	/**
	 * function to sort the integers using bubble sort algorithm
	 * @param A array of integers
	 */
	public static int[] bubbleSortOfIntegers(int[] arr)
	{
		int n = arr.length;
		int temp=0;

		for(int i =0; i<arr.length;i++)
		{
			for(int j = 1 ;j<(n-i);j++)//no of comparisons
			{
				if(arr[j-1] > arr[j])
				{
					temp = arr[j-1];
					arr[j-1] =arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted array");
		for(int i =0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		return arr;
	}
	/********************************************************************************************************/

	/**
	 * function to sort the set of strings using the bubble sort algorithms
	 * @param A array of strings
	 * @return a sorted array of strings
	 */
	public static String[] bubbleSortOfStrings(String[] str)
	{
		int n = str.length;
		String temp= null;;

		for(int i =0; i<str.length;i++)
		{
			for(int j = 1 ;j<(n-i);j++)//no of comparisons
			{
				if(str[j-1].compareTo(str[j]) > 0)
				{
					temp = str[j-1];
					str[j-1] =str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println("\nSorted array");
		for(int i =0; i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
		return str;
	}		
	/********************************************************************************************************/

	/**
	 * function to sort the set of strings using insertion sort
	 * @param A array of integers
	 * @return a sorted array of integers
	 */
	public static int[] insertionSort(int array[])
	{
		for(int i =1;i<array.length;i++)
		{
			for(int j = i; j > 0 ; j--)
			{
				if(array[j-1] > array[j])
				{//Swap the two elemets
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}

		}
		System.out.println("Sorted array");
		for(int i =0; i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		return array;
	}
	/********************************************************************************************************/

	/**
	 * 
	 * function to sort the set of strings using insertion sort
	 * @param A array of integers
	 * @return a sorted array of integers
	 */
	public static int[] bubbleSort(int[] arr)
	{
		int n = arr.length;
		int temp=0;

		for(int i =0; i<arr.length;i++)
		{
			for(int j = 1 ;j<(n-i);j++)//no of comparisons
			{
				if(arr[j-1] > arr[j])
				{
					temp = arr[j-1];
					arr[j-1] =arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted array");
		for(int i =0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		return arr;
	}

	/********************************************************************************************************/

	/**
	 * method to convert celsiusToFahrenheit
	 * @param temp 
	 * @return
	 */
	public static double celsiusToFahrenheit(double temp)
	{
		return (temp* 9/5)+32;

	}

	/**
	 * method to convert fahrenheitToCelsius
	 * @param temp
	 * @return
	 */
	public static double fahrenheitToCelsius(double temp)
	{
		return (temp-32)*(5/9.0);
	}
	/********************************************************************************************************/

	/**
	 * vending machine gives you the
	 * exact number of the counted notes
	 * @param rupees   
	 */
	public static void countNotes(int rupees)
	{
		int[] array = {1000,500,100,50,20,10,5,2,1};
		int notes = 0;
		for(int i=0;i<array.length;i++)
		{
			if(rupees/array[i]>0)
			{
				System.out.println("number of notes "+array[i]+" is "+rupees/array[i]);
				notes=notes+rupees/array[i];
				rupees=rupees%array[i];
			}
		}
		System.out.println("minimum number of notes required is "+notes);
	} 

	/********************************************************************************************************/

	/**
	 * @param m to find month
	 * @param d to find day
	 * @param y to find year
	 * @return gives you the day of the week .
	 */
	public static int dayOfWeek(int m, int d ,int y)
	{
		int y0 = y - (14 - m) / 12;
		int	x = y0 + y0/4 - y0/100 + y0/400;
		int	m0 = m + 12 * ((14 - m) / 12) - 2;
		int	d0 = (d+x+31*m0/12)%7;
		return d0;
	}

	/********************************************************************************************************/

	/**
	 * @param p indicates principle
	 * @param y indicates year
	 * @param r indcates rate of intrest
	 * @return
	 */
	public static double monthlyPayment(double p,double y,double r)
	{
		double n =(12*y);
		r =r/(12*100);
		double power = Math.pow((1+r),-n);
		double payment = ((p*r)/(1-power));
		return payment;

	}

	/********************************************************************************************************/

	/**
	 * function to calculate a square root of the given number
	 * if the givne number is non -ve then math.abs returns arguement
	 * @param c for giving the number for which the sqrt is to be found
	 * @return 
	 */
	public static double sqrt(double c)
	{
		double epsilon =1e-15;
		double t =c;
		while(Math.abs(t-c/t)> epsilon*t)
		{
			t=(c/t+t)/2.0;
		}

		return t;
	}

	/********************************************************************************************************/
	public static boolean isNumber(String s) 
	{ 
		if(s.charAt(0) == '-' || s.charAt(1) == '+' || s.charAt(0) >=48 || s.charAt(0) <=57 ) {
			for (int i = 1; i < s.length(); i++) 
				if (Character.isDigit(s.charAt(i))== false) 
					return false; 
			return true; 
		}
		return false;
	}
	
	public static int readPositiveInt()
	{
		int value;
		do {
			System.out.println("Enter a positive integer number..!");
			value = sc.nextInt();
		}while(value < 0);
		return value;
	}

}



