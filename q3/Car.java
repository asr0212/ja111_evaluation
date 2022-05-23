package q3;

import java.util.Scanner;

public class Car {
   private String model;
   private String companyName;
   private String color;
   private Engine engine = new Engine();
   
	public void setModel() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter car model:");
		this.model = scan.nextLine();
	}
	public void setCompany() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter car company:");
		this.companyName = scan.nextLine();
	}
	public void setColor() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter car color:");
		this.color = scan.nextLine();
	}
	public void setEngine() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter engine rpm:");
		this.engine.setRmp(scan.nextInt());
		System.out.println("enter engine power:");
		this.engine.setPower(scan.nextInt());
		scan.nextLine();
		System.out.println("enter engine manufacturer:");
		this.engine.setManufacturer(scan.nextLine());
		
	}
	public String getModel() {
		return model;
	}
	public String getCompany() {
		return companyName;
	}
	public String getColor() {
		return color;
	}
	public Engine getEngine() {
		return engine;
	}
	
	
	Car(){
		setModel();
		setCompany();
		setColor();
		setEngine();
	}
	Car(String model,String comp,String col,int rmp,int pow,String manu){
		this.model = model;
		this.companyName = comp;
		this.color = col;
		this.engine.setRmp(rmp);
		this.engine.setPower(pow);
		this.engine.setManufacturer(manu);
		this.engine.enableTurbo();
	}
}
