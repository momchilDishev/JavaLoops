package _03_JavaLoopsHomework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

public class _09_ListOfProducts {

	public static class Product implements Comparable<Product>{
		
		private String product;
        private double price;
        
		public Product(String product, double price) {
			this.product = product;
			this.price = price;
		}
		
		public String getProduct(){
			
			return product;
		}
		public Double getPrice(){
			
			return price;
		}
		public int compareTo(Product compareFruit) {
            
            double otherPrice = ((Product) compareFruit).getPrice();

            //ascending order
            if(this.price>otherPrice) return 1;
            else
            if(this.price==otherPrice) return 0;
            return -1;
    }       
		
}
	public static void main(String[] args){ 
		
		Locale.setDefault(Locale.ROOT);
		ArrayList<Product> listP = new ArrayList<Product>();
		
		File file = new File("ProductsInput.txt");
		BufferedReader reader =null;
		BufferedWriter writer = null;

		try {
			reader = new BufferedReader(new FileReader(file));
			String text = null;

			while ((text = reader.readLine()) != null) {
				String[] splitLine = text.split(" ");
                listP.add(new Product(splitLine[0], Double.parseDouble(splitLine[1])));
 			}
			
			
		
			Collections.sort(listP);
			writer = new BufferedWriter(new FileWriter("Output.txt"));
            for(Product product : listP){
                    writer.write(product.getProduct() + " " + product.getPrice() + "\r\n");
            }
		} catch (FileNotFoundException e) {
			System.out.println("Error");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
			}
            try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}