package by.htp.trainapp.main;


public class TrainLogic {
	
	public Train[] generateTrain() {
		Train[] trainArray = new Train[5];
		
		String[] destination = new String[]{"Rome", "Venice", "Rimini", "Naples", "Milan"} ;	
		int[] trainNumber = new int[] {5411, 2543, 4523, 5494, 7321};
		String[] departureTime = new String[] {"01.06.10:30", "01.06.11:30", "01.06.12:30", "01.06.13:30", "01.06.14:30"};
						
		for(int i = 0; i <trainArray.length; i++) {
			Train t = new Train();
			t.setDestination(destination[i]);
			t.setTrainNumber(trainNumber[i]);
			t.setDepartureTime(departureTime[i]);
			trainArray[i] = t; 
		}
		
		return trainArray;
		
	}
	
	public void sortByTrainNumber() {
		Train[] trainArray = new Train[5];
		for (int left = 0; left < trainArray.length; left++) {
			int minIndex = left;
			for (int i = left; i < trainArray.length; i++) {
				if (trainArray[i].getTrainNumber() < trainArray[minIndex].getTrainNumber()) {
					minIndex = i;
				}
			}
			swap(trainArray, left, minIndex);
		}
	}
	
	private void swap(Train[] array, int index1, int index2) {
		Train tr = array[index1];
        array[index1] = array[index2];
        array[index2] = tr;
	}
	
	public void trainInfo(int number) {
		TrainLogic train1 = new TrainLogic();
		Train[] trainArray = train1.generateTrain();
		boolean flag = false;
		for (Train train: trainArray) {
			 if (train.getTrainNumber() == number) {
			 flag = true; 
				 System.out.println("Номер поезда: " + train.getTrainNumber() + 
					" Направление: " + train.getDestination() +
					" Время отправления: " + train.getDepartureTime());
			 }
		}
		if (flag == false) {
			System.out.println("Нет такого поезда");
		}
	}
}

