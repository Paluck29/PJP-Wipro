package module7c;

import java.util.*;

public class CardDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Card> hc = new HashSet<Card>();

		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<8; i++) {
			System.out.println("Enter a card :");
			Card c = new Card();
			c.setSymbol(sc.nextLine().charAt(0));
			//sc.nextLine();
			c.setNumber(sc.nextInt());
			sc.nextLine();
			
			hc.add(c);
		}
		
		System.out.println();
		
		
		System.out.println("Four symbols gathered in 8 cards");
		System.out.println("Cards in Set are: ");
		
		for(Card card:hc) {
			System.out.println(card.getSymbol()+" "+card.getNumber());
		}
			
		
		sc.close();
	}

}
