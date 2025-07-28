package sec01.exam01;import java.lang.reflect.Array;

public class StringTest {

	public static void main(String[] args) {
//		String str1 = "자바";
//		String str2 = "자바";  // if (str1 == str2) 결과값 : 같다
		
		String str1 = new String("자바");
		String str2 = new String("자바");  // if (str1 == str2) 결과값 : 다르다
		
//		if (str1 == str2) {
		if (str1.equals(str2)) { // 문자열을 비교할때는 equals를 사용
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}

		
		String str3 = null;
		String str4 = null;
		
		if (str3 != null && str1.equals(str4)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = new int[4];
		
		for (int i =0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for (int a : arr2) {
			System.out.println(a);
		}
		
//		for (int i =0; i < arr1.length; i++) {
//			System.out.println(arr2[i]);
//		}
	}

}