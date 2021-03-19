import java.util.Scanner;

public class Teacher extends Person {

	private String classNo;
	private Double wage;
	private Double hour;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, String gender, String date, String address, String classNo, Double hour) {
		super(name, gender, date, address);
		this.classNo = classNo;
		this.hour = hour;
		this.wage = getWage();
	}

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public Double getWage() {
		char key = classNo.charAt(classNo.length()-1);
		if(key == 'G'|| key == 'H'||key == 'I'||key == 'K') {
			
		}else {
			
		}
		return wage;
	}

	public void setWage(Double wage) {
		this.wage = wage;
	}

	public Double getHour() {
		return hour;
	}

	public void setHour(Double hour) {
		this.hour = hour;
	}

	@Override
	public void inputInfo(Scanner sc) {
		super.inputInfo(sc);
		System.out.print("Nhap ten lop day : ");
		classNo = sc.next();
		System.out.print("Nhap luong vnd/h = ");
		wage = sc.nextDouble();
		System.out.print("Nhap so gio day trong thang = ");
		hour = sc.nextDouble();
	}


	@Override
	public String toString() {
		return "Teacher [ClassNo()=" + getClassNo() + ", Wage()=" + getWage() + ", Hour()=" + getHour()
				+ ", Name()=" + getName() + ", Gender()=" + getGender() + ", Date()=" + getDate()
				+ ", Address()=" + getAddress() + "]";
	}

	
	
}
