import java.util.Scanner;

public class Student extends Person {

	private String studentID;
	private Double average;
	private String email;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String gender, String date, String address, String studentID, Double average, String email) {
		super(name, gender, date, address);
		// TODO Auto-generated constructor stub
		this.average = average;
		this.email = email;
		this.studentID = studentID;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public Double getAverage() {
		return average;
	}

	public void setAverage(Double average) {
		this.average = average;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public void inputInfo(Scanner sc) {
		// TODO Auto-generated method stub
		super.inputInfo(sc);
		System.out.println("Student ID = ");
		this.studentID = sc.nextLine();
		System.out.println("Average = ");
		this.average = sc.nextDouble();
		System.out.println("Email = ");
		sc.next();
		this.email = sc.nextLine();
	}
	
	@Override
	public String showInfo() {
		// TODO Auto-generated method stub
		return "Student ["+super.showInfo() +"studentID=" + studentID + ", average=" + average + ", email=" + email + "]" ;
	}

	
	
	

}
