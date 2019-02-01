package com.bl.ObjectOriented.AddressBook;

import java.util.Scanner;

/**
   * The software to be designed is a program that can be used to maintain an address book. An address book
   * holds a collection of entries, each recording a person's first and last names, address, city, state, zip, and
   * phone number.
   * It must be possible to add a new person to an address book, to edit existing information about a person
   * and to delete a person. It must be possible to sort the entries in the address
   * book alphabetically by last name (with ties broken by first name if necessary), or by ZIP code
 * @author bridgelabz
 *
 */
public class AddressBook {

	public static void main(String[] args) throws Exception {
		AddressBookMethods book = new AddressBookMethods();
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
	
		char ch;
		do
		{
			System.out.println("What you wants to do : ");
			System.out.println("1.Add Address\n2.Edit Information\n3.Sort Information"
					+ "\n4.Remove Person");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1 :
				book.addAddress();
				break;
			case 2 :
				book.editInfo();
				break;
			case 3 :
				book.sortData();
				break;
			case 4 :
				book.removeData();
				break;
			default :
				break;				
			}
			System.out.println("Do u want to continue Y/N : ");
			ch =sc.next().charAt(0);
		}while(ch=='Y'||ch=='y');
		}
}
