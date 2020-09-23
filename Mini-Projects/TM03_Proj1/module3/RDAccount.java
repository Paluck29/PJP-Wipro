package module3;

public class RDAccount extends Account{
	double interestRate;
	double amount;
	int noOfMonths;
	double monthlyAmount;
	int age;
	
	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		double interest;
		if(age>60) {
			if(noOfMonths==6)
				interestRate=8.00;
			else if(noOfMonths==9)
				interestRate=8.25;
			else if(noOfMonths==12)
				interestRate=8.50;
			else if(noOfMonths==15)
				interestRate=8.75;
			else if(noOfMonths==18)
				interestRate=9.00;
			else if(noOfMonths==21)
				interestRate=9.25;
		}else {
			if(noOfMonths==6)
				interestRate=7.50;
			else if(noOfMonths==9)
				interestRate=7.75;
			else if(noOfMonths==12)
				interestRate=8.00;
			else if(noOfMonths==15)
				interestRate=8.25;
			else if(noOfMonths==18)
				interestRate=8.50;
			else if(noOfMonths==21)
				interestRate=8.75;
		}
		
		
		interest = amount * interestRate;
		return interest;
	}

	public void setAmount(double nextDouble) {
		// TODO Auto-generated method stub
		this.amount=nextDouble;
		
	}

	public void setMonths(int nextInt) {
		// TODO Auto-generated method stub
		this.noOfMonths=nextInt;
	}

	public void setAge(int nextInt) {
		// TODO Auto-generated method stub
		this.age=nextInt;
	}

	public int getMonths() {
		// TODO Auto-generated method stub
		return noOfMonths;
	}

	public double getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}

	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}

}
