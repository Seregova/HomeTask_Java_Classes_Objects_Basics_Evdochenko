package by.htp.trainapp.main;



import java.util.Arrays;

public class Train {
	
	    private String destination;
	    private int trainNumber;
	    private String departureTime;
	    
	    public Train(String destination, int trainNumber, String departureTime) {
	    	this.destination = destination;
	        this.trainNumber = trainNumber;
	        this.departureTime = departureTime;
	    }
	    
	    public Train() {
	    }

		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public int getTrainNumber() {
			return trainNumber;
		}

		public void setTrainNumber(int trainNumber) {
			this.trainNumber = trainNumber;
		}

		public String getDepartureTime() {
			return departureTime;
		}

		public void setDepartureTime(String departureTime) {
			this.departureTime = departureTime;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
			result = prime * result + ((destination == null) ? 0 : destination.hashCode());
			result = prime * result + trainNumber;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Train other = (Train) obj;
			if (departureTime == null) {
				if (other.departureTime != null)
					return false;
			} else if (!departureTime.equals(other.departureTime))
				return false;
			if (destination == null) {
				if (other.destination != null)
					return false;
			} else if (!destination.equals(other.destination))
				return false;
			if (trainNumber != other.trainNumber)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return getDestination() + " " + getTrainNumber() + " " + (getDepartureTime());
		}

}

