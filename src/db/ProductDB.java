package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Accessory;
import model.Clothing; 
import model.Product;

public class ProductDB implements ProductDBIF {
	private static final String FIND_BY_PRODUCTNUMBER_Q = "select productnumber, name, price, size, description, stock, material, color, style, acc_material, acc_color from product where productnumber = ?";	
	private PreparedStatement findByProductNumber;
	private PreparedStatement updatequantity; 
	private static final String UPDATE_QANTITY_Q = "UPDATE product SET stock  =?" + " where productnumber =?";  
	private static final String GET_QUANTITY_BY_PRODUCTID_Q= "select stock from product where productnumber =? "; 
	private PreparedStatement findQuantity;
	
	public ProductDB() throws DataAccessException {
		try {
			findByProductNumber = DBConnection.getInstance().getConnection().prepareCall(FIND_BY_PRODUCTNUMBER_Q);
			updatequantity = DBConnection.getInstance().getConnection().prepareStatement(UPDATE_QANTITY_Q); 
			findQuantity = DBConnection.getInstance().getConnection().prepareStatement(GET_QUANTITY_BY_PRODUCTID_Q);
		} catch (SQLException e) {
			throw new DataAccessException("could not prepare statement", e);
		}
	}
	
	
	

	public Product buildObject(ResultSet rs) throws DataAccessException {
		Product p = null;
		try {
			if(rs.getString("size").equals("onesize")) {
				p = new Clothing(rs.getInt("productnumber"), rs.getString("name"), rs.getInt("price"), rs.getString("description"), rs.getString("size"), rs.getString("color"),rs.getString("material"), rs.getString("style"), rs.getInt("stock"), rs.getInt("stock"));
			} else  {
				p = new Accessory(rs.getInt("productnumber"), rs.getString("name"), rs.getInt("price"), rs.getString("description"), rs.getString("size"), rs.getString("acc_material"),rs.getString("acc_color"), rs.getString("style"), rs.getInt("stock"),rs.getInt("stock"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}
	

	@Override
	public Product findByProductNumber(int productNumber) throws DataAccessException {
		try {
			
			findByProductNumber.setInt(1, productNumber);	
			ResultSet rs = findByProductNumber.executeQuery();
			Product p = null;
			if(rs.next()) {	
				p = buildObject(rs);
			}
			return p;
			} catch(SQLException e){
				throw new DataAccessException("could not retrieve data", e);

			}
		
	}




	@Override
	public void updateStock(Product p) throws DataAccessException {
		try {
		//PreparedStatement ps = DBConnection.getInstance().getConnection().prepareStatement(UPDATE_QANTITY_Q);
		updatequantity.setInt(1, p.getQuantity());
		updatequantity.setInt(2, p.getProductNumber());
		updatequantity.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		
	}

	public int getQuantity(int i) throws SQLException, DataAccessException {
		try {
		//findQuantity.setInt(1, i); 
		//ResultSet rs = findQuantity.executeQuery(); 
		findByProductNumber.setInt(1, i);	
		ResultSet rs = findByProductNumber.executeQuery();
		Product p = null;
		if(rs.next()) {	
			p = buildObject(rs);
		}
		 int e =p.getQuantity();
		 int b = e;
		 return b;
		} catch(SQLException e){
			throw new DataAccessException("could not retrieve data", e);

		}
		
	}
	

}
