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
		
		do {
			System.out.print("Student ID = ");
			this.studentID = sc.nextLine();
		}while(!checkStudentID(this.studentID));
		
		do {
			System.out.print("Average = ");
			this.average = sc.nextDouble();
		}while(!checkAverage(this.average));
	
		do {
			System.out.print("Email = ");
			this.email = sc.next();
		}while(!checkEmail(this.email));
	}
	
	@Override
	public String showInfo() {
		// TODO Auto-generated method stub
		return "Student [, " +super.showInfo() +"studentID=" + studentID + ", average=" + average + ", email=" + email + "]" ;
	}

	private boolean checkStudentID(String studentID) {
		if(studentID.length()>8 || studentID.length()<8) {
			System.out.println("StudentID must have to 8 digits. Please try again!");
			return false;
		}
		return true;
	}
	
	private boolean checkAverage(Double average) {
		if(average<0 || average >10) {
			System.out.println("Average must have in range(0.0-10.0). Please try again!");
			return false;
		}
		return true;
	}
	
	private boolean checkEmail(String email) {
		if(!email.contains("@")) {
			System.out.println("StudentID must have to contain '@' digit. Please try again!");
			return false;
		}
		if(email.contains(" ")) {
			System.out.println("StudentID must have not to contain ' ' digit. Please try again!");
			return false;
		}
		return true;
	}
	
	
	private boolean isScholarship(Double average) {
		if(average > 8)
		return true;
		return false;
	}
	
	

}
