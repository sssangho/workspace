package nested;

public class A1 {
	int field1;
	void method1() {}
	
	class B {
		void method() {
			field1 = 10;
			method1();
		}
	}
	static class C {
		void method() {
//			field1 = 10;
//			method1();
		}
	}
	class D {}
	public static void main(String[] args) {
//		A1.B b1 = new A1.B(); 
		C c1 = new A1.C();  // static이 붙었을때 사용
		A1.D d1 = new A1().new D();
	}
}
