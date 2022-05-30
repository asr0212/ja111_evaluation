package q4;

public class Instructor extends Person{
	int instructorId;
	int salary;
	
	public String toString() {
		return "Instructor [InstructorId="+instructorId+","+"Salary="+salary+","+"address="+address.toString()+"]";
	}
}
