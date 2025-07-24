package sec01.exam01;

import java.util.Scanner;

class BankAccount{
	String name = "홍길동";
	String account = "H1234";
	int balance = 0;
	
	void deposit(int num) { // 입금 기능
		balance += num;
	}
	
	void withdraw(int num) { // 출금 기능
		balance -= num;
	}
	
}

public class p183_7_Method {
	public static void main(String[] args) {
//		String name = "홍길동";
//		String account = "H1234";
		boolean run = true;
		boolean login = false;
//		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		BankAccount ba = new BankAccount();
	
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

		                if (strn.equals(ba.name) && stra.equals(ba.account)) {
		                    System.out.println("로그인 성공");
		                    login = true;
		                } else {
		                    System.out.println("로그인 실패");
		                }
		                break;
		            case 2:
		                System.out.print("이름> ");
		                ba.name = scanner.nextLine();
		                System.out.print("account> ");
		                ba.account = scanner.nextLine();
		                break;
		            case 3:
		                run = false;
		                break;
		        }
		    } else {
		        System.out.println("---------------------------------------");
		        System.out.println("1.예금 | 2.출금 | 3.잔고확인 | 4.로그아웃");
		        System.out.print("선택> ");
		        int num = Integer.parseInt(scanner.nextLine());

		        switch(num) {
		            case 1:
		                System.out.print("예금액> ");
		                num = Integer.parseInt(scanner.nextLine());
//						balance += num;
		                ba.deposit(num);
		                break;
		            case 2:
		                System.out.print("출금액> ");
		                num = Integer.parseInt(scanner.nextLine());
//						balance += num;
		                ba.withdraw(num);
		                break;
		            case 3:
		            	System.out.println("잔고"+ ba.balance);
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
