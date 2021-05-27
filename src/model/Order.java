package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderId;
	private int quantity;
	private int productNumber;
	private ArrayList<OrderLine> orderLines = new ArrayList<OrderLine>();
	private int shopOrderId;
	private Product product;
	private String deliveryinfo;
	private String type;
	
	
	public Order(int orderId, int quantity, String deliveryInfo, int productNumber, String type,String deliveryinfo) {
		super();
		this.orderId = orderId;
		this.quantity = quantity;
		this.productNumber = productNumber;
		this.orderLines = new ArrayList<>(); 
		this.type = type;  
		this.deliveryinfo = deliveryinfo;
	}
	
	public Order(int shopOrderId) {
		this.shopOrderId = shopOrderId;
	}
	
//	public Order(int orderId, String deliveryinfo, int productNumber, String type, ) {
//		this(0, orderId, deliveryinfo, productNumber, type);
//	}


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
	

	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = product.getProductNumber();
	}


	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(ArrayList<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}

	public void addOrderLine(Product p, int qty) {
		OrderLine ol = new OrderLine(qty, p.getPrice() ,p);
		this.orderLines.add(ol);
	}
	
	@Override
	public String toString() {
		return "Order [shopOrderId=" + shopOrderId + "]";
	}

	public void setType(String type) {
		this.type = type;
		
	}

	public String getType() {
		
		return type;
	}

	public String getDeliveryInfo() {
		return deliveryinfo;
	}
	
	
	public void setDeliveryinfo(String deliveryinfo) {
		this.deliveryinfo = deliveryinfo;
	}
	
	
}
