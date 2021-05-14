package controller;

import model.Order;
import model.OrderLine;
import model.Product;
import java.sql.SQLException;

import controller.ProductController;
import db.DataAccessException;
import db.OrderDBIF;

public class OrderController {
	private OrderDBIF oDBIF;

	ProductController pCtrl = new ProductController();
	Order o = new Order();
	
	public OrderController() {
		pCtrl = new ProductController();
	}
	
	public String recieveOrder(int i) {
		Order o = new Order(i);
		o.setShopOrderId(i);
		return o.toString();
	}
	

	public void recieveOrderLine(int productNumber, int quantity) throws SQLException, DataAccessException {
		Product p = pCtrl.findReserveStock(productNumber, quantity);
		OrderLine ol = new OrderLine(p, quantity);
		o.addOrderLine(productNumber, quantity);
		oDBIF.SaveOrder(o);
	}
	
	


}
