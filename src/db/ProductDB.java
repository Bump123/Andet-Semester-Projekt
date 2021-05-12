package db;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Product;

public class ProductDB implements ProductDBIF{

	@Override
	public Product findProduct(int Productid) {
		
		return null;
	} 
	public static void updateStock(int quantity,int productnumber) {
	     String QupdateStock = "UPDATE product SET stock=stock+" +quantity + " where productnumber =?"; 
	     try {
	        PreparedStatement ps =  DBConnection.getInstance().getConnection().prepareStatement(QupdateStock); 
	        //ps.setInt(1,quantity);
	        ps.setInt(1,productnumber); 
	        ps.execute();
	    } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }

}
}
