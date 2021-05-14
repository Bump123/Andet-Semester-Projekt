package db;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Order;

public class OrderDB implements OrderDBIF {
private static final String SAVE_ORDERQ = "insert into [order] (orderid,quantity,staffid_packager,staffid_plucked) values(=?,=?,=?,=?)"; 
PreparedStatement ps;
	 
	public OrderDB() {
	try {
		ps = DBConnection.getInstance().getConnection().prepareStatement(SAVE_ORDERQ);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
	@Override
	public void SaveOrder(Order o) throws DataAccessException {
	
	try {
		ps.setInt(1, o.getOrderId());
		ps.setInt(2, o.getQuantity()); 
		ps.setInt(3, 300);
		ps.setInt(4, 100);
	} catch (SQLException e) {
		throw new DataAccessException("could not insert order into database", e);
	}
	
		
	}

}
