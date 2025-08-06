package sec01.exam03;
// 중첩 클래스의 접근 제한 - 바깥 필드와 메소드에서 사용제한
public class A {
	
	class B {}  // 인스턴스 멤버 클래스
	static class C {} // 정적 멤버 클래스
	
	// 필드
	B field1 = new B();
	C field2 = new C();
	
	// 정적 필드 초기화
//	static B field3 = new B(); // 외부 클래스 인스턴스 없이 생성되는 static 필드 초기화에는 사용할 수 없음
	static B field3 = new A().new B();
	static C field4 = new C();
	
	// 인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	static void method2() {
		B var1 = new A().new B();
		C var2 = new C();
	}
}
