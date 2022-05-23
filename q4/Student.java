/**
 * 
 */
package q4;

import java.util.Scanner;

/**
 * @author anshu
 *
 */
public class Student {
	private int rollNumber;
	private String studentName;
	private int marks;
	
	public void setRollNumber() {
		Scanner scan = new Scanner(System.in);
		this.rollNumber = scan.nextInt();
	}
	public void setName() {
		Scanner scan = new Scanner(System.in);
		this.studentName = scan.nextLine();
	}
	public void setMarks() {
		Scanner scan = new Scanner(System.in);
		this.marks = scan.nextInt();
	}
	
	public int getRollNumber(){
		return rollNumber;
	}
	public String getName(){
		return studentName;
	}
	public int getMarks(){
		return marks;
	}
	
	Student(){
		setRollNumber();
		setName();
		setMarks();
	}
	Student(int num,String name,int mark){
		this.rollNumber = num;
		this.studentName = name;
		this.marks = mark;
	}

}
