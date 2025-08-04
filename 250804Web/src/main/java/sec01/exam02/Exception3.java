package sec01.exam02;

public class Exception3 {
	
	public static void method() throws ClassNotFoundException {
		Class.forName("배가 고파용 배가고파용");
	}

	public static void main(String[] args) {
		try {
			method();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
