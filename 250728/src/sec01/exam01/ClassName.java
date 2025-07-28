package sec01.exam01;

class ClassName2 {
	int field1;
	void method1() {
	}
	
	static int field2;
	static void method2() {
	}
}
public class ClassName {
//	int field1;
//	void method1() {
//	}
//	
//	static int field2;
//	static void method2() {
//	}
	
	public static void main(String[] ar) {
//		method1(); // 오류
		ClassName2.method2(); // static이 써져 있으면 컴파일되면서 메모리에 올라가서 어디든 쓸 수 있음
		
		ClassName2 cn2 = new ClassName2();
		cn2.method1();
		
		ClassName2 cn3 = new ClassName2();
		cn3.method1();
		
	}

}
