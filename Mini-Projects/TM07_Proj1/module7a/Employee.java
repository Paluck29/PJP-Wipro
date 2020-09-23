package module7a;

public class Employee implements Comparable<Employee>{
	String firstName;
	String lastName;
	int mobile;
	String email;
	String address;
	
	
	public Employee(String firstName, String lastName, int mobile, String email, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.address = address;	
	}

	public String getfName() {
		return this.firstName;
	}

	public void setfName(String fn) {
		this.firstName = fn;
	}

	public String getlName() {
		return this.lastName;
	}

	public void setlName(String ln) {
		this.lastName = ln;
	}
	
	public int getNumber() {
		return this.mobile;
	}

	public void setNumber(int mobile) {
		this.mobile = mobile;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String empEmail) {
		email = empEmail;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String addr) {
		this.address = addr;
	}
	
	public String toString() {
		return firstName+"\t"+lastName+"\t"+mobile+"\t"+email+"\t"+address;
	}
	
	public int compareTo(Employee e) {
		return this.firstName.compareTo(e.getfName());
	}
	
}
