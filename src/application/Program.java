package application;

import java.util.List;

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
	
	}

}
