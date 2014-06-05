package _03_JavaLoopsHomework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class _08_SumNumbersFromTextFile {

	public static void main(String[] args) throws NumberFormatException, IOException {
		List<Integer> list = new ArrayList<Integer>();
		File file = new File("Input.txt");
		BufferedReader reader = null;

		try {
		    reader = new BufferedReader(new FileReader(file));
		    String text = null;

		    while ((text = reader.readLine()) != null) {
		        list.add(Integer.parseInt(text));
		    }
		} catch (FileNotFoundException e) {
		    System.out.println("Error");

		} finally {
		    try {
		        if (reader != null) {
		            reader.close();
		        }
		    } catch (IOException e) {
		    }
		}
		long sum = 0;
		for (Integer intgr : list) {
			
			sum+=intgr;
		}
		System.out.println(sum);
	}

}
