package Application;

import java.util.Date;

import Model.Dao.DaoFactory;
import Model.Dao.SellerDao;
import Model.entities.Department;
import Model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: Seller find by id:");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
	}
	
	

}
