package gui;

import db.ProductDB;

public class GUI {

	public static void main(String[] args) {
		int quantity = 10; 
		int productnumber = 4;		
ProductDB.updateStock(quantity, productnumber);
	}

}
