package db;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.OrderLine;

public class OrderLineDB {
	private static final String INSERT_Q  = "insert into orderlines (amountofproducts, totalpriceofProducts, orderid) values (?, ?, ?)";
	private PreparedStatement insert;

	public OrderLineDB() throws DataAccessException {
		try {
			insert = DBConnection.getInstance().getConnection().prepareStatement(INSERT_Q, PreparedStatement.RETURN_GENERATED_KEYS);
		} catch (SQLException e) {
			throw new DataAccessException("could not prepare statement", e);
		}
	}

	public void saveOrderLine(int oid, OrderLine ol) throws DataAccessException {
		try {
			insert.setInt(1, ol.getAmountOfProducts());
			insert.setInt(2, ol.getProduct().getProductNumber());
			insert.setInt(3, oid);
			insert.executeUpdate();
		} catch (SQLException e) {
			throw new DataAccessException("can't save", e);
		}
	}
	
	
}
