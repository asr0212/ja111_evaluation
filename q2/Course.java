package q2;

import java.util.Scanner;

public class Course {
	
	int courseId;
	String courseName;
	int courseFee;
	
	public static void authenticate(String user,String pass) {
		if(user == "Admin" && pass == "1234")
		{
			Course obj = new Course();
			Scanner scan = new Scanner(System.in);
			obj.courseId = scan.nextInt();
			scan.nextLine();
			obj.courseName = scan.nextLine();
			obj.courseFee = scan.nextInt();
			
			obj.displayCourseDetails();
			
		}
		else
			System.out.println("Invalid Username or password");
	}

	public void displayCourseDetails() {
		System.out.println(courseId);
		System.out.println(courseName);
		System.out.println(courseFee);
	}
	public static void main(String[] args) {
		authenticate("Admin","1234");
		System.out.println("===========================");
		authenticate("ASR","2345");

	}

}
