package sec01.exam02;

public class Exception2 {
	
	public static void check() throws ArithmeticException {  // 실행 예외
		System.out.println("내부 메서드");
		int div = 5 / 0;
	}

	public static void main(String[] args) {
		try {
			check();
		} catch (ArithmeticException e)	{
			System.out.println("어떤 수를 0으로 나누면 안됩니다.");
		}
	}
}
