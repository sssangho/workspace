package nested;

public class A {
	class B{}  // 인스턴스 멤버 클래스
	static class C{} // 정적 멤버 클래스
	void method() { // 로컬 클래스
		class D{}
		D d1 = new D();
	}
	public static void main(String[] ar) {
//		A a1 = new A();
//		B b1 = a1.new B();
		B b1 = new A().new B();
		
		A.C c1 = new A.C();
	}
}
