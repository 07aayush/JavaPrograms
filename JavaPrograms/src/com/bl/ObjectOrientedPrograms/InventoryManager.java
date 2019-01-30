package com.bl.ObjectOrientedPrograms;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import com.bl.utility.Util;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InventoryManager 
{
	/**
	 * Description:To extend the  program and to create "InventoryManager" to manage the
	 * Inventory. The "InventoryManager" will use "InventoryFactory" to create Inventory
	 * Object from JSON. The "InventoryManager" will call each Inventory Object in its list
	 * to calculate the Inventory Price and then call the Inventory Object to return the
	 * JSON String. The main program will be with InventoryManager
	 * I/P : read in JSON File
	 * Logic : Get JSON Object in Java or NSDictionary in iOS. Create Inventory
	 * Object from JSON. Calculate the value for every Inventory.
	 * O/P : Create the JSON from Inventory Object and output the JSON String.
	 * @param args
	 */
	public static void main(String[] args)
	{
		try {
			//to map json to pojo obj and vice-versa
				ObjectMapper objectMapper=new ObjectMapper();
				
				//Reading from a file as json string
				File file=new File("/home/admin1/Desktop/jsonFiles/jsonInventoryFactory.json");
				InventoryFactory inventoryFactory=objectMapper.readValue(file, InventoryFactory.class);
				 List<Product> products=inventoryFactory.getInventory();
				 System.out.println("Enter the name of the product ");
					String inputProductName=Util.getString();
					Product product= products.stream().filter(prd->prd.getProductName().equals(inputProductName)).findFirst().orElse(new Product());
				
				 product.setProductName(inputProductName);
				 List<ProductProperty> properties=new ArrayList<ProductProperty>();
				 
				 properties=product.getProperties();
					//To Set the product properties 
					ProductProperty productProperty= input();
					
					//Adding properties to list 
					// 
					properties.add(productProperty);
					
					//add properties to the product
					 product.setProperties(properties);
					/*
					 * //for mor than one properties to be added for same product
					 * productProperty= input(); properties.add(productProperty);
					 *
					 */
					 //adding every product to list
					//getting product from file as list and saving in product list
					
					 products.add(product);
					 //To print Each Inventory Price
					 int count=0;
						System.out.println(" Inventory Price");
						System.out.println();
						System.out.println("Price of each Inventory : ");
						while(count!=inventoryFactory.getInventory().size()) {
						Product prod=products.get(count);
						for(ProductProperty  produproperty: prod.getProperties())
						{
							System.out.print(produproperty.getName() +" - ");
							double eachinventory =(produproperty.getPrice());
							System.out.println(eachinventory);
						}
						count++;
						}
						
					
					//adding list of products to inventry
					inventoryFactory.setInventory(products);
					
					//Writtting to a file
					objectMapper.writeValue(file, inventoryFactory);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Input Incorrect");
		}

	}
	/*
	 * To take input from user for product properties
	 * @return is class type of productproperty
	 */
	public static ProductProperty input() {
	
		ProductProperty productProperty=new ProductProperty();
		
		System.out.println("Enter the name of product type ");
		String inputPropertyName=Util.getString();
		productProperty.setName(inputPropertyName);
		System.out.println("Enter the Weight ");
		double inputPropertyWeight=Util.getDouble();
		productProperty.setWeight(inputPropertyWeight);
		System.out.println("Enter the Price ");
		double inputPropertyprice=Util.getDouble();
		productProperty.setPrice(inputPropertyprice);
		
		return productProperty;
		
	}
}
