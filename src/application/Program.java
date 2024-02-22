package application;

import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.SellerDao;
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
	
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	
	}

}
