package _03_JavaLoopsHomework;

import java.util.Scanner;

public class _01_SymmetricNumbersInRange {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter start: ");
		int start = scan.nextInt();
		System.out.print("Enter end: ");
		int end = scan.nextInt();

		for (int begin = start; begin <= end; begin++) {
			char[] arr = Integer.toString(begin).toCharArray();
			boolean symmetric = true;

				for (int indexArr = 0, arrIndx = 1; indexArr < arr.length/2; indexArr++, arrIndx++) {
					if (symmetric) {
						if (arr[indexArr] != arr[arr.length-arrIndx]) {
							symmetric = false;
						}
					}
				}

			if (symmetric) {
			System.out.print(begin + " ");
			}
		}
	}

}
