package lib;

public class GeneratedOrderLine {
	
	private int id;
	private int quantity;
	private int shopOrderId;

	public GeneratedOrderLine(int id, int quantity, int shopOrderId) {
		this.id = id;
		this.quantity = quantity;
		this.shopOrderId = shopOrderId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getShopOrderId() {
		return shopOrderId;
	}

	public void setShopOrderId(int shopOrderId) {
		this.shopOrderId = shopOrderId;
	}

	@Override
	public String toString() {
		return "Order [shopOrderId=" + shopOrderId +", id=" + id + ", quantity=" + quantity + "]";
	}	
}