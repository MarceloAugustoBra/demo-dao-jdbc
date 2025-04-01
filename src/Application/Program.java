package Application;

import java.util.List;

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
		
		System.out.println("\n=== TEST 1: Seller find by Department:");
		Department department =  new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
	}
	
	

}
