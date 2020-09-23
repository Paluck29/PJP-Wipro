package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
	
	static Student data[] = new Student[10];
	
	static {
		for (int i = 0; i < data.length; i++) 
			data [i]= new Student(); 
		
		data [0] = new Student("Sekar", new int[] {35, 35, 35});
		data [1] = new Student(null, new int[] {11, 22, 33});
		data [2] = null;
		data [3] = new Student("Manoj", null);
		data [4] = new Student("Phoebe", new int[] {90, 92, 80}); // TC1
		data [5] = new Student("Joey", new int[] {35, 40, 50}); // TC2
		data [6] = new Student("Chandler", new int[] {25, 29, 28}); // TC3
		data [7] = null; // TC4
		data [8] = new Student(null, new int[] {25, 29, 28}); // TC5
		data [9] = new Student("Ross", null); // TC6
		
	}

	public StudentMain() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentReport stud_rep = new StudentReport();
		StudentService stud_serv = new StudentService();
		
		System.out.println("Grade Calculation:");
		
		String x = null;
		
		for (int i = 0; i < data.length; i++)  {
			try {
				x = stud_rep.validate(data[i]);
			} catch (NullNameException e) {
				x = "NullNameException occured";
			} catch (NullMarksArrayException e) {
				x = "NullMarksArrayException occured";
			} catch (NullStudentException e) {
				x = "NullStudentException occured";
			}
			
			System.out.println("GRADE = " + x);
		}
		
		System.out.println("Number of Objects with Marks array as null = " + stud_serv.findNumberOfNullMarks(data));
		
		System.out.println("Number of Objects with Name as null = " + stud_serv.findNumberOfNullNames(data));
		
		System.out.println("Number of Objects that are entierly null = " + stud_serv.findNumberOfNullObjects(data));
		
		// TC9
		System.out.println("TC9: Number of Objects with Marks array as null = " + stud_serv.findNumberOfNullMarks(data));		
		
		// TC7
		System.out.println("TC7: Number of Objects with Name as null = " + stud_serv.findNumberOfNullNames(data));		
		
		// TC8
		System.out.println("TC8: Number of Objects that are entierly null = " +	stud_serv.findNumberOfNullObjects(data));
		
	}

}
