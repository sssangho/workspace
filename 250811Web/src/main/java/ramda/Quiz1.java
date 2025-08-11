package ramda;

public class Quiz1 {

	public static void main(String[] args) {
		GreaterThan gt = (x, y) -> {
			if (x > y) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(gt.result(30, 40));
		
		GreaterThan gt1 = (x, y) -> {
			 return (x>y) ? true : false;
		};
		System.out.println(gt1.result(30, 40));
		
		GreaterThan gt2 = (x, y) -> (x>y) ? true : false;
		System.out.println(gt2.result(30, 40));
		
		
		int x = 10;
		int y = 30;
		if (x > y) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		// 삼항연산자
		boolean z = ((x>y) ? true : false);
		System.out.println(z);
	}
}
