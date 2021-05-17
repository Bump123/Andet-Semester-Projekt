package controller;

import model.Order;
import model.OrderLine;
import model.Product;
import java.sql.SQLException;
import db.OrderDBIF;
import db.ProductDB;
import controller.ProductController;
import db.DataAccessException;
import db.OrderDB;

public class OrderController {
	private OrderDBIF orderDBIF;
	private Order o;
	ProductController pCtrl = new ProductController();


	
	public OrderController() throws DataAccessException {
		pCtrl = new ProductController();
		orderDBIF = new OrderDB();
	}
	
	public String recieveOrder(int i) {
		Order o = new Order(i);
		o.setShopOrderId(i);
		return o.toString();
	}
	

	public void recieveOrderLine(int productNumber, int quantity) throws SQLException, DataAccessException {
		Product p = pCtrl.findReserveStock(productNumber, quantity);
		this.o.addOrderLine(p, quantity);
	}
	
	public Order completeOrder() throws DataAccessException {
	
		orderDBIF.saveOrder(o);
		return o;
	}


}
