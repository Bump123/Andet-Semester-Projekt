package model;

public class Clothing extends Product {


	private String clothingMaterial;
	private String clothingColor;
	private String clothingStyle;

	public Clothing(int productNumber, String name, int price, String description, String size, String clothingColor, String clothingMaterial, String clothingStyle, int stock, int quantity) {
		super(productNumber, name, price, description, size, stock, quantity);
		this.clothingColor = clothingColor;
		this.clothingMaterial = clothingMaterial;
		this.clothingStyle = clothingStyle;
		
	}
	


	public String getClothingMaterial() {
		return clothingMaterial;
	}

	public void setClothingMaterial(String clothingMaterial) {
		this.clothingMaterial = clothingMaterial;
	}

	public String getClothingColor() {
		return clothingColor;
	}

	public void setClothingColor(String clothingColor) {
		this.clothingColor = clothingColor;
	}

	public String getClothingStyle() {
		return clothingStyle;
	}

	public void setClothingStyle(String clothingStyle) {
		this.clothingStyle = clothingStyle;
	}




	
}
