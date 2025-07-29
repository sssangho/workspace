package sec04.exam04;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
//		Calculator myCalc = new Calculator(7,10); // 생성자 주입 방식
//		myCalc.x =7;
//		myCalc.y = 10;
		myCalc.setX(7);
		myCalc.setY(10);
		myCalc.execute();
	}

}
