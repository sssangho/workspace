package sec01.exam01;

public class ArrayTest {
	
	static int method1(String name) { // void 리턴값 x // public은 써도 되고 안 써도 
		System.out.println(name);
		return 100+30;
	}

	public static void main(String[] args) {
		int x = method1("홍길동");
		System.out.println(x);
		
		
		
		
		
		
//		int[] arr = new int[] {100, 200, 300, 400};
		int[] arr = {100, 200, 300, 400};
		String names[] = new String[5];

		for (int i=0; i < arr.length; i++) {
//		for (int i=0; i < names.length; i++) { // 예외 발생
			System.out.println(names[i]); // null 없다? 알 수 없다?
			System.out.println(arr[i]);
		}

	}

}
