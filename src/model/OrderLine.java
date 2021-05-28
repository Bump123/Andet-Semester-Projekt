package model;

public class OrderLine {
	private int amountOfProducts;
	private Product product;
	private int totalPriceOfProducts;
	
	public OrderLine(int amountOfProducts, int totalPriceOfProducts, Product p) {
		super();
		this.amountOfProducts = amountOfProducts;
		this.product = p; 
		this.setTotalPriceOfProducts(totalPriceOfProducts * amountOfProducts);
	}

	public OrderLine(Product p, int qty) {
	}

	public int getAmountOfProducts() {
		return amountOfProducts;
	}
	
	public void setAmountOfProducts(int amountOfProducts) {
		this.amountOfProducts = amountOfProducts;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getTotalPriceOfProducts() {
		return totalPriceOfProducts;
	}

	public void setTotalPriceOfProducts(int totalPriceOfProducts) {
		this.totalPriceOfProducts = totalPriceOfProducts;
	}
}
