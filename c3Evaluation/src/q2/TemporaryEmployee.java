package q2;

public class TemporaryEmployee extends Employee{
	private int hoursWorked;
	private int hourlyWages;
	
	TemporaryEmployee(int employeeId,String employeeName,int hoursWorked,int hourlyWages){
		super(employeeId,employeeName);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
		calculateSalary();
	}
	void calculateSalary() {
		this.salary = (double)(hoursWorked*hourlyWages);
	}
}
