package by.htp.student_app.main;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		StudentLogic studentl = new StudentLogic();
		
		Student[] mas = studentl.generateStudent();
		
		System.out.println(Arrays.toString(mas));
	
	}
}
