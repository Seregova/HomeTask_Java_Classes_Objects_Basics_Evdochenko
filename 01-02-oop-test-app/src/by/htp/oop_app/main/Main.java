package by.htp.oop_app.main;

import java.util.Scanner;

//1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. 
//Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных. 
//2.Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. 
//Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса. 
//Задания объединены и реализованы через класс Test1.

public class Main {
	
	public static void main(String [] args) {
		
		System.out.println("Введите 2 числа");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Test1 t1 = new Test1(a,b);
		
		Test1Logic testLogic = new Test1Logic();
		
		int sum = testLogic.sum(t1);
		System.out.println(sum);
		
		int max = testLogic.max(t1);
		System.out.println(max);
		
	}
		
}

