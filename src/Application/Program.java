package Application;

import java.util.Date;

import Model.entities.Department;
import Model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		
		Department obj =  new Department(1, "books");
		System.out.println(obj);
		
		Seller seller =  new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);
		System.out.println(seller);
	}
	
	

}
