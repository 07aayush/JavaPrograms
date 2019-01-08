package utility;

/// util class for generics method
public class util {

	public static String stringReplace(String s1,String s2)
	{
		//used string replace methods
		return s1.replace("<<user name>>", s2);
	}
	
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
	public static boolean year(int year)
	{
		 { 
		        // If a year is multiple of 400,  
		        // then it is a leap year 
		        if (year % 400 == 0) 
		            return true; 
		      
		        // Else If a year is muliple of 100, 
		        // then it is not a leap year 
		        if (year % 100 == 0) 
		            return false; 
		      
		        // Else If a year is muliple of 4, 
		        // then it is a leap year 
		        if (year % 4 == 0) 
		            return true; 
		        return false; 
		    } 
	}
	
	
	public static void powerof2(int n)
	{
		long l = 1;
		for(int i=0;i<=n;i++)
		{
			System.out.println("2^"+i+" = "+l);
			l=l*2;
		}
	}
		
	}
