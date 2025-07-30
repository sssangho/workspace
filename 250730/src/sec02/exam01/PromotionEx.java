package sec02.exam01;

class A {}
class B extends A {}  // 부모가 생성자를 만들게 되면 자식도 생성자를 만들어야 한다.
class C extends B {}

class D extends B {}
class E extends C {}

public class PromotionEx { // 다형성

	public static void main(String[] args) {
//		B b = new B();
//		A a1 = b;
//		C c = new C();
//		A a2 = c;  
		D d = new D(); // 위의 코드들을 주석처리해도 오류가 나지 않는다.
		A a3 = d;
		B b1 = d;
		A d1 = new D();
		B d2 = new D(); //상속과 관련되어있고 다형성이다.
//		B e1 = e; // 상속관계에 있지 않기 때문에 오류 발생
	}
}
