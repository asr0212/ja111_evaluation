package q3;

public class Ola {
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger <= 3)
			return new HatchBack(numberOfPassenger,numberOfKMs);
		else
			return new Sedan(numberOfPassenger,numberOfKMs);
	}

	public int calculateBill(Car car) {
		return car.numberOfKms*car.getFair();	
	}
}
