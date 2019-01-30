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
			ObjectMapper objectMapper = new ObjectMapper();
			File file=new File("/home/bridgelabz/Desktop/Aayush/InventoryFactory.json");
			InventoryFactory inventoryFactory=objectMapper.readValue(file, InventoryFactory.class);
			Product product=new Product();
			System.out.println("Enter the name of the product ");
			String inputProductName=Util.getString();
			product.setProductName(inputProductName);
			ProductProperty productProperty= input();
			List<ProductProperty> properties=new ArrayList<ProductProperty>();
			properties.add(productProperty);
			product.setProperties(properties);
			List<Product> products=inventoryFactory.getInventory();
			products.add(product);
			int count=0;
			System.out.println();
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
			inventoryFactory.setInventory(products);
			objectMapper.writeValue(file, inventoryFactory);
			//create new object using object mapper , it has a function called "writerWithDefaultPrettyPrinter()"
			//which will indent your json file in the console
			ObjectMapper objectMapper2 =new ObjectMapper();
			System.out.println(objectMapper2.writerWithDefaultPrettyPrinter().writeValueAsString(inventoryFactory));
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("program CRASHED..!!! please run again");
		}
	}
	public static ProductProperty input()
	{
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
