import java.util.Scanner;

public class ScannerQuiz2 {

	public static void main(String[] args) {
		// 점수를 입력 받아서 A, B, C, F로 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력>");
		String inputData = sc.nextLine();
		int x = Integer.parseInt(inputData);
		
/*		if (x < 70) {
			System.out.println("F");
		} else if (x < 80) {
			System.out.println("C");
		} else if (x < 90) {
			System.out.println("B");
		} else {
			System.out.println("A");
		} */

		switch(x/10){
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("F");
				break;
		}
	}

}
