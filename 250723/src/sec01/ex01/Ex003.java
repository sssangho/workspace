package sec01.ex01;

public class Ex003 {
	public static void main(String[] args) {
		String s1 = "100";
		int x100 = Integer.parseInt(s1);
		System.out.println(x100);
		
			
		int x5 = 1;
		int y5 = 2;
		double z = x5/(double)y5;
		System.out.println(z);
		
		float d1 = 1.5f + 100;
//		double d1 = 1.5 + 100;
		
		
		int x1 = 44022;
		byte charval = (byte) x1;
		System.out.println(charval);
		
		int x;
		long y = 3000000000L;
		x = (int) y;
		System.out.println(x);
	}

}
