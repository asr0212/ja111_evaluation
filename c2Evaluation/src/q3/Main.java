package q3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of passenger: ");
		int numOfPass = scan.nextInt();
		System.out.println("Enter number of KM: ");
		int numOfKm = scan.nextInt();
		Ola myOla = new Ola();
		Car car =  myOla.bookCar(numOfPass, numOfKm);
		int res = myOla.calculateBill(car);
		System.out.println("The total fare amount is: "+ res);
	}

}
