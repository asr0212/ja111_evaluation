package q3;

public class HatchBack extends Car{
	final int farePerKm =15;
	HatchBack(int numberOfPassenger, int numberOfKMs){
		super(numberOfPassenger,numberOfKMs);
	}
	public int getFair() {
		return farePerKm;
	}
}
