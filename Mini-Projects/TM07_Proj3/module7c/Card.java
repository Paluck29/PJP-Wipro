package module7c;

import java.util.*;

public class Card implements Comparable{
	char symbol;
	int number;
	
	public Card(){
		
	}
	
	public Card(char sym, int num){
		this.symbol = sym;
		this.number = num;
	}
	
	public void setSymbol(char str) {
		this.symbol = str;
	}
	
	public char getSymbol() {
		return this.symbol;
	}
	
	public void setNumber(int num) {
		this.number = num;
	}
	
	public int getNumber() {
		return this.number;
	}

	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		if(this.symbol < c.symbol)
			return -1;
		else if(this.symbol>c.symbol)
			return 1;
		return 1;
	}
	
	@Override
	public int hashCode() {
		return String.valueOf(symbol).hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Card) {
			Card card = (Card) o;
			return (this.symbol == card.symbol);
		}
		else {
			return false;
		}
		
	}
}
