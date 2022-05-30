package q4;

public class Student extends Person{
	int studentId;
	String courseEnrolled;
	int courseFee;
	
	public String toString() {
		return "Student [StudentId="+studentId+","+"CourseEnrolled="+courseEnrolled+","+"CourseFee="+courseFee+","+"address="+address.toString()+"]";
	}
}
