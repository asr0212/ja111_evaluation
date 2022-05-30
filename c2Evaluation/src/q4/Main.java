package q4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Person student = generatePerson(new Student());
		Person instructor = generatePerson(new Instructor());
		System.out.println(student);
		System.out.println(instructor);

	}
	public static Person generatePerson(Person person) {
		if(person.equals(new Student())) {
			Student stu = (Student)person;
			stu.studentId = 1;
			stu.courseEnrolled = "JA111";
			stu.courseFee = 5000;
			stu.address.city = "pali";
			stu.address.state = "rajasthan";
			stu.address.pinCode = "306119";
			return stu;
		}
		else
		{
			Instructor ins = (Instructor)person;
			ins.instructorId = 2;
			ins.salary = 50000;
			ins.address.city = "jodhpur";
			ins.address.state = "rajasthan";
			ins.address.pinCode = "302002";
			return ins;
		}
	}

}
