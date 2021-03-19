import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TeacherTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu(sc);
	}
	
	public static void Menu(Scanner sc) {
		List<Teacher> teacherList = new ArrayList<Teacher>();
		boolean cont = true;
		int option;
		do {
			System.out.println("-------MENU--------");
			System.out.println("1. Nhap vao n giang vien");
			System.out.println("2. Hien thi tat ca giang vien");
			System.out.println("3. Hien thi giang vien co luong cao nhat");
			System.out.println("4. Thoat");
			System.out.print("-> Lua chon: ");
			option = sc.nextInt();
			switch (option) {
			case 4:
				cont = false;
				break;
			case 1: 
				System.out.print("Nhap so luong giang vien n = ");
				int n = sc.nextInt();
				for(int i =1;i<=n;i++) {
					System.out.println("Nhap thong tin giang vien so "+i);
					sc.nextLine();
					Teacher teacher = new Teacher();
					teacher.inputInfo(sc);
					teacherList.add(teacher);
				}
				System.out.println("Nhap thanh cong");
				break;
			case 2:
				System.out.println("Hien thi tat ca cac giang vien");
				for (Teacher teacher : teacherList) {
					System.out.println(teacher.showInfo());
				}
				System.out.println("Hien thi thanh cong");
				break;
			case 3:
				Collections.sort(teacherList, new Comparator<Teacher>() {
					@Override
					public int compare(Teacher o1, Teacher o2) {
						// TODO Auto-generated method stub
						return o2.getIncome().compareTo(o1.getIncome());
					}
				});
				System.out.println("Giang vien co luong cao nhat la "+teacherList.get(0));
				break;
			default:
				break;
			}
		}while(cont);
	}

}
