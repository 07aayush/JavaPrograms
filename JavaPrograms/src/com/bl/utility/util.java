package com.bl.utility;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/// Until class for generics method
public class util {

	/**
	 * @param s1 to replace the name
	 * @param s2  the replaced name
	 * @return
	 */
	public static String stringReplace(String s1,String s2)
	{
		//used string replace methods
		return s1.replace("<<user name>>", s2);
	}
	
	/**
	 * @param t
	 * @return returning the array
	 * used math.ramdon function
	 * where the random number is generated and
	 * if its less then 0.5 then incr tail else incr head
	 * and finally find the percentage
	 */
	public static int[] Percentage(int t)
	{
		int tail =0;
		int head = 0;
		int[] arr = new int[2];
		while(t!=0)
		{
			double d = Math.random();
			if(d<0.5)
			{
				tail++;
				
			}
			else
			{
				head++;
			}
				t--;
		}
		int tailper = (int)(((double)tail/(tail+head))*100);
		int headper = (int)(((double)head/(tail+head))*100);
		arr[0]=tailper;
		arr[1]=headper;
		return arr;
	}
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
		        // If a year is multiple of 400,  
		        // then it is a leap year 
		        if (year % 400 == 0) 
		            return true; 
		      
		        // Else If a year is multiple of 100, 
		        // then it is not a leap year 
		        if (year % 100 == 0) 
		            return false; 
		      
		        // Else If a year is multiple of 4, 
		        // then it is a leap year 
		        if (year % 4 == 0) 
		            return true; 
		        return false; 
		    } 
	}
	
	
	/**
	 * @param n
	 * used math function
	 * used for loop to initialize the state
	 * use the range between the n which should be greater than 0 
	 * and n should be lesser than 31
	 * else
	 * display msg saying overflow
	 */
	
	public static void powerof2(int n)
	{
		
		for(int i=0;i<=n;i++)
		{
			System.out.println("2^"+i+" = "+(int)Math.pow(2, i));
			
		}
	}
		
	
	
	// Function to find nth Harmonic Number 
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
    public static void primeFactors(int n) 
    { 
        
        while (n%2==0) 
        { 
            System.out.print(2 + " "); 
            n /= 2; 
        } 
  
        
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            //  
            while (n%i == 0) 
            { 
                System.out.print(i + " "); 
                n /= i; 
            } 
        } 
  
        if (n > 2) 
            System.out.print(n); 
		
	}
    /**
     * @param a
     * used math.ramdom range(0.5)
     * if won the +$1(cash increased) or when lost -$1(cash decresed)
     * finally when stake(cash) is equal to goal 
     * wins will be incremented.
     */
    public static void game(int[] a) {
    	
    	int stake =100;
    	int goal=150;
    	int num=4;
    	
    	int bets=10;
    	int wins=0;
    	for (int i=0;i<=num;i++)
    	{

            int cash = stake;
           while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;     // win $1
                else                     cash--;     // lose $1
            }
            if (cash == goal) wins++;                
        }

    	System.out.println(wins + " wins of " + num);
    	double percentage = 100 * wins / num;
    	
        System.out.println("Percent of games won = " +percentage);
        System.out.println("Percent of games lost = " + (100.0 - percentage));
        System.out.println("Avg # bets = " + 1.0 * bets / num);
    }
    
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
    
    
    /**
     * @param m indicate number of rows
     * @param n incicate number of cols
     * @param a traverse and store in array
     * 
     * store the 2d array in sequential form
     */
    public static void twoDarray(int m,int n,int a[][]) {
    	
    	PrintWriter pw = new PrintWriter(System.out, true); 
    	Scanner sc1 = new Scanner(System.in);
    	pw.println("enter the elements");
    	for(int i = 0; i < m; i++) //rows
    	{
    		for(int j = 0; j < n;j++ ) //col
    		{
    			a[i][j]=sc1.nextInt(); // store the array
    		}
    	}
    	//printing 2dArray
  	
    	for(int i=0;i<m;i++)
    	{
    		for(int j=0;j<n;j++)
    		{
    			pw.print(a[i][j]+"  ");
    		}
    		pw.println();
    		
    	}
    	
    }
    
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
    	for(i = 0 ;i<length;i++ )
    	{
    		for(j=i+1;j<length;j++)
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
    
    public static double EuclideanDistance(double x , double y)
    {
        double dist = Math.sqrt(x*x + y*y);
		return dist;

    }
    
    /**
     * @param ch
     * @param i
     * @param j
     * 	//  function to swap two characters in a character array
     */
    public static void swap(char[] ch ,int i ,int j)
    {
    	char temp = ch[i];
    	ch[i]=ch[j];
    	ch[j]=temp;
    }
    
	/**
	 * @param ch
	 * @param currentIndex
	 * iterative function to generate all permutations of a String
	 * use ToCharArray which which converts strings to sequence of characters. 
	 */
	public static void permutations(char[] ch, int currentIndex)
	{//method 1
		if (currentIndex == ch.length - 1) {
			System.out.println(String.valueOf(ch));
		}

		for (int i = currentIndex; i < ch.length; i++)
		{
			swap(ch, currentIndex, i);
			permutations(ch, currentIndex + 1);
			swap(ch, currentIndex, i);
		}
	}
	
   
	/**
	 * @param candidate
	 * @param remaining
	 * using recurtion
	 * Recursive function to generate all permutations of a String
	 */
	public static void perm(String candidate, String remaining)
	{
		//method2
		if (remaining.length() == 0) {
			System.out.println(candidate);
		}

		for (int i = 0; i < remaining.length(); i++)
		{
			String newCandidate = candidate + remaining.charAt(i);

			String newRemaining = remaining.substring(0, i) +
								  remaining.substring(i + 1);

			perm(newCandidate, newRemaining);
		}
	}
  
	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 * if the first root is 0 thn the roots cannnot be found
	 * use math.sqrt function to find the roots.
	 */
	public static void Quadratic(double a,double b,double c)
	{
		  double quadratic =((b*b)-(4*a*c));
		  double root1 = (-b + Math.sqrt(quadratic))/(2*a);
		  double root2 = (-b - Math.sqrt(quadratic))/(2*a);
		  System.out.println("\nroot1 and root2 are :"+a +b+ c);
		  System.out.println();
		  System.out.print("\n"+root1);
		  System.out.print("\n"+root2);

	}

	public static double wind(double t, double v)
	{
        double result=35.74+0.6215+(0.4275*t-35.75)*Math.pow(v, 0.16);;

        return result;
		
	}
	
	/********************************************************************************************************/
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
	
	
	/**
	 * hecks two strings are palindrome or not
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
}


