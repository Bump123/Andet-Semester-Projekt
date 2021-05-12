package gui;

<<<<<<< HEAD
import controller.InventoryController;
=======
import db.ProductDB;
>>>>>>> 0eced6dfe3b104f0f60669b20ba7061d17d035e6

public class GUI {

	public static void main(String[] args) {
<<<<<<< HEAD
		InventoryController invctrl = new InventoryController();
		GeneratedOrder go = new GeneratedOrder();
		
		invctrl.recieveOrder(go);
=======
		int quantity = 10; 
		int productnumber = 4;		
ProductDB.updateStock(quantity, productnumber);
>>>>>>> 0eced6dfe3b104f0f60669b20ba7061d17d035e6
	}

}
