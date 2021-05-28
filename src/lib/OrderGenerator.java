package lib;
import java.util.*;
import java.io.*;

public class OrderGenerator{
	private int id;
	private int qty;
	private int shopId;
	private ArrayList<Integer> ids = new ArrayList<>();
	private ArrayList<Integer> shopIds = new ArrayList<>();
	
	Random random = new Random();
	
	public int getId() {
		this.id = random.nextInt(5)+1;
		ids.contains(this.id);
		return id;
	}

	public int getUniqueId() {
		int id = getId();
		boolean unique = false;
		
		while(unique == false) {
			if(ids.contains(id)) {
				id = getId();
			} else {
				ids.add(id);
				unique = true;
			}
		}
		return id;
	}
	
	
	public int getQty() {
		this.qty = random.nextInt(4)+1;
		return qty;
	}
	
	public int getShopId() {
		this.shopId = random.nextInt(10)+1;
		return shopId;
	}
	
	public int getUniqueShopId() {
		int shopId = getShopId();
		boolean unique = false;
		
		while(unique == false) {
			if(shopIds.contains(shopId)) {
				shopId = getShopId();
			} else {
				shopIds.add(shopId);
				unique = true;
			}
		}
		return shopId;
	}
	
	public int generatedLines() {
		int lines = 1;
		for(int i = 1; i < random.nextInt(5)+1; i++ ) {
			lines = i;
	} 
		return lines;
	}
	
	public void createOrderTxt() throws IOException {
		File file = new File("order.txt");
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println("shoporderid id	quantity");
		
		for(int i = 0; i < generatedLines(); i++ ) {
			pw.println(getUniqueShopId() + "			" + getUniqueId() + "		" + getQty());	
		}
		
		pw.close();
	}
}
