package test1;

import java.util.HashMap;
import java.util.Map;

class Users {
	String name;
	String phone;
	
	public Users(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}	
}

public class HashEx {

	public static void main(String[] args) {
		Map<String, Users> map = new HashMap<>();
		map.put("100", new Users("홍길동","010-1234-5673"));
		map.put("200", new Users("홍길철","010-5455-5671"));
		map.put("300", new Users("홍길순","010-1234-5252"));
		
		System.out.println(map.get("200").name);
		System.out.println(map.get("200").phone);
	}
}
