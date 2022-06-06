package q2;

public class Main {

	public static void main(String[] args) {
		Loan l = Loan.getLaonObj();
		double amt1 = l.calculateLoanAmount(new PermanentEmployee(1,"anshuman",15000));
		System.out.println("loan amount for anshuman : "+amt1);
		double amt2 = l.calculateLoanAmount(new TemporaryEmployee(2,"abhi",40,15));
		System.out.println("loan amount for abhi : "+amt2);
		double amt3 = l.calculateLoanAmount(null);
		System.out.println("loan amount for null : "+amt3);
	}

}
