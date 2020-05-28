package week4;

import java.util.Scanner;
/**
 *10진수 형태의 자연수를 입력하면 2진수로 변환 해 주는 프로그램이다.
 *입력한 값을 넘지 않는 2의 제곱수를 만들어서, 이걸 이용해 2진수로 변환한다.
 * @author choi0
 *
 */

public class Dec2Bin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하시오: ");
		int n = input.nextInt();
		int power = 1;

		while (power*2 <= n) {
			power *= 2;
		}

		for(int i=power ; i>0 ; i /= 2) {
			if (n >= i) {
				System.out.print("1");
				n -= i;
			}
			else {
				System.out.print("0");
			}
		}

		input.close();
	}

}


