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
	private ProductController pCtrl = new ProductController();

	public OrderController() throws DataAccessException {
		pCtrl = new ProductController();
		orderDBIF = new OrderDB();
	}

	public String recieveOrder(int i) {
		o = new Order(i);
		o.setShopOrderId(i); 
		o.setDeliveryinfo("Vejen 45");;
		return o.toString();
	}

	public void recieveOrderLine(int productNumber, int quantity) throws SQLException, DataAccessException {
		Product p = pCtrl.findReserveStock(productNumber, quantity);
		if (p != null) {
			this.o.addOrderLine(p, quantity); 
			o.setQuantity(quantity); 
			o.setType(p.getName());
		} else {

			System.out.println("Ordre kan kun blive delvist udf?rt " + o.getShopOrderId());
		}

	}

	public void completeOrder() throws DataAccessException {
		orderDBIF.saveOrder(o);
	} 

}
