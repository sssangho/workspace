import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력>");
		String inputData = sc.nextLine();
		int x = Integer.parseInt(inputData);
	
		//printf 사용법
		System.out.printf("%d\n", x);
		System.out.printf("%s", inputData);
		
		// 입력 받은 값을 양수,0,음수로 구분
		if(x > 0) {
			System.out.println("양수");
		} else if (x == 0) {
			System.out.println(0);
		} else {
			System.out.println("음수");
		}	
		
		//1부터 10까지 합
		int i = 0;
		int sum=0;
		
		// for문
		for(i=0;i<=10;i++) {
				sum =sum + i;
		}
		System.out.printf("합계 : %d\n",sum);
		
		// while문
		while (i <=10 ) {
			sum += i;
			i++;
		}
		System.out.printf("합계 : %d\n",sum);
		
		//do-while문 (한번이라도 실행하기 위해서 사용)
		do {
			sum += i;
			i++;
		}while (i<=10);
		System.out.printf("합계 : %d\n",sum);
		
	}

}
