package sec01.exam01;

import java.util.Scanner;

public class p183_7번 {
	public static void main(String[] args) {
		String name = "홍길동";
		String account = "H1234";
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
	
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("로그인");
			System.out.println("---------------------------------------");
			System.out.print("이름> ");
			String str = scanner.nextLine();
			
//			if (str == name) {   // string은 ==으로 비교가 안됨
			if (str.equals(name)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
			}
			
			System.out.println("---------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------------");
			System.out.print("선택> ");
			int x = Integer.parseInt(scanner.nextLine());
			
			switch(x) {
				case 1:
					System.out.println("예금액>");
					balance += Integer.parseInt(scanner.nextLine());
					break;
				case 2:
					System.out.println("출금액>");
					balance -= Integer.parseInt(scanner.nextLine());
					break;
				case 3:
					System.out.println("잔고" + balance);
					break;
				case 4:
					run = false;
					break;
			}
		}
	System.out.println("프로그램 종료");
	}

}
