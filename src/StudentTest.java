
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Menu(sc);
		sc.close();

	}
	
	public static void Menu(Scanner sc) {
		List<Student> studentList = new ArrayList<>();
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
				System.out.print("Nhap so sinh vien n = ");
				int n = sc.nextInt();
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
				for(Student student : studentList) {
					System.out.println(student.showInfo());
				}
				break;
			case 3: 
				Collections.sort(studentList,new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o2.getAverage().compareTo(o1.getAverage());
					}
					
				});
				System.out.println("SINH VIEN CO DIEM CAO NHAT: ");
				System.out.println(studentList.get(0).showInfo());
				System.out.println("SINH VIEN CO DIEM THAP NHAT: ");
				System.out.println(studentList.get(studentList.size()-1).showInfo());
				break;
			case 4:
				System.out.println("TIM KIEM SINH VIEN THEO MA SINH VIEN");
				System.out.print("Mhap MSSV = ");
				String mssv = sc.next();
				boolean status = false;
				for (Student student : studentList) {
					if(student.getStudentID().contains(mssv)) {
						status = true;
						System.out.println("Tim thanh cong");
						System.out.println(student.showInfo());
					}
				}
				if(status == false) System.out.println("Khong tim thay sinh vien nao!");
				break;
				
			case 5:
				System.out.println("HIEN THI SINH VIEN THEO THU TU TU [A-Z]");
				Collections.sort(studentList, new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o1.getName().compareTo(o2.getName());
					}
				});
				for (Student student : studentList) {
					System.out.println(student.showInfo());
				}
				break;
			case 6:
				Collections.sort(studentList,new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o2.getAverage().compareTo(o1.getAverage());
					}
					
				});
				System.out.println("SINH VIEN DAT HOC BONG:");
				for (Student student : studentList) {
					if(student.isScholarship()) {
						System.out.println(student.showInfo());
					}
				}
				break;
			default:
				break;
			}
		}while(cont);
	}

}
