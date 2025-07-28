package sec01.exam01;

public class NPEtest {

	public static void main(String[] args) {
//		int[] arr = null;  // 오류
		int[] arr = new int[3];
		arr[0] = 100; 

	}

}
