
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		Menu(sc);
		sc.close();

	}
	
	public static void Menu(Scanner sc) {
		List<Student> studentList = new ArrayList<>();
		int studentNumber = 0;
		boolean cont = true;
		do {
			System.out.println("----------------MENU-----------------");
			System.out.println("1. Nhap vao n sinh vien.");
			System.out.println("2. Hien thi thong tin tat ca cac sinh vien ra man hinh");
			System.out.println("3. Hien thi sinh vien co diem trung binh cao nhat va sinh vien co diem trung binh thap nhat.");
			System.out.println("4. Tim kiem sinh vien theo ma sinh vien.");
			System.out.println("5. Hien thi tat ca sinh vien theo thu tu A-Z");
			System.out.println("6. Hien thi tat ca sinh vien duoc hoc bong theo thu tu tu cao xuong thap");
			System.out.println("7. Thoat");
			System.out.print("Lua chon: ");
			int option = sc.nextInt();
			switch (option) {
			case 7:
				cont = false;
				break;
			case 1:
				System.out.println("Nhap so sinh vien n = ");
				int n = sc.nextInt();
				studentNumber += n;
				for(int i = 1;i<=n;i++) {
					System.out.println("Nhap thong tin sinh vien "+i);
					sc.nextLine();
					Student student = new Student();
					student.inputInfo(sc);
					studentList.add(student);
				}
				System.out.println("Nhap thanh cong!");
				break;
			case 2:
				System.out.println("Hien thi sinh vien: ");
				for(int i = 1; i<=studentNumber;i++) {
					studentList.get(i).showInfo();
				}
				break;
			case 3: 
				
				break;
			default:
				break;
			}
		}while(cont);
	}

}
