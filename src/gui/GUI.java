package gui;

import java.sql.SQLException;

import controller.OrderController;
import controller.ProductController;
import db.DataAccessException;
import db.ProductDB;
import model.Order;

public class GUI {

	public static void main(String[] args) throws SQLException, DataAccessException {
		OrderController orderCtrl = new OrderController();
		orderCtrl.recieveOrder(6);
		orderCtrl.recieveOrderLine(1, 1); 
		orderCtrl.completeOrder();
		
	}

}
