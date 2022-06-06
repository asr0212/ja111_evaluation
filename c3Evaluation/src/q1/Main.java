package q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the index of the array element you want to access");        
		try {
           int e = Integer.parseInt(scan.next());
           System.out.println("The array element at index "+e+" = "+arr[e]);
           System.out.println("The array element succesfully accessed");
           
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Enter valid index(index out of bound)");
		}
		catch(NumberFormatException b) {
			System.out.println("Enter valid index(enter a number)");
		}

	}

}
