package db;

import model.Order;

public interface OrderDBIF {

	void SaveOrder(Order o) throws DataAccessException;

}
