package controller;

import db.ProductDBIF;
import db.DataAccessException;
import java.sql.SQLException;
import db.DBConnection;
import model.Product;
import db.ProductDB;

public class ProductController {
	private ProductDBIF pDBIF;
	
	public ProductController() throws DataAccessException {
		pDBIF = new ProductDB();

	}

	public Product findReserveStock(int productNumber, int quantity) throws SQLException, DataAccessException {
		Product p = null;
		try {
			DBConnection.getInstance().startTransaction();
			p = pDBIF.findByProductNumber(productNumber);
			
			int qty = p.getStock() - quantity;
			if (qty > 0) {
				p.setQuantity(qty);
			}else if (qty == 0) {
				System.out.println("please restock "+ p.getProductNumber() + "it's selling too well");
				p.setQuantity(qty);
				pDBIF.updateStock(p);
				}
			 else {
				throw new RuntimeException("can't sell stock is minus");
			} 
			
			pDBIF.updateStock(p);

			DBConnection.getInstance().commitTransaction();

		} catch (SQLException e) {
			DBConnection.getInstance().rollbackTransaction();
			p = null;
		}
		return p;

	} 
//	public int getWuantity() {
//		int i =p.getQuantity(); 
//		return i;
//	}

}
