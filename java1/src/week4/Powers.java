package week4;

import java.util.Scanner;
/**
 * 2의 몇제곱 까지 입력할지 정하면  그 수 까지 입력 해 주는 프로그램이다.
 * 이중 for문을 활용하였다.
 * @author choi0
 *
 */

public class Powers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("2의 몇제곱 까지 구할까요? ");

		int square = input.nextInt();

		input.close();

		for(int i=0;i<=square;i++) {
			for(int j=0;j<=0;j++) {
				System.out.print("2의 "+ i + "제곱: "+(int)Math.pow(2,i));
			}
			System.out.println();
		}
	}

}
