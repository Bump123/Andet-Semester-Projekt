package model;

public class Order {
	private int orderId;
	private int quantity;
	private boolean orderstate;
	private String deliveryInfo;
	private int productId;
	
	public Order(int orderId, int quantity, boolean orderstate, String deliveryInfo, int productId) {
		super();
		this.orderId = orderId;
		this.quantity = quantity;
		this.orderstate = orderstate;
		this.deliveryInfo = deliveryInfo;
		this.productId = productId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isOrderstate() {
		return orderstate;
	}

	public void setOrderstate(boolean orderstate) {
		this.orderstate = orderstate;
	}

	public String getDeliveryInfo() {
		return deliveryInfo;
	}

	public void setDeliveryInfo(String deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	
	
	
	
}
