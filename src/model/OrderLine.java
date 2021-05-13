package model;

public class OrderLine {
	private int amountOfProducts;
	private Product product;
	
	public OrderLine(int amountOfProducts, int totalPriceOfProducts, Product p) {
		super();
		this.amountOfProducts = amountOfProducts;
		this.product = p;
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
	
	
	
}
