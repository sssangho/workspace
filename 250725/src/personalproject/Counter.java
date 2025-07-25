package personalproject;

import java.util.Scanner;

public class Counter {

    public static void main(String[] args) {
        boolean run = true;
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.printf("구매 하실 물건 금액을 입력해주세요.> ");

        while(run) {
            int x = Integer.parseInt(scan.nextLine());

            if(x == 0) {
                System.out.println("---------------------------------------");
                System.out.printf("총 금액 : %d원\n", sum);    
                System.out.println("---------------------------------------");

                while (true) {
                    System.out.println("1.카드 | 2.현금 ");
                    System.out.print("선택> ");
                    int set1 = Integer.parseInt(scan.nextLine());

                    switch(set1) {
                        case 1:
                            System.out.println("카드를 단말기에 꽂아주세요");
                            System.out.println("결제가 완료되었습니다.");
                            System.out.println("안녕히 가십시오.");
                            run = false;
                            break;
                        case 2:
                            System.out.print("지불 금액을 입력해주세요. > ");
                            int cash = Integer.parseInt(scan.nextLine());
                            if (cash >= sum) {
                                int change = cash - sum;
                                System.out.println("거스름돈 : " + change + "원");

                                int money[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
                                int count[] = new int[money.length];

                                for (int i = 0; i < money.length; i++) {
                                    count[i] = change / money[i];
                                    change %= money[i];

                                    if (count[i] > 0) {
                                        String changemoney = (money[i] >= 1000) ? money[i] + "원권" : money[i] + "원짜리";
                                        String unit = (money[i] >= 1000) ? "장" : "개";
                                        System.out.println(changemoney + "  " + count[i] + unit);
                                    }
                                }

                                System.out.println("결제가 완료되었습니다.");
                                System.out.println("안녕히 가십시오.");
                                run = false;
                                break;
                            } else {
                                System.out.println("현금이 부족합니다. 다시 카드나 현금을 선택해주세요.");
                                continue;
                            }
                    }
                    break; 
                }
            } else {
                sum += x;
                System.out.printf("총 금액 : %d원\n", sum);
                System.out.println("추가 하실 물건 금액을 입력해주세요.");
                System.out.printf("추가 구매 하실 물건이 없으면 0을 입력해주세요.> ");
            }
        }
    }
}
