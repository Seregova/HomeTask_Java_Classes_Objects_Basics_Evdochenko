package by.htp.student_app.main;

import java.util.Arrays;

//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость 
//(массив из пяти элементов). Создайте массив из десяти элементов такого типа. 
//Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.  


public class Student {
	
	private String surname;
	private int group;
	private int[] rate = new int[5];
	
	
	public Student(String surname, int group, int[] rate) {
		 this.surname = surname;
		 this.group = group;
		 this.rate = rate;
	}

	public Student() {
		
	}
	
	
	public String getSurname() {
		return this.surname;
	}
	
	public int getGroup() {
		return this.group;
	}
	
	public int[] getRate() {
		return this.rate;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setGroup(int group) {
		this.group = group;
	}

	public void setRate(int[] rate) {
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		return getSurname() + " " + getGroup() + " " + Arrays.toString(getRate());
	}
}