package object;

public class ExitEx {

	public static void main(String[] args) {
		// Wrapper(포장) 클래스
		int x = 100;
		Integer y = 200;
		int z = 0;
		z = x + y;
		System.out.println(z);
		
		// 문자열 앞뒤 공백 잘라내기 - trim()
		String s3 = "             ert                     ";
		System.out.println(s3.trim());
		
		// 대소문자가 다를 경우 비교하기  - equalsIgnoreCase()
		String s1 = "JAVA";
		String s2 = "java";
		System.out.println(s1.equalsIgnoreCase(s2));
		
		// String 클래스
		// 문자열 잘라내기 - substring()
		String ssn = "123456789";
		System.out.println(ssn.substring(0,6));
		
		// Class 객체 얻기
		System.out.println(ExitEx.class.getName());
		
		// 프로그램 종류 - exit()
		for (int i=0; i <10; i++) {
			if (i==5) {
				System.exit(0);
//				break;
			}
		}
		System.out.println("종료");
	}
}
