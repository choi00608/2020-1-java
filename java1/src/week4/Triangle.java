package week4;

import java.util.Scanner;
/**
 * 사용자가 삼각형의 크기를 정하여 그릴 수 있는 프로그램
 * 아래와 같이 나온다.
 *
 ***
 ****
 *****
 */

public class Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("삼각형을 그리는 프로그램입니다.");
		System.out.print("삼각형의 크기를 얼마로 할까요? ");
		System.out.print("1 이상의 정수를 입력하세요: ");

		int numberOfStar = input.nextInt();

		input.close();

		for(int i=0;i<=numberOfStar-1;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
