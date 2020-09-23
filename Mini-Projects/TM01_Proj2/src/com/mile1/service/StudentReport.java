package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {

	public StudentReport() {
		// TODO Auto-generated constructor stub
	}
	
	public String findGrade(Student obj) {
		int[] marks = obj.getMarks();		
		int sum=0;
		
		for(int i=0;i<marks.length;i++) {
			if(marks[i]<35)
				return "F";
			else {
				sum += marks[i];
			}
		}
		
		if(sum<=150)
			return "D";
		if(sum>150 && sum<=200)
			return "C";
		if(sum>200 && sum<=250)
			return "B";
		if(sum>250 && sum<=300)
			return "A";
		
		
		
		return "Error";
		
		
	}
	
	public String validate(Student obj) throws NullStudentException, NullNameException, NullMarksArrayException	{
		if (obj == null) {
			throw new NullStudentException();
		} else {
			if (obj.getName() == null) 
				throw new NullNameException();
			if (obj.getMarks() == null) 
				throw new NullMarksArrayException();
			
			return findGrade(obj);
		}
	}
	
	

}
