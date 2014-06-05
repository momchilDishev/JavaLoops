package _03_JavaLoopsHomework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class _06_RandomHands5Cards {

	public static void main(String[] args) {
		List<String>deck = getDeck();
		
		
		for (int rotations = 0; rotations < 5; rotations++) {
			for (int i = 0; i < 5; i++) {
				int index = new Random().nextInt(deck.size());
		        String anyCard = deck.get(index);
		        
		        System.out.printf("%4s",anyCard);
		        deck.remove(anyCard);
			}
				System.out.println();
			 
		}

	}
	private static List<String> getDeck() {
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] color = {"\u2663", "\u2666", "\u2665", "\u2660"};
        List<String> thisDeck = new ArrayList<String>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < color.length; j++) {
                thisDeck.add(numbers[i] + "" + color[j]);
            }
        }
        return thisDeck;
	}
}

