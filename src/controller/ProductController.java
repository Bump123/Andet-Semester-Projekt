package controller;

import db.ProductDBIF;
import model.Product;

public class ProductController {
<<<<<<< HEAD
		private ProductDBIF pDBIF; 

		Product findProduct (int productid) {
			pDBIF.findProduct();
	}
=======
private ProductDBIF pDBIF;

public void findProduct (int productid) {
	pDBIF.findProduct(productid);
}
>>>>>>> 0eced6dfe3b104f0f60669b20ba7061d17d035e6
}
