package ramda;

public class FacTest {
	
	int fac(int x) {
		if (x == 1) {
			return 1;
		} else {
			return x * fac(x - 1);
		}
	}
	
	int fac1(int x) {
		return x == 1 ? 1 : x * fac(x - 1);
	}
	
	public static void main(String[] args) {
		FacTest ft = new FacTest();
		System.out.println(ft.fac(5));
		System.out.println(ft.fac1(5));	
	}
}
