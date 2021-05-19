package model;

public class Product {
	private int productNumber;
	private String name;
	private int price;
	private String description;
	private String size;
	private int quantity;
	private int stock;
	
	public Product(int productNumber, String name, int price, String description, String size, int quantity, int stock) {
		super();
		this.productNumber = productNumber;
		this.name = name;
		this.price = price;
		this.description = description;
		this.size = size;
		this.quantity = quantity;
		this.stock = stock;
	}

	public Product(int productNumber) {
		this.productNumber = productNumber;
	}
	
	public Product(int productNumber, int quantity) {
		this.productNumber = productNumber;
		this.quantity = 5;
	}

	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}


}
