package com.bl.ObjectOrientedPrograms;

import java.util.List;

public class InventoryFactory {
private List<Product> inventory;

		public List<Product> getInventory() {
			return inventory;
		}

		public void setInventory(List<Product> inventory) {
			this.inventory = inventory;
		}

}
