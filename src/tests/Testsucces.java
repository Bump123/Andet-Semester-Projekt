package tests;

import java.sql.SQLException;
import static org.junit.Assert.*;
import org.junit.*;

import controller.OrderController;
import controller.ProductController;
import db.DBConnection;
import db.DataAccessException;
import db.ProductDB;
import model.Product;

public class Testsucces {
	OrderController ocl;
	ProductController pcl;
	DBConnection con = null;

	@Before
	public void setup() throws DataAccessException {
		ocl = new OrderController();

	}
	@Test
	public void successfulStockupdate() throws SQLException, DataAccessException {
		// arrange
		ProductDB pdb = new ProductDB();
		int productNumber = 4;
		int quantity = 4;
		int expectedquantity = 6;
		// act
		ocl.recieveOrder(6);
		ocl.recieveOrderLine(productNumber, quantity);
		int actualquantity = pdb.getQuantity(productNumber);
		ocl.completeOrder();
		System.out.println(actualquantity);
		assertEquals("should equal 6", expectedquantity, actualquantity);
	}

	@Test
	public void lastItemInStockOrdered() throws SQLException, DataAccessException {
		// arrange
		
		ProductDB pdb = new ProductDB();
		
		int quantity = 2;
		int productNumber = 3;
		int expectedquantity = 0;
		
		// act
		ocl.recieveOrder(6);
		ocl.recieveOrderLine(productNumber, quantity);
		int actualquantity = pdb.getQuantity(productNumber);
		ocl.completeOrder();
		assertEquals("should equal 0", expectedquantity, actualquantity);
		System.out.println(actualquantity);
		
	}
	@Test
	public void databaseUnavailable() {
		assertNull("Connected - connection cannot be null", con);
		
		con = DBConnection.getInstance();
		assertNotNull("Connected - connection cannot be null", con);		
	}
}
