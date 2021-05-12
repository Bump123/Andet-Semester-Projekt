package gui;

import db.ProductDB;

public class GUI {

	public static void main(String[] args) {
		int quantity = 1; 
		int productnumber = 1;		
ProductDB.updateStock(quantity, productnumber);
	}

}
