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

	public ProductDB() throws DataAccessException {
		try {
			findByProductNumber = DBConnection.getInstance().getConnection().prepareCall(FIND_BY_PRODUCTNUMBER_Q);
		} catch (SQLException e) {
			throw new DataAccessException("could not prepare statement", e);
		}
	}
	
	@Override
	public Product findReserveStock (int productNumber, int quantity) throws DataAccessException {
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

	public Product buildObject(ResultSet rs) throws DataAccessException {
		Product p = null;
		try {
			if(rs.getString("acc_material").equals("NULL")) {
				p = new Clothing(rs.getInt("productnumber"), rs.getString("name"), rs.getInt("price"), rs.getString("description"), rs.getString("size"), rs.getString("color"),rs.getString("material"), rs.getString("style"), rs.getInt("stock"), p.getQuantity());
			} else if (rs.getString("material").equals("NULL")) {
				p = new Accessory(rs.getInt("productnumber"), rs.getString("name"), rs.getInt("price"), rs.getString("description"), rs.getString("size"), rs.getString("acc_material"),rs.getString("acc_color"), rs.getString("style"), rs.getInt("stock"), p.getQuantity());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}

}
