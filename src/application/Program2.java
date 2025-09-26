package application;

import java.util.List;

import model.dao.DaoFactory2;
import model.dao.DepartmentDao;
import model.etities.Department;

public class Program2 {
	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory2.createDeparmentDao();
		
		System.out.println("TESTE 1! INSERT DEPARTMENT");
		Department dep = new Department(null, "Medicamentos");
		//departmentDao.insert(dep);
		
		//System.out.println("INSERIDO!" + dep.getId());
		
		System.out.println("TESTE 2! UPDATE DEPARTMENT");
		String name = "Tools";
		int id = 5;
		dep.setName(name);
		dep.setId(id);
		departmentDao.update(dep);
		System.out.println("Update complete!");
		
		System.out.println("TESTE 3! deleteById");
		//departmentDao.deleteById(5);
		System.out.println("Delete Complete!");
		System.out.println();
		
		System.out.println("TESTE 4! FindById");
		Department newDep = departmentDao.findById(4);
		System.out.println(newDep);
		
		System.out.println("=== TESTE 5: findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
		    System.out.println(d);
		}
		
		
		
		
		
		
		
		
		
	}

}
