package com.training;

public class StudentService {

	public String assignGrade(double mark) {
		// TODO Auto-generated method stub
		String grade = null;
		if(mark<60) {
			grade = "A";
		} else if(mark>=60 && mark<=85) {
			grade ="O";
		}
		else {
			grade = "A+";
		}
		return grade;
	}

}
