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
	private Product p;

	
	public OrderController() throws DataAccessException {
		pCtrl = new ProductController();
		orderDBIF = new OrderDB();
	}
	
	public String recieveOrder(int i) {
		o = new Order(i);
		o.setShopOrderId(i);
		return o.toString();
	}
	

	public void recieveOrderLine(int productNumber, int quantity) throws SQLException, DataAccessException {
	    p = pCtrl.findReserveStock(productNumber, quantity);
	    this.o.addOrderLine(p, quantity);
	    
		
		
	}
	
	public void completeOrder() throws DataAccessException {
	
		orderDBIF.saveOrder(o);
		
	}


}
