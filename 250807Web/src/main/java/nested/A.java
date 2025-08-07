package nested;

public class A {
	B field1 = new B(); // static이면 클래스도 static이어야 한다.
	void method() {
		B v1 = new B();
	}
	class B{}  // 상속 관계 아님
}
