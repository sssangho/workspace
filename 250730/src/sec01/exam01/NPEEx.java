package sec01.exam01;

class AnyClass {
	void method1() {}
}

public class NPEEx {

	public static void main(String[] args) {
		AnyClass anyClass = null;
		anyClass.method1();
		
//		String data = null;  // null이 아닌 ""으로 바꾸면 실행예외가 안된다.
//		System.out.println(data.toString());
	}
}
