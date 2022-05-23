package q4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of Students you want to enter");
		int n = scan.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("===============================================");
			System.out.println("Enter the Roll Number:");
			int num = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the Names:");
			String name = scan.nextLine();
			System.out.println("Enter the marks:");
			int mark = scan.nextInt();
			Student obj1 = new Student(num,name,mark);
			System.out.println("Student Roll Number: "+obj1.getRollNumber());
			System.out.println("Student Name: "+obj1.getName());
			System.out.println("Student Marks: "+obj1.getMarks());
		}
		scan.close();
	}
}
