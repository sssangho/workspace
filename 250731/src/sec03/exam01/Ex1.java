package sec03.exam01;

abstract class A { // 추상 클래스는 객체 생성 불가능
	abstract int method(String s); // 추상 메소드 : 강제적으로 메소드를 재정의
}

class B extends A {

	@Override
	int method(String s) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class Ex1 {

	public static void main(String[] args) {
//		A a = new A();  // new 연산자를 이용해서 객체를 만들지 못함
		A a = new B();

	}

}
