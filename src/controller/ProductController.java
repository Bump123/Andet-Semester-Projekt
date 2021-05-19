package controller;

import db.ProductDBIF;
import db.DataAccessException;
import java.sql.SQLException;
import db.DBConnection;
import model.Product;
import db.ProductDB;

public class ProductController {
	private ProductDBIF pDBIF; 
	private Product p;
	
	
	public ProductController() throws DataAccessException {
		pDBIF = new ProductDB();
		
	}
	
	
	public Product findReserveStock(int productNumber, int quantity) throws SQLException, DataAccessException  {

		try {
			DBConnection.getInstance().startTransaction();
			pDBIF.findReserveStock(productNumber, quantity);
			getQuantity();
			setQuantity();
			DBConnection.getInstance().commitTransaction();
		} catch (SQLException e) {
			DBConnection.getInstance().rollbackTransaction();
		}
		return p;

	}

	public Product findByProductNumber(int productNumber, int quantity) throws DataAccessException {
		return pDBIF.findReserveStock(productNumber, quantity);
	}
	
	
	public int getQuantity() {
		int quantity = p.getQuantity();
		System.out.println(p.getQuantity());
		return quantity;
	}
	
	public void setQuantity() {
		int stock = p.getStock();
		int qty = p.getQuantity();
		p.setStock(stock - qty);
		System.out.println(p.getStock());
	}
	
	
	
	
}
