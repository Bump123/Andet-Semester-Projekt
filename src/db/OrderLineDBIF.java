package db;

import model.OrderLine;

public interface OrderLineDBIF {
void saveOrderLine(int i,OrderLine ol) throws DataAccessException;

}
