package com.nestjavatraining.utility;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import com.nestjavatraining.entity.Product;
import com.nestjavatraining.service.ProductService;
import com.nestjavatraining.service.ProductServiceImpl;

public class ProductUtility {

	private static ProductService productService = new ProductServiceImpl();
	public static int savingAccoutProductCodeCounter = 100;
	public static int currentAccoutProductCodeCounter = 100;
	public static int loanAccoutProductCodeCounter = 100;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		
		char ch;
		do {
			System.out.println("1.Save Product, 2.Delete Product, 3.List All Products, 4.Search Product");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				saveProduct();
				break;
			case 2:
				deleteProduct();
				break;
			case 3:
				listAllProducts();
				break;
			case 4:
				searchProduct();
				break;

			default:
				System.out.println("Invalid Choice");
			}
			System.out.println("\nDo you want to continue (y/n)");
			ch = scanner.next().charAt(0);
		} while (ch == 'y');
	}

	private static void saveProduct() { 
		Scanner scanner=new Scanner(System.in);
	
		
		System.out.println("Account Type Choice\n1.SavingAccount\n2.Current Account\n3.LoanAccount");
		Date activationDate;
		Date expiryDate ;
		System.out.println("Enter Choice");

		int choice=scanner.nextInt();
		if(choice==1) {
			Calendar calendar = Calendar.getInstance();
			activationDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());
			expiryDate=new java.sql.Date(Calendar.getInstance().getTime().getTime());
			calendar.add(Calendar.YEAR,5);
			expiryDate = new java.sql.Date(calendar.getTime().getTime());
	        Product product =new Product("SA"+Integer.toString(savingAccoutProductCodeCounter),"Saving Account","Saving Account",activationDate,expiryDate);
			savingAccoutProductCodeCounter++;
			productService.saveProduct(product);
		}else if(choice==2)
		{
			Calendar calendar = Calendar.getInstance();
			activationDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());
			expiryDate=new java.sql.Date(Calendar.getInstance().getTime().getTime());
			calendar.add(Calendar.YEAR,10);
			expiryDate = new java.sql.Date(calendar.getTime().getTime());
	        Product product =new Product("CA"+Integer.toString(currentAccoutProductCodeCounter),"Current Account","Current Account",activationDate,expiryDate);
	        currentAccoutProductCodeCounter++;
			productService.saveProduct(product);
		}else if(choice==3)
		{
			Calendar calendar = Calendar.getInstance();
			activationDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());
			expiryDate=new java.sql.Date(Calendar.getInstance().getTime().getTime());
			calendar.add(Calendar.YEAR,1);
			expiryDate = new java.sql.Date(calendar.getTime().getTime());
	        Product product =new Product("AC"+Integer.toString(loanAccoutProductCodeCounter),"Loan Account","Loan Account",activationDate,expiryDate);
	        loanAccoutProductCodeCounter++;
			productService.saveProduct(product);
		}
	}

	private static void listAllProducts() {
		List<Product> productList = productService.listAllProducts();
		System.out.printf("%-15s %-15s %-15s %-15s\n", "Product Code", "Product Name", "Product Description","Activation Date");
		for (Product product : productList)
			System.out.printf("%-15s %-15s %-15s %-20s\n",product.getProductCode(),product.getProductName(),product.getProductDescription(),product.getActivationDate());
	}

	private static void searchProduct() {
		Scanner scanner=new Scanner(System.in);
		List<Product> productList = productService.listAllProducts();
		Boolean flag = false;
		System.out.println("Enter the Account Number");	
		String accNo=scanner.next().toUpperCase();
		for (Product product : productList) {
			if(product.getProductCode().equals(accNo)) {
				productService.getProduct(accNo);
				flag=true;
			}
		}
		if(flag!=true) {
			System.out.println("Invaild Account Number");	
		}

	}

	private static void deleteProduct() {
		Scanner scanner=new Scanner(System.in);
		List<Product> productList = productService.listAllProducts();
		Boolean flag = false;
		System.out.println("Enter the Account Number need to delete");	
		String accNo=scanner.next().toUpperCase();
		for (Product product : productList) {
			if(product.getProductCode().equals(accNo)) {
				productService.deleteProduct(accNo);
				flag=true;
				break;
			}
		}
		if(flag!=true) {
			System.out.println("Invaild Account Number");	
		}
	}

}
