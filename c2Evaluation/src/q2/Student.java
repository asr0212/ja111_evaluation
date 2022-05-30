package q2;

public class Student {
   private int roll;
   private String name;
   private String address;
   private int marks;
   
   Student(int roll,String name,String address,int marks){
	   this.roll = roll;
	   this.name = name;
	   this.address = address;
	   this.marks = marks;
   }
   
   public int getRoll() {
	   return roll;
   }
   public String getName() {
	   return name;
   }
   public String getAddress() {
	   return address;
   }
   public int getMarks() {
	   return marks;
   }
   
}
