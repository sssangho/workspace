package sec01.exam01;

import java.util.Scanner;

public class ArrayTest1 {
	
	// 점수의 개수를 입력받아서 배열을 생성해 보세요
	// Scanner, nextLine() 사용하여 점수 3개를 입력받고 출력해 보세요
	public static void main(String[] args) {
//		int[] score;
//		score = new int[3];
		Scanner sc2 = new Scanner(System.in);
		int count = Integer.parseInt(sc2.nextLine());
		
		int score[] = new int[count]; // 정수 배열 3개 생성
		
		int sum = 0;
		double div = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <score.length; i++) {
			System.out.printf("%d 점수>", i);
			score[i] = Integer.parseInt(sc.nextLine());
			sum += score[i];
		}
		div = sum / (double)score.length;
		System.out.printf("총점: %d, 평균: %f\n", sum, div);

//		for(int i = 0; i <score.length; i++) {
//			sum += score[i];
//			div = sum/score.length;
//		}
		
//		System.out.println("총합 : " + sum);
//		System.out.println("평균 : " + div);
		
//		System.out.println(score.length);
//		
//		for (int i=0; i < score.length; i++) {
//			System.out.printf("인덱스 %d -> %d\n",i,score[i]);
//
//		}
	}

}
