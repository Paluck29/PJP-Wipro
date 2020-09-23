package module3;

public class TypeException extends Exception{
	public TypeException(){
		super();
	}
	
	public String toString() {
		return "Please write the correct account type";
	}
}
