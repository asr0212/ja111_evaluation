package q2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of students");
		int num = scan.nextInt();
		Student[] students = new Student[num];
		
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter details of student: "+(i+1));
			System.out.println("Enter roll: ");
			int roll = scan.nextInt();
			System.out.println("Enter name: ");
			String name = scan.next();
			System.out.println("Enter address: ");
			String address = scan.next();
			System.out.println("Enter marks: ");
			int marks = scan.nextInt();
			students[i] = new Student(roll,name,address,marks);
			
		}
		int avarage = 0;
		
		for(Student s : students) {
		   System.out.println("Student Roll :"+s.getRoll());
		   System.out.println("Student Name :"+s.getName());
		   System.out.println("Student Address :"+s.getAddress());
		   System.out.println("Student Marks :"+s.getMarks());
		   System.out.println("=================================");
		   
		   avarage += s.getMarks();
		}
		avarage = avarage/students.length;
		System.out.println("Avarage of all students marks: "+avarage);

	}

}
