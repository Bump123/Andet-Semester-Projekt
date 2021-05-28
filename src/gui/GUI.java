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
		//ProductController productCtrl = new ProductController();
		//GeneratedOrder go = new GeneratedOrder();
		
		
		System.out.println(orderCtrl.recieveOrder(6));
		orderCtrl.recieveOrderLine(2, 1); 
		orderCtrl.completeOrder();
		
	}

}
