package db;

import model.Product;

public interface ProductDBIF {


	Product findReserveStock(int productNumber, int quantity) throws DataAccessException; 
	
}
