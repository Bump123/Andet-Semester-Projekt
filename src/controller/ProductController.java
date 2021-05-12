package controller;

import db.ProductDBIF;

public class ProductController {
private ProductDBIF pDBIF;

public void findProduct (int productid) {
	pDBIF.findProduct(productid);
}
}
