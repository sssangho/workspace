package sec01.exam01;

public class Member {
	String name;
	String phone;
	String address;
	int sal;
	
	Member() {
		this("사용자", "010-1234-5678", "성남", 500);
	}
	
	
	public Member(String name, String phone) {
		this(name, phone, "서울", 100);
	}

	public Member(String name, String phone, String address) {
		this(name, phone, address, 500);
	}


	public Member(String name, String phone, String address, int sal) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.sal = sal;
		System.out.println("생성 완료!!!");
	}


	public static void main(String[] ar) {
		Member member = new Member();
	}
}
