package com.bl.Oop.Address;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.sun.corba.se.impl.util.Utility;

				

public class AddressBookManager 
{
	Scanner sc = new Scanner(System.in);
		/**
		 * ch_book is the string declared static and private
		 */
		private static String checkbook;

		/**
		 * addressBook is the object of AddressBook class which is declared static and
		 * private and also initialized to zero
		 */
		private static Addressbook addressBook = null;

		/**
		 * listOfpersons is the list of persons in a address book and is declared
		 * private and static in order to main single copy of the list.
		 */
		//private static List<Person> listOfPersons = new ArrayList<Person>();

		/**
		 * Function to get files
		 * 
		 * @return array of files
		 */
		private File[] getFiles() {
			return new File(System.getProperty("user.dir")).listFiles();
		}

		/**
		 * Function to create an address book that is in the form of a file with .json
		 * extension
		 * 
		 * @throws IOException
		 */
		public void createBook() throws IOException 
		{
			System.out.println("Enter name of address book");
			String book = sc.next();
		
			File file = new File(book + ".json");
			
			if ( file.createNewFile()) 
			{
				System.out.println("File is created");
			} 
			else 
			{
				System.out.println("File of that name already exists");
			}
		}

		/**
		 * Function to open the address book that we enter
		 * 
		 * @throws IOException
		 */
		public void openBook() throws IOException
		{
			System.out.println("Files available are:");
			
			File[] arrayOfFiles = getFiles();
			
			for (File file : arrayOfFiles) 
			{
				if (file.getName().endsWith(".json"))
					
					System.out.println(file.getName());
			}
			
			System.out.println("Choose the address book");
			checkbook = sc.next();
			
			for (File file : arrayOfFiles) 
			{
				String filename = file.getName();
				
				if (checkbook.equals(filename))
				{
					FileReader fr = new FileReader(filename);
					BufferedReader br = new BufferedReader(fr);
					
					String jsonString = "", line = "";
					while ((line = br.readLine()) != null) 
					{
						jsonString += line;
					}
					br.close();
					//return str;
					
					if (file.length() > 0) 
					{
						System.out.println("Address book is not empty");
						System.out.println(jsonString);
						
						//String string = OopsUtility.convertJsonToJava(jsonString, AddressBook.class);  
						Person p = OopsUtility.convertJsonToJava(jsonString,Person.class);

						// Function call to perform various operations on the opened address book
						addressBook("filename");
					} 
					else 
					{
						System.out.println("Address Book is empty");
						System.out.println("Add new data onto the Address Book");
						addressBook("filename");
					}
				}
			}
		}

		/**
		 * Function to write the list of persons on the address book that is opened
		 */
		public void saveBook() 
		{
			System.out.println("Saving " + checkbook + " address book");
			
			File[] arrayOfFiles = getFiles();
			
			for (File file : arrayOfFiles)
			{
				String filename = file.getName();
		
				if (checkbook.equals(filename)) 
				{
					System.out.println(checkbook+"3333333333");
					System.out.println(filename+"3333333333");
					
					try 
					{
						List<Person> list=addressBook.convert();
						
						//System.out.println(listOfPersons.toString());
						
						String s = OopsUtility.convertJavaToJson(list);
						System.out.println(s);
						
						//Person s= OopsUtility.convertJsonToJava(json,Person.class);			//writeFile(json, filename);
						OopsUtility.filewrite(s,filename);
						
						System.out.println("Address book details saved");
					} 
					catch (Exception e) 
					{
						e.printStackTrace();
						System.out.println("Cannot write to file");
					}
				}
			}
		}
		/**
		 * Function to save the book with different path, name or extension
		 * 
		 * @throws IOException
		 */
		public void saveAsBook() throws IOException
		{
			System.out.println("Files available are:");
			File[] arrayOfFiles = getFiles();
			for (File file : arrayOfFiles)
			{
				if (file.getName().endsWith(".json"))
					System.out.println(file.getName());
			}
			
			System.out.println("Choose the address book you want to save as with extention");
			String ch_book1 =sc.next();
			File file = new File(ch_book1);
			if (file.createNewFile()) {
				System.out.println("File is created");
				String json = OopsUtility.convertJavaToJson(listOfPersons);

				OopsUtility.convertJsonToJava(json, Person.class);
				
				System.out.println("Address book details saved");
			} else {
				System.out.println("File of that name already exists");
			}
		}

		/**
		 * Function to close the address book
		 */
		public void close()
		{
			System.out.println("Would you like to save the changes? Y / N");
			String answer = sc.next();
			if (answer.equalsIgnoreCase("Y") )
			{
				saveBook();
			}
			addressBook = null;
		}

		/**
		 * Function that performs various operations on the opened address book
		 * 
		 * @throws IOException
		 */
		public void addressBook(String filename) throws IOException 
		{
			addressBook = new Addressbook();

			do {
				System.out.println("Enter choice");
				System.out.println("1:Add Person \n 2:Edit Person \n 3:Display Persons \n 4:Delete Person \n 5:Sort \n 6:Go Back to main ");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:

							// Function call to add a person
					        addressBook.addPerson();
							break;
				case 2:

							// Function call to edit the person details
							addressBook.editPerson();
							break;
				case 3:

					// Function call to display the list of persons and their details
					// of a particular address book
					addressBook.display();

					break;
				case 4:

					// Function call to delete the person specified
					addressBook.deletePerson();
					break;
					
				case 5:

					// Function call to sort the list of persons in multiple ways
					sort();
					break;
					
				case 6:
					
					// Function call to the main method
					AddressBookApplication.main(null);
					
				default:
					System.out.println("Invalid choice");
					break;
				}
			} while (addressBook != null);
		}

		/**
		 * Function to sort the list of persons of the opened book by their last name
		 * and by their address zipcode
		 */
		public void sort() 
		{
			System.out.println("Enter your choice");
			System.out.println("1:Sort by Last Name  2:Sort by Zip Code");
		
			int ch = sc.nextInt();
			
			switch (ch)
			{
			case 1:
				System.out.println("Sorting by last name");

				// Function call to sort the list of persons by their last name
				addressBook.sortByLastName();

				System.out.println("Your list is sorted");
				break;
			case 2:
				System.out.println("Sorting by zip code");

				// function call to sort the list of persons by their address zip code
				addressBook.sortByZipCode();

				System.out.println("Your list is sorted");
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	
}
