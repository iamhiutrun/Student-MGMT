import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		sc.close();

	}
	
	public static void Menu() {
		while(true) {
			System.out.println("1. Nhap vao n sinh vien.");
			System.out.println("2. Hien thi thong tin tat ca cac sinh vien ra man hinh");
			System.out.println("3. Hien thi sinh vien co diem trung binh cao nhat va sinh vien co diem trung binh thap nhat.");
			System.out.println("4. Tim kiem sinh vien theo ma sinh vien.");
			System.out.println("5. Hien thi tat ca sinh vien theo thu tu A-Z");
			System.out.println("6. Hien thi tat ca sinh vien duoc hoc bong theo thu tu tu cao xuong thap");
		}
	}

}
