package gui;

import java.io.IOException;
import java.sql.SQLException;

import controller.OrderController;
import controller.ProductController;
import db.DataAccessException;
import db.ProductDB;
import library.FileReader;
import library.OrderGenerator;
import model.Order;

public class WebshopConnection {

	public static void main(String[] args) throws SQLException, DataAccessException, IOException {
		OrderController orderCtrl = new OrderController();
		OrderGenerator ogen = new OrderGenerator();
		FileReader f = new FileReader();
		
		ogen.createOrderTxt();
		f.readFile();
		
		for(int i = 0; i < f.orders.size(); i++) {
			orderCtrl.recieveOrder(f.orders.get(i).getShopOrderId());
			orderCtrl.recieveOrderLine(f.orders.get(i).getId(), f.orders.get(i).getQuantity()); 
			orderCtrl.completeOrder();
		}
		System.out.println(f.orders.toString());

		
		
	}

}
