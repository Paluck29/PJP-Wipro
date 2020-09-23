package module3;

public class FDAccount extends Account{
	double interestRate;
	double amount;
	int noOfDays;
	int ageOfACHolder;
	
	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		double interest=0.0;
		String typeCitizen;
		
		if(ageOfACHolder>60)
			typeCitizen="Senior";
		else
			typeCitizen="General";
		
		if(amount<10000000) {
			//amounts below 1 crore
			if(typeCitizen.equals("Senior")) {
				if(noOfDays>=7 && noOfDays<=14)
					interestRate=5.00;
				else if(noOfDays>=15 && noOfDays<=29)
					interestRate=5.25;
				else if(noOfDays>=30 && noOfDays<=45)
					interestRate=6.00;
				else if(noOfDays>45 && noOfDays<=60)
					interestRate=7.50;
				else if(noOfDays>=61 && noOfDays<=184)
					interestRate=8.00;
				else if(noOfDays>=185 && noOfDays<=365)
					interestRate=8.50;	
			}
			else if(typeCitizen.equals("General")) {
				if(noOfDays>=7 && noOfDays<=14)
					interestRate=4.50;
				else if(noOfDays>=15 && noOfDays<=29)
					interestRate=4.75;
				else if(noOfDays>=30 && noOfDays<=45)
					interestRate=5.50;
				else if(noOfDays>45 && noOfDays<=60)
					interestRate=7.00;
				else if(noOfDays>=61 && noOfDays<=184)
					interestRate=7.50;
				else if(noOfDays>=185 && noOfDays<=365)
					interestRate=8.00;	
			}
		}else {
			if(noOfDays>=7 && noOfDays<=14)
				interestRate=6.50;
			else if(noOfDays>=15 && noOfDays<=29)
				interestRate=6.75;
			else if(noOfDays>=30 && noOfDays<=45)
				interestRate=6.75;
			else if(noOfDays>45 && noOfDays<=60)
				interestRate=8.00;
			else if(noOfDays>=61 && noOfDays<=184)
				interestRate=8.50;
			else if(noOfDays>=185 && noOfDays<=365)
				interestRate=10.00;
		}
		
		interest = (amount * interestRate)/100;
		return interest;
	}

	public void setAmount(double amt) {
		// TODO Auto-generated method stub
		this.amount=amt;
	}

	public void setNoOfDays(int days) {
		// TODO Auto-generated method stub
		this.noOfDays=days;
	}

	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.ageOfACHolder=age;
	}

	public double getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}

	public int getDays() {
		// TODO Auto-generated method stub
		return noOfDays;
	}

	public int getAge() {
		// TODO Auto-generated method stub
		return ageOfACHolder;
	}
}
