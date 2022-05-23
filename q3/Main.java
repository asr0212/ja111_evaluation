package q3;

public class Main {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("harrier","tata","balck",10000,158,"tata");
		
		System.out.println("car Model: "+c1.getModel());
		System.out.println("car company: "+c1.getCompany());
		System.out.println("car color: "+c1.getColor());
		Engine c3 = c1.getEngine();
		System.out.println("engine rpm: "+c3.getRmp());
		System.out.println("engine power: "+c3.getPower());
		System.out.println("engine manufacturer: "+c3.getManufacturer());
		System.out.println("engine turbo: "+c3.getHasTurbo());
		System.out.println("=========================");
		System.out.println("car Model: "+c2.getModel());
		System.out.println("car company: "+c2.getCompany());
		System.out.println("car color: "+c2.getColor());
		Engine c4 = c1.getEngine();
		System.out.println("engine rpm: "+c4.getRmp());
		System.out.println("engine power: "+c4.getPower());
		System.out.println("engine manufacturer: "+c4.getManufacturer());
		System.out.println("engine turbo: "+c4.getHasTurbo());

	}

}
