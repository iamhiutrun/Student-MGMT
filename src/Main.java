import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		student.inputInfo(sc);
		System.out.println(student.showInfo());
		sc.close();

	}

}
