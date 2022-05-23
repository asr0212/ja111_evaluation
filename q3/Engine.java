package q3;

import java.util.Scanner;

public class Engine {
	private int rmp;
	private int power;
	private String manufacturer;
	private Boolean hasTurbo = false;
	
	public void setRmp(int rmp) {
		this.rmp = rmp;
	}
	public void setPower(int pow) {
		this.power = pow;
	}
	public void setManufacturer(String manu) {
		this.manufacturer = manu;
	}
	public void enableTurbo() {
		this.hasTurbo = true; 
	}
	
	public int getRmp() {
		return rmp;
	}
	public int getPower() {
		return power;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public Boolean getHasTurbo() {
		return hasTurbo;
	}
}
