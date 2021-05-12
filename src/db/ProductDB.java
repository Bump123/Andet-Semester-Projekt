package db;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDB implements ProductDBIF{

	@Override
	public Product findProduct(int Productid) {
		
		return null;
	} 
	public static void updateStock(int quantity,int productnumber) {
	     String QupdateStock = "UPDATE product SET stock = stock -=?" + "where productnumber = ?"; 
	     try {
	        PreparedStatement ps =  DBConnection.getInstance().getConnection().prepareStatement(QupdateStock); 
	        ps.setInt(quantity, 0);
	        ps.setInt(productnumber, 0); 
	        ps.executeUpdate();
	    } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }

}
}
