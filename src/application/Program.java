package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		
		
		/*
		 * Department dp = new Department(3404, "Library");
		 * 
		 * System.out.println(dp);
		 * 
		 * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); Date date =
		 * sdf.parse("20/02/2022");
		 * 
		 * Seller sl = new Seller(2345, "Sueli Montana", "sueli@gmail.com", new
		 * java.sql.Date(date.getTime()),3000.0, dp);
		 * 
		 * System.out.println(sl);
		 */
		Scanner sc = new Scanner(System.in);
		
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
	
		System.out.println("=== TEST n1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n=== TEST n2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> listSeller = sellerDao.findByDepartment(department);
		for (Seller sel : listSeller) {
			System.out.println(sel);
		}
		
		
		System.out.println("\n=== TEST n3: seller findAll ===");
		listSeller = sellerDao.findAll();
		for (Seller sel : listSeller) {
			System.out.println(sel);
		}
	
		System.out.println("\n=== TEST n4: seller findAll ===");
		Seller newSeller = new Seller(null, "Greg Salmon", "greg@gmail.com", new Date(), 4000.0, department);
		
		sellerDao.insert(newSeller);
		
		System.out.println("Inserido!! novo id = " + newSeller.getId());
	
		
		System.out.println("\n=== TEST n5: seller findAll ===");
		seller = sellerDao.findById(1);
		seller.setName("Marta Blue");
		sellerDao.update(seller);
		System.out.println("ATUALIZAÇÃO FEITA!!");
		
		
		
		System.out.println("\n=== TEST n6: seller findAll ===");
		System.out.println("Entre com o id para teste  de remoção.");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
	
		System.out.println("REMOÇÃO COMPLETA");
	
		sc.close();
	}

}
