package q2;

public class Loan {
	private Loan() {
		
	}
	public static Loan getLaonObj() {
		return new Loan();
	}
	public double calculateLoanAmount(Employee employeeObj) {
		if(employeeObj instanceof PermanentEmployee)
			return (employeeObj.getSalary()*.15);
		else if(employeeObj instanceof TemporaryEmployee)
			return (employeeObj.getSalary()*.15);
		else
			return 0;
	}
}
