package by.htp.student_app.main;

import java.util.Random;

public class StudentLogic {
	
	public Student[] generateStudent() {
		
		Student[] studentArray = new Student[10];
		
		String[] surname = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"} ;
		
		int[] group = new int[] {1, 2};
		
		for(int i = 0; i <studentArray.length; i++) {
			Student st = new Student();
			st.setSurname(surname[i]);
			int position = i%2;
			st.setGroup(group[position]);
			st.setRate(rate());
			studentArray[i] = st; 
		}
		
		return studentArray;
		
	}
		
	public int[] rate() {
		
		int[] rate = new int[5];
		
		Random rand = new Random();

		for (int i = 0; i < rate.length; i++) {
			rate[i] = rand.nextInt(10);
		}
		return rate;
	}
	
 }
