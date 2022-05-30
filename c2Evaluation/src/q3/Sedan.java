package q3;

public class Sedan extends Car{
	final int farePerKm =20;
	Sedan(int numberOfPassenger, int numberOfKMs){
		super(numberOfPassenger,numberOfKMs);
	}
	public int getFair() {
		return farePerKm;
	}
}
