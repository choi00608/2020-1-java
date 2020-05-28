package week4;

import java.util.Scanner;
/**
 * n 보다 작거나 같은 2의 거듭제곱 수 중 가장 큰 수 를 찾는 프로그램이다.
 * 2의 제곱수 값을 하나하나 계산 하다가 원하는 값이 나오면 출력 한다.
 * @author choi0
 *
 */

public class Maxpower {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하시오: ");

		int n = input.nextInt();

		input.close();

		for(int i=0;i<=n;i++) {
			for(int j=0;j<=0;j++) {
				if(n<(int)Math.pow(2,i)) {
					System.out.print(n+"보다 작거나 같은 2의 거듭제곱수 중 가장 큰 수 = "+(int)Math.pow(2,i-1));
					System.exit(-1);
				}
			}
		}
	}

}
