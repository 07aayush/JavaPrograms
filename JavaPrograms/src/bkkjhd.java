
public class bkkjhd {

	public static void main(String[] args)
	{
		int base = 2 ,pow=2;
		int result =1;
		
		while(pow!=0)
		{
			result *= base;
			--pow;
		}
		System.out.println("answer = " +result);

		
		
		
		for(int i = 0 ; i<pow ; i++)
		{
			result *= base;
			pow--;
		}
}
