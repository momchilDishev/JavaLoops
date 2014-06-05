package _03_JavaLoopsHomework;

import java.util.ArrayList;
import java.util.Scanner;

public class _05_AngleUnitConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inRotations = input.nextInt();
		ArrayList<String> print = new ArrayList<>();
		
		for (int numConv = 0; numConv < inRotations; numConv++) {
			String[] current = new String[2];
			double value = input.nextDouble();
			String measure = input.next();
			String result = "";
			if (measure.equals("deg")) {
				result = String.format("%.6f",Radians(value))+" "+"rad";
				print.add(result);
			}else {
				result = String.format("%.6f",Degrees(value))+" "+"deg";
				print.add(result);
			}
		}
		for (String valueCombo : print) {
			System.out.printf("%s\n",valueCombo);
		}
	}
	
	private static double Degrees(double radian) {
		double degree = (radian*180)/Math.PI;
		return degree;
	}

	public static double Radians(double degree){
		double radian = (degree*Math.PI)/180;
		return radian;
		
	}
}
