package week6;

import java.util.Scanner;
/**
 *10진수 형태의 자연수를 입력하면 2진수로 변환 해 주는 프로그램이다.
 *입력한 값을 넘지 않는 2의 제곱수를 만들어서, 이걸 이용해 2진수로 변환한다.
 * @author choi0
 *
 */

public class Dec2Bin2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하시오: ");

		int n = input.nextInt();
		int power = maxPower(n);

		System.out.println(toBinary(power,n));

		input.close();
	}
	/**
	 * 주어진 수 보다 작거나 같은 2의 거듭 제곱수들 중 가장 큰 수를 구한다.
	 * 주어진 수는 1 이상 정수여야 한다.
	 * 주어진 수가 10이면 8
	 * 주어진 수가 8이면 8
	 * 주어진 수가 22면 16
	 * 
	 * @param n 주어진 수
	 * @return n보다 작거나 같은 2의 거듭제곱수들 중 가장 큰 수.
	 */
	public static int maxPower(int n) {
		int power = 1;

		while (power*2 <= n) {
			power *= 2;
		}

		return power;

	}
	/*
	 * 십진수를 이진수로 변환하여 이진수 문자열(String)을 만든다.
	 * 십진수는 1이상 정수여야 한다.
	 * @param power 2의 거듭제곱수
	 * @param n 입력된 10진수
	 * @param binary 문자열
	 * @return 이진수 문자열.
	 */
	public static String toBinary(int power,int n) {

		String binary = "";

		for(int i=power ; i>0 ; i /= 2) {

			if (n >= i) {
				binary = binary + 1;
				n -= i;
			}

			else {
				binary = binary + 0;
			}	
		}
		return binary;
	}

}