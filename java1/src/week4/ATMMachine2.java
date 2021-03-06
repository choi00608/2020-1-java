package week4;

import java.util.Scanner;
/**
 * ATM
 * 5000원에서 돈을 입금, 출금, 잔액 확인을 할 수 있다.
 * ATM을 종료 할 때까지 께속 사용 할 수 있다.
 * @author choi0
 *
 */

public class ATMMachine2 {

	public static void main(String[] args) {
		
		double cash = 5000.0;
		Scanner input = new Scanner(System.in);

		int count=0;

		while(count==0) {
			System.out.println("ATM 프로그램입니다. 번호를 입력하세요. ");
			System.out.println("잔액확인:  1");
			System.out.println("현금인출:  2");
			System.out.println("입      금:  3");
			System.out.println("종      료:  4");
			System.out.print("번호선택:  ");
			int n = input.nextInt();
			switch(n) {
			case 1:
				System.out.println("잔액은"+cash+"원입니다.");
				break;
			case 2:
				System.out.print("금액은? ");
				int out = input.nextInt();
				if(out>cash) {
					System.out.println("돈이 모자랍니다.");
					break;
				}
				cash = 5000.0-out;
				System.out.println("돈을 받으세요.");
				System.out.println("잔액은"+cash+"원입니다.");
				break;
			case 3:
				System.out.print("금액은? ");
				int in = input.nextInt();
				cash = 5000.0+in;
				System.out.println("잔액은"+cash+"원입니다.");
				break;
			case 4:
				System.out.println("감사합니다.");
				count=1;
				break;
			default:
				System.out.println("올바르지 않은 번호 입니다.");
				break;

			}

		}
		input.close();
	}
}
