package db;

import java.sql.PreparedStatement;
import java.sql.SQLException;
//import model.OrderLineDB;
import model.Order;

public class OrderDB implements OrderDBIF {
	private static final String INSERT_Q ="insert into orders(deliveryinfo, type, quantity, staffid_packager, staffid_plucker) values (?, ?, ?, ?, ?)";
	
	private PreparedStatement insert;
	private OrderLineDB olDB;
	
	public OrderDB() throws DataAccessException{
		try {
		//olDB = new OrderLineDB();
		insert = DBConnection.getInstance().getConnection().prepareStatement(INSERT_Q, PreparedStatement.RETURN_GENERATED_KEYS);
		} catch(SQLException e) {
			throw new DataAccessException("could not prepare statement", e);
		}
		
	}
	
	public Order saveOrder(Order order) throws DataAccessException {
		 try {
			 int oid = DBConnection.getInstance().executeInsertWithIdentity(insert);
			 order.setOrderId(oid);
			 insert.setString(2, "deliveryinfo");
			 insert.setString(3, "type");
			 insert.setInt(4, order.getQuantity());
			 insert.setInt(5, 1);
			 insert.setInt(6, 2);

		 } catch(SQLException e) {
			 throw new DataAccessException("could not insert", e);
		 }
		 return null;
	}

}
