package sec01.exam02;

public class A {
	A() {
		System.out.println("A 생성자");
	}
	static class B{
		B() {
			System.out.println("B 생성자");
		}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {
			System.out.println("method2");
		}
	}
	
	public static void main(String[] args) {
		A.B b = new A.B();
		b.method1();
		A.B.method2();
	}
}