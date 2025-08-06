package sec01.exam04;
// exam04 : 중첩 클래스의 접근 제한 - 멤버 클래스에서 사용 제한
public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C {
		void method() {
			new A().field1 = 10;
			new A().method1();
			
			field2 = 10;
			method2();
		}
	}
}
