package library;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


public class FileReaderTest{
	
	
	public static void main(String[] args) throws IOException {
		
		TestMethods t = new TestMethods();
		GeneratedOrderLine o = new GeneratedOrderLine(0, 0, 0);
		OrderGenerator og = new OrderGenerator();
		
		og.createOrderTxt();
		t.readFile();
		System.out.print(t.orders.toString());

	}
}



