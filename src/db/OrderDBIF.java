package db;

import model.Order;

public interface OrderDBIF {
	Order saveOrder(Order order) throws DataAccessException;
}
