package com.bl.utility;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/// Until class for generics method
public class Util {

	public static  Scanner sc = new Scanner(System.in);

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



	public static void gambler(int stake, int goal , int games)
	{
		int counter=0,win=0,bets=0;
		float n;
		while(counter<games && (stake>0 && stake<goal)) 
		{
			bets++;
			n=(float) Math.random();
			if(n>0.5) 
			{
				stake++;
				win++;
				System.out.println(n+" win ");
			}
			else 
			{
				stake--;

				System.out.println(n+" loss ");

			}
			counter++;
		}
		System.out.println("The number of wins are: "+win+", percentage of wins: "+(win*100/(bets)+", bets: "+bets));	
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
				System.out.println(randomNumberInRange(10000, 100000));
			}
		}
		System.out.println("total number of random numbers generated are : "+randcount);
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
	/**
	 * reads a string input from input device
	 * @return a string
	 */
	public static String getString() 
	{
		String str = sc.next();
		while(str.trim().equals("") || str == null) {
			System.out.println("Enter a valid string...!");
			str = sc.next();
		}
		return str;

	}
	/********************************************************************************************************/

	public static void permutationRecursive(String str,int l,int r)
	{

		if(l==r)
			System.out.println(str);
		else
		{
			for(int i =0;i<=r;i++)
			{
				str =swap(str,l,i);
				permutationRecursive(str,l+1,r);
				str=swap(str,l,i);
			}
		}
	}

	public static String swap(String str,int l,int i)
	{
		char temp;
		char[] charArr = str.toCharArray();
		temp=charArr[l];
		charArr[l]=charArr[i];
		charArr[i] =temp;
		return String.valueOf(charArr);
	}
	
	/**
	 * To generate all permutation of String using Iterative method
	 * @param sentance is a String type
	 * @return type is a array of integer
	 */
	public static String[] permutationOfStringIterative(String sentance) {
		List<String> results = new ArrayList<String>();
		char[] chars = sentance.toCharArray();
		results.add(new String("" + chars[0]));
		//looping over every chars 
		for(int j=1; j<chars.length; j++) {
			char c = chars[j];
			int currentSize = results.size();
			//creating new permutations by combining char 'c' with each of the existing permutations
			for(int i=currentSize-1; i>=0; i--) {
				String str = results.remove(i);
				for(int l=0; l<=str.length(); l++) {
					results.add(str.substring(0,l) + c + str.substring(l));
				}
			}
		}
		String[] permutations = results.toArray(new String[results.size()]);
		return permutations;
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

	/********************************************************************************************************/

	public static boolean isNumber(String s) 
	{ 
		if(s.charAt(0) == '-' || s.charAt(0) == '+' ){
			for (int i = 1; i < s.length(); i++) 
				if (Character.isDigit(s.charAt(i))== false) 
					return false; 
			return true; 
		}
		else {
			for (int i = 0; i < s.length(); i++) 
				if (Character.isDigit(s.charAt(i))== false) 
					return false; 
			return true; 
		}
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

	/**
	 * function to print the integer elements of an integer array
	 * @param A array of integers
	 */
	public static void printIntArray(int[] A) {
		for (int i : A) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	/**
	 * function to print string elements of a string array
	 * @param A array of strings
	 */
	public static void printStringArray(String[] A) {
		for (String i : A) {
			System.out.print("\t"+i);
		}
		System.out.println();

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
	public static  boolean checkAnagram(String str1, String str2) {
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
				anagram = checkAnagram(p1.toString(), p2.toString());
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
				palindrome = Util.checkPalindrome(p1.toString(), p2.toString());
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
	public static int binarySearch(int[] num,int key)
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

	/**
	 * function converts decimal to binary
	 * given the decimal number first it checks whether it is greater than 0
	 * if yes then it firstly stores it in the String (binaryDigits)
	 * and then it calcuates the mod of the given decimal 
	 * finally it returns the number of binary digits present in the stirng 
	 * @param decimal
	 * @return binary digits.
	 */
	public static String toBinary(int decimal)
	{
		String binaryDigits = "";
		while(decimal>=1)
		{
			binaryDigits += decimal%2;
			decimal = decimal/2;
		}
		String s2 ="";
		if(binaryDigits.length()<8)
		{
			String s3="00000000";
			s2=s3.substring(0, 8-binaryDigits.length());		
		}
		for(int i = binaryDigits.length()-1;i>=0;i--)
		{
			s2 += binaryDigits.charAt(i);
		}
		return s2;		
	}	

	/**
	 * function converts decimal to binary
	 * take an temp var and store the number in your result
	 * 
	 * @param number
	 * @return the decimal number
	 */
	public static int toDecimal(int number)
	{
		int decimal =0;
		int base=1;
		int temp = number;
		while(temp!=0)
		{
			int lastDigit = temp%10;
			temp=(int)temp/10;
			decimal =decimal + lastDigit*base;
			base = base*2;
		}
		return decimal;
	}

	public static boolean isPowerTwo(int num)
	{
		if (num == 0) 
			return false; 

		while (num != 1) 
		{ 
			if (num % 2 != 0) 
				return false; 
			num = num / 2; 
		} 
		return true; 
	}

	public static int nibbleSwap(int Number)
	{
		String binaryString=toBinary(Number);
		int  x=8-binaryString.length();
		String s="";
		for(int i=0;i<x;i++)
		{
			s+="0";
		}

		binaryString=s+binaryString;
		String firstnibble=binaryString.substring(0,4);
		String secondnibble=binaryString.substring(4);
		binaryString=secondnibble+firstnibble;
		x=1;
		int changeNumber=0;
		for(int start=binaryString.length()-1;start>=0;start--)
		{
			changeNumber=changeNumber+(Integer.parseInt(binaryString.charAt(start)+""))*x;
			x=x*2;
		}
		return changeNumber;

	}
	
	
	public static int calendar(int date,int month,int year) 
	{
	   
      //Standard way---to find day	
    	
		int year0= year-(14-month)/12;    
		
		int x = year0 + (year0 / 4) - (year0 / 100) + (year / 400);
		
		int m0 = month + 12 * ((14 - month) / 12) - 2;

		int dateofday = (date + x + ((31 * m0) / 12)) % 7;
		return dateofday;
		
		
	}
	public static boolean isPrime3(int n) //e.g n=15 any no----from the given range
	  {  
		  int m = n/2;
		  
		  		if (n <= 1)  //e.g n=15
		  		{  
		  			return false;  
		  		}  
    
		  	//e.g n=15
		  	for (int i = 2; i <= m; i++) //------use use n/2 ,if we use MAth.sqrt(n) and if n=25...answer is 5...so directy print not p
		  	{  
		  			if (n % i == 0)
		  			{  
		  					return false;  
		  			}  
		  	}  
     
		  	return true;  
	  }    
	
	public static boolean isPrime4(int n) //e.g n=15 any no----from the given range
	  {  
		  		if (n <= 1)  //e.g n=15
		  		{  
		  			return false;  
		  		}  
   
		  	//e.g n=15
		  	for (int i = 2; i <= Math.sqrt(n); i++) //------use math.sqrt(n) or use n/2
		  	{  
		  			if (n % i == 0)
		  			{  
		  					return false;  
		  			}  
		  	}  
    
		  	return true;  
	  }  
	
	/**
	  * to get palindrome of a no
	  * @param m: no to take palindrome/reverse
	  * @return : Integer
	  */
	 public static int Anagram4(int m) //reverse
	  {
		  @SuppressWarnings("unused")
		int r,sum=0,temp; 
		  
		  //It is the number variable to be checked for palindrome    
		  
		  while(m>0)
		  {    
		     r =   m % 10;  //getting remainder  
		     sum= ( sum * 10 ) + r;    
		     m = m / 10;    
		  }    
		  
        return sum; 
	  }
	
	 public static boolean isPrime5(int n) //e.g n=15 any no----from the given range
	  {  
		  		if (n <= 1)  //e.g n=15
		  		{  
		  			return false;  
		  		}  
    
		  	//e.g n=15
		  	for (int i = 2; i <=Math.sqrt(n); i++) //------use math.sqrt(n) or use n/2
		  	{  
		  			if (n % i == 0)
		  			{  
		  					return false;  
		  			}  
		  	}  
     
		  	return true;  
	  }  

	 public static int Anagram5(int m)
	  {
		  int r,sum=0; 
		  
		  //It is the number variable to be checked for palindrome    
		  
		  while(m>0)
		  {    
		     r =   m % 10;  //getting remainder  
		     sum= ( sum * 10 ) + r;    
		     m = m / 10;    
		  }    
		  
        return sum; 
	  }
	 
	 public boolean leapforCalender(int yearnumber)
		{
			boolean isLeapYear = true; 
			if(String.valueOf(yearnumber).length()<4)
			{
				System.out.println("Please enter 4 digit number :");
				yearnumber=sc.nextInt();
				leap_year(yearnumber); 
			}
			
			else if(yearnumber%4==0)
			{
				//if yr no. is divisible by 4 then check by 100
				if(yearnumber%100==0)
				{
					//now checking no. is divisible by 400 or not
					if(yearnumber%400==0)
					{
						//if no. divisible by 4,100 and 400 ie. leap year
						return true;
					}
					else
						return false;
				}
				//if no is divisible by 4 and not by 100 ,that is leap yr
				else
					return true;
			}
			else
				return false;
			return isLeapYear;
		}
		/** This method print calendar of any month and year 
		 * @param month is user input that which month calender you want to print
		 * @param year is user input whose calendar you want to print 
		 */
		public void printCalender(int month , int year)
		{
			String[] Month = {"January","February", "March","April", "May", "June","July", "August", "September",
		            	"October", "November", "December"};
			int[] noOfDays  = {0,31,28,31,30,31,30,31,31,30,31,30,31};
			int result = Util.dayOfWeek(month, 1, year);
			System.out.println("   "+Month[month-1]+" "+year);
			if( month == 2 && leapforCalender(year) )
			{
				noOfDays[2] = 29;  //For leap year days will be 29
			}									
			System.out.println("S  M  Tu W  Th F  Sa  ");
	 		for(int i = 0 ;i<result ; i++)
	 		{
	 			System.out.print("   ");
	 		}
	 		for(int i=1;i<=noOfDays[month];i++)
	 		{
	 			if(i<=9)
	 			{
	 				System.out.print(i+"  ");
	 			}
	 			else if(i>9)
	 			{
	 				System.out.print(i+" ");
	 			}
	 			if((result+i)%7==0)
	 				System.out.println();
	 		}
	 		
		}


int n;
public void leap_year(int yearnumber)
		{
			if(String.valueOf(yearnumber).length()<4)
			{
				System.out.println("Please enter 4 digit number :");
				yearnumber=sc.nextInt();
				leap_year(yearnumber);
			}
			
			else if(yearnumber%4==0)
			{
				//if yr no. is divisible by 4 then check by 100
				if(yearnumber%100==0)
				{
					//now checking no. is divisible by 400 or not
					if(yearnumber%400==0)
					{
						//if no. divisible by 4,100 and 400 ie. leap year
						System.out.println("\nIt is leap year");
					}
					else
						System.out.println("\\nIt is not  leap year ");
				}
				//if no is divisible by 4 and not by 100 ,that is leap yr
				else
					System.out.println("\nIt is leap year");
			}
			else
				System.out.println("\nIt is not leap year ");
		}

/**This method print prime number from 0 to n in 2 dimensional array
 * @param primenumber is list of prime number from 1 to n
 */
public void twoDPrime(int[] primenumber)
{
	int row = 10 ,column = 27;
		int[][] array = new int[row][column];
		int temp = 100 , k=0;
		for(int i = 0 ;i<row; i++)
		{
			for(int j= 0 ; j<column ; j++)
			{
				if(k<primenumber.length )
			{
					if(primenumber[k] <= temp )
					{
						array[i][j] = primenumber[k];
						k = k+1;
					}
				} 
			} 	
			temp = temp + 100;
		}
		//printing in 2D array
		System.out.println("");
		for(int i = 0 ;i<row ; i++)
		{
			for(int j= 0 ; j<column ; j++)
			{
				if(primenumber[j]>0)
				{
					if(array[i][j] != 0)
					{
						System.out.print(array[i][j]+"\t");
					}
				}
			}
			System.out.println();
		}
}	
/**This method print prime number from 0 to till the range
 * whatever you want  
 * @param range store number and till that it will print
 * prime numbers
 */
public static int[] printingPrimeNumber(int range) 
{
	   boolean isPrime = true;
	   int count = 0;
	   int primeno[]=new int[range];		   
	   for (int i = 0; i <= range; i++)         
       { 		  
          for(int j=2; j<i ;j++)
          {
        	     if(i%j==0)
             	 {
             	 	isPrime=false;
             	 	break;
             	 }
             	 else 	
        	     	isPrime=true;
          	}
          	if(isPrime==true)
        	  primeno[count++]=i;
       }
	return primeno ;		     
}

public static void twoDPrimeAnagram(int[] anagram)
{
	int row = 20 ,column = 26;
		int[][] anagramArray = new int[row][column];
		int temp = 100 , k=0;
		for(int i = 0 ;i<row; i++)
		{
			for(int j= 0 ; j<column ; j++)
			{
				if(k<anagram.length )
			{
					if(anagram[k] <= temp )
					{
						anagramArray[i][j] = anagram[k];
						k = k+1;
					}
				} 
			} 	
			temp = temp + 100;
		}
		
		System.out.println("");
		for(int i = 0 ;i<row ; i++)
		{
			for(int j= 0 ; j<column ; j++)
			{
				if(anagram[j]>0)
				{
					//printing prime anagram numbers in 2D array
					if(anagramArray[i][j] != 0)
					{
						System.out.print(anagramArray[i][j]+"\t");
					}
				}
			}
			System.out.println();
		}
}


/**This method check that prime number is anagram or not
 * @param primenumber:is prime numbers which we check that numbers are
 * anangram or not
 */
public static int[] checkAnagram(int[] primenumber)
{
    System.out.println("\nThe prime number which are Anagram:");
    int anagram = 0;
    int[] anagramArray = new int[primenumber.length]; 
    for (int  i = 0; i < primenumber.length; i++)
    {
        for (int j = 0; j < primenumber.length; j++)
        {
             if(primenumber[i]>0 && primenumber[j]>0 && primenumber[i]!=primenumber[j])
             {     
                 String string1 = Integer.toString(primenumber[i]);
                 String string2 = Integer.toString(primenumber[j]);
                 anagram=checkPrimeAnagram(string1, string2);
                 if(anagram>0)
                 {
                	 anagramArray[i] = anagram;
                	 //anagramArray[i]
                 }
             }
        }
    }
	return anagramArray;				        
}

private static int checkPrimeAnagram(String string1, String string2)
{
	int anagram =0 ;
	char[] ch1 = string1.toCharArray();
    char[] ch2 = string2.toCharArray();
    boolean result=false;
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    result = Arrays.equals(ch1,ch2);
    if(result==true)
    {
    	anagram = Integer.parseInt(string1);
    	//System.out.print(anagram+" ");
    	return anagram;
    }
	return anagram;		
}

public static int hashFunction(int num) {
	int reminder=num%11;
	return reminder;
}

public static boolean isLeapYearFourDigits(int year) {
	if((year%4)==0) {
		if(year!=100 ) {
			if ( year % 400 == 0) {
                return  true;
			} else {
            	return  false;
			}
		}else {
			return true;
		}
	}else {
		return false;
	}
	
}
public static boolean getBoolean() {
	return sc.nextBoolean();
}
/**
 * scanner method to get Boolean 
 * @return type is boolean
 */
public static double getDouble(){
	return Double.parseDouble(sc.next());
}
}


