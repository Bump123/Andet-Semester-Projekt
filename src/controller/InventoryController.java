package controller;
import model.Order;
import model.Product;

public class InventoryController {
	private Order o;
	private OrderController oCtrl;
	private ProductController pCtrl;
	
	public InventoryController() { 
	OrderController oCtrl = new OrderController();
	ProductController pCtrl = new ProductController();
	}
	
	
	public void recieveOrder(Order o) {
		o = new Order(0, 0, false, null, 0);

	}

	//save orderline to order object
	public void createOrder(int productNumber, int quantity) {
		Product p = pCtrl.findProduct(productNumber);
		this.o.addOrderLine(productNumber, quantity);
	}


}
