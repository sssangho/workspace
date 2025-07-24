package sec01.exam01;

import java.util.Scanner;

class BankAccount1{
	private String name;
	private String account;
	private int balance;
	
	public BankAccount1(String name, String account, int balance) {
		this.name = name;
		this.account = account;
		this.balance = balance;
	}

	void deposit(int balance) { // 입금 기능
		this.balance += balance;
	}
	
	void withdraw(int balance) { // 출금 기능
		this.balance -= balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}

public class p183_7_객체 {
	public static void main(String[] args) {
//		String name = "홍길동";
//		String account = "H1234";
		boolean run = true;
		boolean login = false;
//		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		BankAccount1 ba = new BankAccount1("홍길동", "H1234", 10000);
	
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

		                if (strn.equals(ba.getName()) && stra.equals(ba.getAccount())) {
		                    System.out.println("로그인 성공");
		                    login = true;
		                } else {
		                    System.out.println("로그인 실패");
		                }
		                break;
		            case 2:
		                System.out.print("이름> ");
//		                ba.name = scanner.nextLine();
		                ba.setName(scanner.nextLine());
		                System.out.print("account> ");
//		                ba.account = scanner.nextLine();
		                ba.setAccount(scanner.nextLine());
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
		            	System.out.println("잔고"+ ba.getBalance());
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
