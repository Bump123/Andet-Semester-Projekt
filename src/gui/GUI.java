package gui;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.plaf.basic.BasicBorders;

import library.*;
import controller.OrderController;
import controller.ProductController;
import db.DataAccessException;
import db.ProductDB;
import model.Order;

public class GUI {

	public static void main(String[] args) throws SQLException, DataAccessException, IOException {
		OrderController orderCtrl = new OrderController();
		OrderGenerator ogen = new OrderGenerator();
		FileReader fr = new FileReader();
		GeneratedOrderLine gol = new GeneratedOrderLine();
		ArrayList<GeneratedOrderLine> completedOrders = new ArrayList<>();
		
		ogen.createOrderTxt();
		fr.readFile();

		orderCtrl.recieveOrder(gol.getShopOrderId());
		orderCtrl.recieveOrderLine(gol.getId(), gol.getQuantity()); 
		orderCtrl.completeOrder();
		System.out.println(fr.orders.toString());

	}

}
