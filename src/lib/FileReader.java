package lib;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
	public ArrayList<GeneratedOrderLine> orders = new ArrayList<>();

	public OrderGenerator og = new OrderGenerator();
	
	public void readFile() throws FileNotFoundException {
		Scanner s = new Scanner(new File("order.txt"));
		
		while(s.hasNext()) {
			GeneratedOrderLine o = new GeneratedOrderLine(0, 0, 0);
			s.nextLine();
			o.setShopOrderId(s.nextInt());
			o.setId(s.nextInt());
			o.setQuantity(s.nextInt());
			orders.add(o);
			}
	}	
}
