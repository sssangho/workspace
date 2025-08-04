package sec01.exam04;

public class B1Ex {

	public static void main(String[] args) {
		A1 a1 = new B1();
		a1.run();
//		((B1) a1).methodB1();
		B1 b1 = (B1) a1; // 강제로 타입 변환
		b1.methodB1();
	}
}
