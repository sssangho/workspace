package sec01.exam01;

import java.util.Scanner;

public class P183_7_로그인_회원가입 { // 회원가입 추가
	public static void main(String[] args) {
		String name = "홍길동";
		String account = "H1234";
		boolean run = true;
		boolean login = false;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
	
		while(run) {
		    if (!login) {
		        System.out.println("---------------------------------------");
		        System.out.println("1.로그인 | 2.회원가입 | 3.종료");
		        System.out.println("---------------------------------------");
		        System.out.print("선택> ");
		        int num = Integer.parseInt(scanner.nextLine());

		        switch(num) {
		            case 1:
		                System.out.print("이름> ");
		                String strn = scanner.nextLine();
		                System.out.print("account> ");
		                String stra = scanner.nextLine();

		                if (strn.equals(name) && stra.equals(account)) {
		                    System.out.println("로그인 성공");
		                    login = true;
		                } else {
		                    System.out.println("로그인 실패");
		                }
		                break;
		            case 2:
		                System.out.print("이름> ");
		                name = scanner.nextLine();
		                System.out.print("account> ");
		                account = scanner.nextLine();
		                break;
		            case 3:
		                run = false;
		                break;
		        }
		    } else {
		        System.out.println("---------------------------------------");
		        System.out.println("1.예금 | 2.출금 | 3.잔고확인 | 4.로그아웃");
		        System.out.print("선택> ");
		        int x = Integer.parseInt(scanner.nextLine());

		        switch(x) {
		            case 1:
		                System.out.print("예금액> ");
		                balance += Integer.parseInt(scanner.nextLine());
		                break;
		            case 2:
		                System.out.print("출금액> ");
		                balance -= Integer.parseInt(scanner.nextLine());
		                break;
		            case 3:
		                System.out.println("잔고: " + balance);
		                break;
		            case 4:
		                login = false;
		                System.out.println("로그아웃 되었습니다.");
		                break;
		        }
		    }
		}
	}
}