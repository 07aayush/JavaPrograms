package com.bl.ObjectOrientedPrograms;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.bl.utility.Util;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InventoryDataManagement {

	/**
	 * Description :To a JSON file with properties name, weight, price per kg.
	 * Store the Information in the Json file
	 * Use Object Mapper to convert java object to Json and Json back to java object
	 * I/P -> read in JSON File
	 * O/P -> Create the JSON from Inventory Object and output the JSON String
	 * Here we are restricting the data in json to particularly store the details
	 * of just rice,pulses and wheat.
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException  {
		try {
			ObjectMapper objectMapper=new ObjectMapper();
			File file=new File("/home/bridgelabz/Desktop/Aayush/jsonFile.json");
			ProductList productList=objectMapper.readValue(file, ProductList.class);

			Product product=new Product();

			//Setting the product name
			System.out.println("Enter the product name ");
			String inputProductName=Util.getString();
			inputProductName=inputProductName.toLowerCase();
			if(inputProductName.equals("rice")||inputProductName.equals("pulses")||inputProductName.equals("wheats"))
			{
				product.setProductName(inputProductName);
				ProductProperty productProperty= input();
				List<ProductProperty> properties=new ArrayList<ProductProperty>();
				properties.add(productProperty);
				product.setProperties(properties);
				List<Product> products=productList.getInventory();
				products.add(product);
				productList.setInventory(products);
				objectMapper.writeValue(file, productList);
				//create new object using object mapper , it has a function called "writerWithDefaultPrettyPrinter()"
				//which will indent your json file in the console
				ObjectMapper objectMapper2 =new ObjectMapper();
				System.out.println(objectMapper2.writerWithDefaultPrettyPrinter().writeValueAsString(productList));
			}
			else 
			{
				System.out.println("InCorrect input please run again...!");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Input Incorrect ");
		}


	}
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
		System.out.println();
		return productProperty;
	}
}
