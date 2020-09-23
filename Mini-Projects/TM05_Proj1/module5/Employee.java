package module5;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable{

	private int id;
	private String name;
	private int age;
	private double Salary;
	
	Employee(){
		
	}
	
	Employee(int id, String name, int age, double sal){
		this.id=id;
		this.name=name;
		this.age=age;
		this.Salary=sal;
	}
	
	void setId(int id) {
		this.id=id;
	}
	
	void setName(String name) {
		this.name=name;
	}
	
	void setAge(int age) {
		this.age=age;
	}
	
	void setSal(double sal) {
		this.Salary=sal;
	}
	
	int getId() {
		return id;
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	double getSal() {
		return Salary;
	}
	
	void printEmp() {
		System.out.println("ID: "+getId()+"\nName: "+getName()+"\nAge: "+getAge()+"\nSalary: "+getSal());
	}
	
	public String toString() {
		return getId()+" "+getName()+" "+getAge()+" "+getSal()+"\n";
	}
}
