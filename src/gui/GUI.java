package gui;

import controller.InventoryController;
import db.ProductDB;

public class GUI {

	public static void main(String[] args) {
		InventoryController invctrl = new InventoryController();
		GeneratedOrder go = new GeneratedOrder();
		
		invctrl.recieveOrder(go);
		int quantity = 10; 
		int productnumber = 4;		
		ProductDB.updateStock(quantity, productnumber);
	}

}
