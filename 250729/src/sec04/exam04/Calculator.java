package sec04.exam04;

public class Calculator { // 올바른 클래스 구현해 보세요.
	
	void method() {}
	int method(int x) {return 0;}  // 매소드 오버로딩 (매개변수의 타입, 개수, 순서가 달라야함)
	
 	// 필드
	private int x, y;
	
	public Calculator() {}
	// 생성자
	public Calculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public void setX(int x) {
		if (x < 0) {
			this.x = -x;
			return;
		}
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// 메소드
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
		

	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum / 2;
		return result;
	}
		
	void execute() {
		double result = avg(x, y);
		println("실행결과: " + result);
	}
		
	void println(String message) {
		System.out.println(message);
	}
}
