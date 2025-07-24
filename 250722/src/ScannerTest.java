import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력>");
		String inputData = sc.nextLine();
		System.out.println(Integer.parseInt(inputData) + 10);
		//int value = Integer.parseInt(inputData);
		//System.out.println(value+10);

	}

}