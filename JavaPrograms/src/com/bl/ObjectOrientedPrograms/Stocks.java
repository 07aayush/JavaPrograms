package com.bl.ObjectOrientedPrograms;


public class Stocks {
	private String stockName;
	private String shareName;
	private int numberOfShares;
	private double priceOfStock;
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public String getShareName() {
		return shareName;
	}
	public void setShareName(String shareName) {
		this.shareName = shareName;
	}
	public int getNumberOfShares() {
		return numberOfShares;
	}
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	public double getPriceOfStock() {
		return priceOfStock;
	}
	public void setPriceOfStock(double priceOfStock) {
		this.priceOfStock = priceOfStock;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfShares;
		long temp;
		temp = Double.doubleToLongBits(priceOfStock);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((shareName == null) ? 0 : shareName.hashCode());
		result = prime * result + ((stockName == null) ? 0 : stockName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stocks other = (Stocks) obj;
		if (numberOfShares != other.numberOfShares)
			return false;
		if (Double.doubleToLongBits(priceOfStock) != Double.doubleToLongBits(other.priceOfStock))
			return false;
		if (shareName == null) {
			if (other.shareName != null)
				return false;
		} else if (!shareName.equals(other.shareName))
			return false;
		if (stockName == null) {
			if (other.stockName != null)
				return false;
		} else if (!stockName.equals(other.stockName))
			return false;
		return true;
	}
	public Stocks(String stockName, String shareName, int numberOfShares, double priceOfStock) {
		super();
		this.stockName = stockName;
		this.shareName = shareName;
		this.numberOfShares = numberOfShares;
		this.priceOfStock = priceOfStock;
	}
	public Stocks() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Stocks [stockName=" + stockName + ", shareName=" + shareName + ", numberOfShares=" + numberOfShares
				+ ", priceOfStock=" + priceOfStock + ", getStockName()=" + getStockName() + ", getShareName()="
				+ getShareName() + ", getNumberOfShares()=" + getNumberOfShares() + ", getPriceOfStock()="
				+ getPriceOfStock() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}

	/**
	 * gives the total stock value of a firm
	 * @return total stock value
	 */
	public double getTotalStockValue() {
		return getNumberOfShares() * getPriceOfStock();
	}

}
