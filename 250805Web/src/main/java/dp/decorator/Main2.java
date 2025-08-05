package dp.decorator;

public class Main2 {

	public static void main(String[] args) {
		ExeTimeCalculator cal1 = new ExeTimeCalculator(new ImpeCalculator());
		System.out.println(cal1.factorial(12));
		System.out.println("----------------------------------");
		ExeTimeCalculator cal2 = new ExeTimeCalculator(new RecCalculator());
		System.out.println(cal2.factorial(12));
	}
}
