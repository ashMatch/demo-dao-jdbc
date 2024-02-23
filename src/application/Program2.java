package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST n1: seller findById ===");
		Department dep = depDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n=== TEST n2: seller findAll ===");
		List<Department> depList = depDao.findAll();
		for(Department d : depList) {
			System.out.println(d);
		}
		
		System.out.println("\n=== TEST n3: seller insert ===");
		Department newDepartment = new Department(10, "Sells");
		depDao.insert(newDepartment);
		System.out.println("Inserido!! novo id: " 
					+ newDepartment.getId() 
					+ "Novo nome: "
					+ newDepartment.getName());
	
		System.out.println("\n=== TEST n4: seller update ===");
		dep = depDao.findById(1);
		dep.setName("Quality");
//		dep.setId(12);
		depDao.update(dep);
		System.out.println("ATUALIZAÇÃO FEITA!!");
	
		
		System.out.println("\n=== TEST n5: department delete ===");
		System.out.println("Entre com o id para teste de remoção.");
		int id = sc.nextInt();
		depDao.deleteById(id);
	
		System.out.println("REMOÇÃO COMPLETA");
	
		sc.close();
	
	
	
	}

}
