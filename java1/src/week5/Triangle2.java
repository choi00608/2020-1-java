package week5;
/**
 * 아래와 같은 삼각형을 그려주는 프로그램이다.
 *   *
 *  **
 * ***
 *
 */
import java.util.Scanner;

public class Triangle2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("삼각형을 그리는 프로그램입니다.");
		System.out.print("삼각형의 크기를 얼마로 할까요? ");

		int numberOfStar = input.nextInt();

		input.close();

		for(int i = numberOfStar; i>=1; i--) {
			int j;
			for(j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(; j <= numberOfStar; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
