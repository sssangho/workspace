package ramda;

public class Main {

	public static void main(String[] args) {
//		MyFunctionalInterface fi =  (e, s) -> { 
//			System.out.println(e + s);
//		};
//		
//	fi.method(100, "가나다");
		
		MyFunctionalInterface fi = (x, y) -> {
			return x + y;
		};
		String str = fi.method(100, "홍길동");
		System.out.println(str);
	}
}
