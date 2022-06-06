package q3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Demo d = new Demo();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter month name in three word: ");
		String m = scan.next();
		try {
		   d.showDetails(Month.valueOf(m));
		}
		catch(Exception e) {
			System.out.println("invalid month name");
		}
	}

}
