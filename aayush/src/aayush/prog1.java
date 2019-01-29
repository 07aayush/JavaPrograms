package aayush;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class prog1 
{
	public static void main(String[] args)
	{


		String path;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the path");
		path = sc.next();
		File f = new File(path);
		if(f.exists() && f.isDirectory())
		{
			File[] fa = f.listFiles();
			for(File fi : fa)
			{
				if(fi.isFile() && fi.getName().contains(".txt"))
				{
					//fi is a File obj that points to a text file path
					BufferedReader br = null;
					try
					{
						br = new BufferedReader(new FileReader(fi));
						String line;
						System.out.println("reading contents of "+fi.getName());
						while((line=br.readLine())!=null)
						{
							System.out.println(line);
						}
						System.out.println("-------");
					}
					catch(IOException e)
					{
						e.printStackTrace();
					}
					finally
					{
						if(br!=null)
							try {
								br.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
				}
			}
		}
	}
}
