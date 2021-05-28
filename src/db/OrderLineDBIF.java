package db;

import model.OrderLine;

public interface OrderLineDBIF {
	void saveOrderLine(int oid,OrderLine ol) throws DataAccessException;
}
