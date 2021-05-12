package controller;

import db.ProductDBIF;
import model.Product;

public class ProductController {
	private ProductDBIF pDBIF; 

	Product findProduct (int productid) {
		pDBIF.findProduct();
	}

	public void findProduct (int productid) {
		pDBIF.findProduct(productid);
	}
}
