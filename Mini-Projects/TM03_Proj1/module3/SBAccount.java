package module3;

public class SBAccount extends Account{
	double interestRate;
	double amount;
	String type;
	
	void setAmount(double amt) {
		amount=amt;
	}
	
	double getAmount() {
		return this.amount;
	}
	
	void setType(String type) {
		this.type=type;
	}
	
	String getType() {
		return type;
	}
	
	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		double interest;
		if(type.equals("Normal"))
			interestRate=0.04;
		else if(type.equals("NRI"))
			interestRate=0.06;
		
		interest = amount * interestRate;
		return interest;
	}

}
