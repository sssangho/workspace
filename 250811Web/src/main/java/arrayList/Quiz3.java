package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// ArrayList<Student> 생성
		ArrayList<Student> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print((i+1) + "학생 학번>");
			String sno = scan.nextLine();
			System.out.print((i+1) + "학생 이름>");
			String name = scan.nextLine();
			// Student 객체를 생성해서 ArrayList<Student>에 넣으세요.
			list.add(new Student(sno, name));
		}
		// ArrayList<Student> 출력
		for (Student stu : list) {
			System.out.println(stu);
		}
	}
}
