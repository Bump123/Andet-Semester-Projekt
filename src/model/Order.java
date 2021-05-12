package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderId;
	private int quantity;
	private boolean orderState;
	private String deliveryInfo;
	private int productId;
	private List<OrderLine> orderLines;
	
	public Order(int orderId, int quantity, boolean orderState, String deliveryInfo, int productId) {
		super();
		this.orderId = orderId;
		this.quantity = quantity;
		this.orderState = orderState;
		this.deliveryInfo = deliveryInfo;
		this.productId = productId;
		this.orderLines = new ArrayList<>();
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

	public boolean isOrderState() {
		return orderState;
	}

	public void setOrderState(boolean orderstate) {
		this.orderState = orderstate;
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

	public void addOrderLine(int productNumber, int quantity) {
		
	}

	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}
	
	
	
	
	
}
