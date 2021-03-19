import java.util.Scanner;

public class Person {

	private String name;
	private String gender;
	private String date;
	private String address;
	
	public Person() {
		
	}
	
	public Person(String name, String gender, String date, String address) {
		this.name = name;
		this.gender = gender;
		this.date = date;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void inputInfo(Scanner sc) {
		System.out.print("Name = ");
		this.name = sc.nextLine();
		System.out.print("Gender = ");
		this.gender = sc.nextLine();
		System.out.print("Date = ");
		this.name = sc.nextLine();
		System.out.print("Address = ");
		this.address = sc.nextLine();
	}


	public String showInfo() {
		return "Person [name=" + name + ", gender=" + gender + ", date=" + date + ", address=" + address + "]";
	}


	

}
