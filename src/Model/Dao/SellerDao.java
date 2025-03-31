package Model.Dao;

import java.util.List;

import Model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Seller id);
	Seller findById(Integer id);
	List<Seller> findAll();

}
