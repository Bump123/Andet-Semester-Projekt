package db;

import model.Product;

public interface ProductDBIF {


	
	Product findByProductNumber(int productNumber)throws DataAccessException;

	void updateStock(Product p) throws DataAccessException;
}

	
