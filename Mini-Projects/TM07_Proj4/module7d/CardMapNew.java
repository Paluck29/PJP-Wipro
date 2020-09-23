package module7d;

import java.util.*;

public class CardMapNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character, ArrayList<Card>> tm = new TreeMap<Character, ArrayList<Card>>();
		
		Scanner sc = new Scanner(System.in);
		int numCards=0;
		System.out.println("Enter Number of Cards :");
		numCards=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<numCards;i++) {
			System.out.println("Enter card "+(i+1));
			Card c = new Card();
			c.setSymbol(sc.nextLine().charAt(0));
			c.setNumber(sc.nextInt());
			sc.nextLine();
			
			ArrayList<Card> list = null;
			if (tm.containsKey(c.getSymbol())) {
				list = tm.get(c.getSymbol());
				if(list == null)
					list = new ArrayList<Card>();
			    list.add(c);  
			} else {
				list = new ArrayList<Card>();
			    list.add(c);               
			   }
			tm.put(c.getSymbol(),list);

		}
		
		System.out.println("Distinct Symbols are :");
		
		Set<Map.Entry<Character, ArrayList<Card>>> set = tm.entrySet();
		Iterator<Map.Entry<Character, ArrayList<Card>>> it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<Character, ArrayList<Card>> e = it.next();
			System.out.println(e.getKey());
		}
		
		System.out.println("Next Level");
		
		
		set = tm.entrySet();
		it = set.iterator();
		ArrayList<Card> list = null;
		
		while(it.hasNext()) {
			int sum = 0; 
			int count = 0;
			Map.Entry<Character, ArrayList<Card>> e = it.next();
			list = e.getValue();
			
			System.out.println("Cards in "+e.getKey()+" Symbol");
			for(Card c:list) {
				System.out.println(c.getSymbol()+" "+c.getNumber());
				sum += c.getNumber(); 
				count++;
			}
			
			
			System.out.println("Number of cards : "+count);
			System.out.println("Sum of Numbers : "+sum);
			
		}
		
		System.out.println();
		sc.close();
	}

}
