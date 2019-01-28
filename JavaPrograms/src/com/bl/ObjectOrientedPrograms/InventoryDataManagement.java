package com.bl.ObjectOrientedPrograms;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.bl.utility.Util;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InventoryDataManagement {

	/**
	 * Description :to a JSON file with properties name, weight, price per kg.
	 * Store the Information in the Json file
	 * Use Object Mapper to convert java object to Json and Json back to java object
 	 * I/P -> read in JSON File
 	 * O/P -> Create the JSON from Inventory Object and output the JSON String
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException  {
		Scanner sc = new Scanner(System.in);
		//to map json to pojo obj and vice-versa
		ObjectMapper objectMapper=new ObjectMapper();
		File file=new File("/home/bridgelabz/Desktop/jsonFile.json");
		ProductList productList=objectMapper.readValue(file, ProductList.class);
		Product product=new Product();

		//Setting the product name
		System.out.println("Enter the name of the product ");
		String inputProductName=sc.next();
		product.setProductName(inputProductName);
		//To Set the product properties 
		ProductProperty productProperty= input();
		List<ProductProperty> properties=new ArrayList<ProductProperty>();
		properties.add(productProperty);
		product.setProperties(properties);
		List<Product> products=productList.getInventory();
		products.add(product);
		productList.setInventory(products);
		objectMapper.writeValue(file, productList);
		String s= objectMapper.writeValueAsString(productList);
		System.out.println(s);
		sc.close();
	}
	//taking input
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