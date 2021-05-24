package model;

public class Accessory extends Product {

	
	private String accessoryMaterial;
	private String accessoryColor;
	private String accessoryStyle; 
	
	
	

	public Accessory(int productNumber, String name, int price, String description, String size, String accessoryMaterial, String accessoryColor, String accessoryStyle, int stock, int quantity) {
		super(productNumber, name, price, description, size, stock, quantity ); 
		
		this.accessoryMaterial = accessoryMaterial;
		this.accessoryColor = accessoryColor;
		this.accessoryStyle = accessoryStyle;
	}

	public String getAccessoryMaterial() {
		return accessoryMaterial;
	}

	public void setAccessoryMaterial(String accessoryMaterial) {
		this.accessoryMaterial = accessoryMaterial;
	}

	public String getAccessoryColor() {
		return accessoryColor;
	}

	public void setAccessoryColor(String accessoryColor) {
		this.accessoryColor = accessoryColor;
	}

	public String getAccessoryStyle() {
		return accessoryStyle;
	}

	public void setAccessoryStyle(String accessoryStyle) {
		this.accessoryStyle = accessoryStyle;
	}

	
}
