package tests;


import java.sql.SQLException;
import static org.junit.Assert.*;
import org.junit.*;

import controller.OrderController;
import controller.ProductController;
import db.DataAccessException;
import db.ProductDB;
import model.Product;
public class Testsucces { 
	OrderController ocl; 
	ProductController pcl;
	@Before
public void setup() throws DataAccessException {
	ocl = new OrderController();
	
} 
	public void purchase() throws SQLException, DataAccessException { 
		//arrange
		int productNumber = 3; 
		int quantity = 10; 
		int expectedquantity = 0;
		//act
	 	//assert 
	assertEquals("e quantity burde være hvad stock var før ordren - ordrens kvantitet", expectedquantity,1) ;
	}
	@Test 
	public void stockreachesZeroafterpurchase() throws SQLException, DataAccessException { 
		//arrange
		// vi skal finde ud af hvad quantity på vores database er. Vores actual skal være en get fra databasen på et bestemt produktnummer
		ProductDB pdb = new ProductDB();
		int productNumber = 3;
		int expectedquantity = 0;
		int actualquantity = pdb.getQuantity(productNumber);
		//act
	assertEquals("should equal 0", expectedquantity, actualquantity); 
	System.out.println(actualquantity);
	//("e quantity burde være 0", expectedquantity,System.out.println(quantity)) ;
	}
}
