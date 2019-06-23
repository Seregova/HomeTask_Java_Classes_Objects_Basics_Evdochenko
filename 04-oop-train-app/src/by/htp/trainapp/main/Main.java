package by.htp.trainapp.main;

//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов. 
//Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Введите номер поезда");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		TrainLogic train1 = new TrainLogic();
		train1.trainInfo(number);
		
		System.out.println("Расписание всех поездов");
		TrainLogic train2 = new TrainLogic();
		Train[] trainArray = train2.generateTrain();
		System.out.println(Arrays.toString(trainArray));
	
	}
	
	
}

