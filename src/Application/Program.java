package Application;

import java.util.Date;
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
		
		System.out.println("\n=== TEST 2: Seller find by Department:");
		Department department =  new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: Seller find All:");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: Insert:");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(),
				4000.00, department );
		sellerDao.insert(newSeller);
		System.out.println("Inserted!New ID = " + newSeller.getId());
		
		
		System.out.println("\n=== TEST 5: Seller Update");
		seller = sellerDao.findById(1);
		seller.setName("Marta Wayne");
		sellerDao.update(seller);
		System.out.println("UPDATE COMPLETED");
	}
	
	

}
