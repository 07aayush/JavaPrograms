package com.bl.DesignPatterns;

public class ShoppingCartClient {

	public static void main(String[] args)
	{
		ItemElement[] items = new ItemElement[]{new Book(60, "1234"),new Book(25, "5678"),
				new Fruit(10, 2, "guava"), new Fruit(5, 5, "Apple")};

		int total = calculatePrice(items);
		System.out.println("Total Cost = "+total);
	}

	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum=0;
		for(ItemElement item : items){
			sum = sum + item.accept(visitor);
		}
		return sum;
	}

}
