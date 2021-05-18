package db;

import java.sql.PreparedStatement;
import java.sql.SQLException;
//import model.OrderLineDB;
import model.Order;
import model.OrderLine;

public class OrderDB implements OrderDBIF {
	private static final String INSERT_Q ="insert into orders(deliveryinfo, type, quantity, staffid_packager, staffid_plucked) values (?, ?, ?, ?, ?)";
	
	private PreparedStatement insert;
	private OrderLineDB olDB;
	
	public OrderDB() throws DataAccessException{
		try {
		olDB = new OrderLineDB();
		insert = DBConnection.getInstance().getConnection().prepareStatement(INSERT_Q, PreparedStatement.RETURN_GENERATED_KEYS);
		} catch(SQLException e) {
			throw new DataAccessException("could not prepare statement", e);
		}
		
	}
	
	public Order saveOrder(Order order) throws DataAccessException {
		 try {
			 insert.setString(1, "deliveryinfo");
			 insert.setString(2, "type");
			 insert.setInt(3, order.getQuantity());
			 insert.setInt(4, 1);
			 insert.setInt(5, 2);
			 int oid = DBConnection.getInstance().executeInsertWithIdentity(insert);
			 order.setOrderId(oid); 
			 for(OrderLine ol : order.getOrderLines()) {
				 
					olDB.saveOrderLine(oid, ol);
				
			 }
			
			
			
			 

		 } catch(SQLException e) {
			 throw new DataAccessException("could not insert", e);
		 }
		 return null;
	}

}
