package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderId;
	private int quantity;
	private int productId;
	private List<OrderLine> orderLines;
	private int shopOrderId;
	
	
	
	public Order(int orderId, int quantity, boolean orderState, String deliveryInfo, int productId) {
		super();
		this.orderId = orderId;
		this.quantity = quantity;
		this.productId = productId;
		this.orderLines = new ArrayList<>();
	}
	
	public Order(int shopOrderId) {
		this.shopOrderId = shopOrderId;
	}

	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public int getShopOrderId() {
		return shopOrderId;
	}

	public void setShopOrderId(int shopOrderId) {
		this.shopOrderId = shopOrderId;
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

	public void addOrderLine(Product p, int qty) {
		OrderLine ol = new OrderLine(p, qty);
		this.orderLines.add(ol);
	}
	
	@Override
	public String toString() {
		return "Order [shopOrderId=" + shopOrderId + "]";
	}
	
	
	
	
	
}
