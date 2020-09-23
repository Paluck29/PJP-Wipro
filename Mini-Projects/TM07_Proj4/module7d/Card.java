package module7d;

public class Card {
	char symbol;
	int number;
	
	Card(){ }
	
	Card(char sym, int num){
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
	
}
