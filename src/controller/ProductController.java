package controller;

import db.ProductDBIF;
import db.DataAccessException;
import java.sql.SQLException;
import db.DBConnection;
import model.Product;


public class ProductController {
	private ProductDBIF pDBIF; 
	private DBConnection dbCon;
	private Product p;
	
	

	public Product findReserveStock(int productNumber, int quantity) throws SQLException, DataAccessException  {
		
		try {
			dbCon.startTransaction();
			pDBIF.findReserveStock(productNumber, quantity);
			dbCon.commitTransaction();
		} catch (SQLException e) {
			dbCon.rollbackTransaction();
		}
		return p;

	}

	public Product findByProductNumber(int productNumber, int quantity) throws DataAccessException {
		return pDBIF.findReserveStock(productNumber, quantity);
	}
	
	
	public int getQuantity() {
		int quantity = p.getQuantity();
		return quantity;
	}
	
	public void setQuantity() {
		int stock = p.getStock();
		int qty = p.getQuantity();
		p.setStock(stock - qty);
	}
	
	
	
	
}
