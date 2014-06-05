package _03_JavaLoopsHomework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;



public class _10_OrderOfProducts {

	public static void main(String[] args) throws Exception {
		
		ArrayList<Product> products = new ArrayList<Product>();
		
		File input = new File("ProductsInput.txt");
		BufferedReader readFile = null;
		BufferedWriter wrOutput = null;
		
		try {
			readFile = new BufferedReader( new FileReader(input));
			String str = null;
			
			try {
				while ((str = readFile.readLine())!=null) {
					String[] splitter = str.split(" ");
					products.add(new Product(splitter[0],Double.parseDouble(splitter[1])));
				}
				
			} catch (IOException excp) {
				System.out.println("Failed to read!");
				}
		} catch (FileNotFoundException excptn) {
			System.out.println("File not found!");
		}
		
		double orderSum = 0;
		Scanner orderScan = null;
		
		try {
			orderScan = new Scanner(new FileReader("Order.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
		
		
		while (orderScan.hasNext()) {
			double quantity = orderScan.nextDouble();
			String currentPrdct =orderScan.next(); 
			
			for (Product product : products) {
				if (product.getProduct().equals(currentPrdct)) {
					orderSum+=product.getPrice()*quantity;
				}
			}

		}
		
		try {
			wrOutput = new BufferedWriter(new FileWriter("OrderOutput.txt"));
			wrOutput.write(String.format(Locale.ROOT, "%.2f", orderSum));
		} catch (IOException e) {
			System.out.println("Failed to write!");
			
		}
		wrOutput.close();
		readFile.close();
		
		}
		public static class Product{
		
		private String product;
		private double price;
		
		public Product(String product, double price){
			this.product = product;
			this.price = price;
		}
		public String getProduct(){
			return product;
		}
		public Double getPrice(){
			return price;
		}
		
	}
	
	}
