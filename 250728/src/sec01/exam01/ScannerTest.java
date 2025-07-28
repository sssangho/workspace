package sec01.exam01;

import java.util.Scanner;

public class ScannerTest {
	
	String str;
	
	void method(Scanner scan) {
		System.out.print("입력>");
		str = scan.nextLine();

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		ScannerTest.method(scan); // method에 static을 씀
		ScannerTest sct = new ScannerTest();
		sct.method(scan);
		System.out.println(sct.str);

		

	}

}
