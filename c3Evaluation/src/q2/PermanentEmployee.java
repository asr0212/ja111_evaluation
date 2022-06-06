package q2;

public class PermanentEmployee extends Employee{
     private double basicPay;
     
     PermanentEmployee(int employeeId,String employeeName,double basicPay){
    	 super(employeeId,employeeName);
    	 this.basicPay = basicPay;
    	 calculateSalary();
     }
     
     void calculateSalary() {
    	 this.salary = basicPay - (basicPay*0.12);
    	 
     }
}
