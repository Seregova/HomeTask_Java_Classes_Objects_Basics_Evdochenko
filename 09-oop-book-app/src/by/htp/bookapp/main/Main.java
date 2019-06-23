package by.htp.oopbookapp.main;

//9. Создать класс Book, спецификация которого приведена ниже. 
//Определить конструкторы, set- и get- методы и метод  toString(). 
//Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. 
//Задать критерии выбора данных и вывести эти данные на консоль.  

import java.util.Scanner;

	public class Main {
		
		public static void main(String[] args) {
		System.out.println("Введите автора");
		Scanner sc1 = new Scanner(System.in);
		String author = sc1.next();
		BookLogic book1 = new BookLogic();
		book1.authors(author);
			
		System.out.println("Введите издательство");
		Scanner sc2 = new Scanner(System.in);
		String publisher = sc2.next();
		BookLogic book2 = new BookLogic();
		book2.publishers(publisher);

		System.out.println("Введите год издания");
		Scanner sc3 = new Scanner(System.in);
		int years = sc3.nextInt();
		BookLogic book3 = new BookLogic();
		book3.years(years);
		
		}
}
