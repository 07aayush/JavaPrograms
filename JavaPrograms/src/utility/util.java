package utility;

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
}
