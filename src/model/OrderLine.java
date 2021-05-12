package model;

public class OrderLine {
	private int amountOfProducts;
	private int totalPriceOfProducts;

	public OrderLine(int amountOfProducts, int totalPriceOfProducts) {
		super();
		this.amountOfProducts = amountOfProducts;
		this.totalPriceOfProducts = totalPriceOfProducts;
	}

	public int getAmountOfProducts() {
		return amountOfProducts;
	}
	
	public void setAmountOfProducts(int amountOfProducts) {
		this.amountOfProducts = amountOfProducts;
	}
	
	public int getTotalPriceOfProducts() {
		return totalPriceOfProducts;
	}
	
	public void setTotalPriceOfProducts(int totalPriceOfProducts) {
		this.totalPriceOfProducts = totalPriceOfProducts;
	}

	@Override
	public String toString() {
		return "OrderLine [amountOfProducts=" + amountOfProducts + ", totalPriceOfProducts=" + totalPriceOfProducts
				+ "]";
	}
	
	
	
}
