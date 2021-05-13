package gui;

import java.sql.SQLException;

import controller.OrderController;
import db.DataAccessException;
import db.ProductDB;
import model.Order;

public class GUI {

	public static void main(String[] args) throws SQLException, DataAccessException {
		OrderController orderCtrl = new OrderController();
		//GeneratedOrder go = new GeneratedOrder();
		
		
		System.out.println(orderCtrl.recieveOrder(6));
		orderCtrl.recieveOrderLine(1, 2);
		
//		int quantity = 10; 
//		int productnumber = 4;		
//		ProductDB.updateStock(quantity, productnumber);
	}

}
