package sec01.ex02;

public class Ex002 {
	public static void main(String[] args) {
		boolean stop = true;
		
		if(stop) {
			System.out.println("종료");
		}
		
		
		float var3 = 5.123f;
		double var4 = 5.123;
		double var2 = 5e-2;
		System.out.println(var2);
		
		String str = "우리는 \"개발자\"입니다"; // 우리는 "개발자" 입니다
		System.out.println(str);
		
//		char var1 = 'A'; // A
//		int var1 = 'A'; // 65 
		char var1 = '\uac00'; // 가
		System.out.println(var1);

		int x1 = 10;
		int x2 = 010;
		int x3 = 0x10;
//		long x4 = 10e:
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		
		if (true) {
//			int v1 = 100;
			int v1;
			v1 = 400;
			System.out.println(v1);
		}
	}

}
