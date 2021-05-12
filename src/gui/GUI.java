package gui;

import controller.InventoryController;

public class GUI {

	public static void main(String[] args) {
		InventoryController invctrl = new InventoryController();
		GeneratedOrder go = new GeneratedOrder();
		
		invctrl.recieveOrder(go);
	}

}
