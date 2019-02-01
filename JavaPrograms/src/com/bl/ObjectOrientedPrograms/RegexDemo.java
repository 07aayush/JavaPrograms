package com.bl.ObjectOrientedPrograms;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Date;
public class RegexDemo 
{
/**
 * Description : Hello <<name>>, We have your full
 * name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.
 * Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.
 * Use Regex to replace name, full name, Mobile#, and Date with proper value.
   I/P -> read in the Message
 * Logic -> Use Regex to do the following :
 * Replace <<name>> by first name of the user ( assume you are the user)
 * replace <<full name>> by user full name.
 * replace any occurance of mobile number that should be in format
 * 91-xxxxxxxxxx by your contact number.
 * replace any date in the format XX/XX/XXXX.
 * O/P -> replaced any date in the format XX/XX/XXXX by current date.
 */
	public static void main(String[] args)
	{
		Date date = new Date();
		SimpleDateFormat sm =new SimpleDateFormat("dd/MM/yyyy");
		String date1 =sm.format(date);
		
		String msg="Hello <<name>>, We have your full name as <<full name>> in our system. "
				+ "\nyour contact number is 91-xxxxxxxxxx. Please,let us know in case of any"
				+ "\nclarification Thank you BridgeLabz <<date>>";
		//Adding to the list which is passed as parameter to pattern class
		List<String> regex=new ArrayList<String>();
		regex.add("<<name>>");
		regex.add("<<full name>>");
		regex.add("91-xxxxxxxxxx");
		regex.add("<<date>>");
		//Adding to the list which is passed as parameter to matcher class
		List<String> replace=new ArrayList<String>();
		replace.add("Aayush");
		replace.add("Aayush Gandhi");
		replace.add("+91-9635313563");
		replace.add(date1);
		System.out.println(msg);
		Pattern pattern ;
		Matcher matcher;
		int count=0;
		//getting each element from the list and replacing in the String
		while(count!=regex.size()) {
			pattern =Pattern.compile(regex.get(count));
			matcher=pattern.matcher(msg);
			msg=matcher.replaceAll(replace.get(count));
			count++;
		}
		System.out.println();
		System.out.println(msg);		
	}
}
