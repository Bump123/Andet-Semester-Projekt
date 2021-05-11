package controller;

import db.ProductDBIF;

public class ProductController {
private ProductDBIF pDBIF = new ProductDBIF(); 

public void findProduct (int productid) {
	pDBIF.findProduct();
}
}
