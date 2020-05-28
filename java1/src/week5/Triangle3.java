package week5;
/**
 * 아래와 같은 삼각형을 그려주는 프로그램이다.
 * ***
 *  **
 *   *
 *
 */
import java.util.Scanner;

public class Triangle3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("삼각형을 그리는 프로그램입니다.");
		System.out.print("삼각형의 크기를 얼마로 할까요? ");

		int numberOfStar = input.nextInt();

		input.close();
		paintingStars(numberOfStar);
		/**
		 * 그리고 싶은 삼각형의 크기를 받아서 
		 * 위와같은 삼각형을 그릴 수 있게 해수는 수식이 담긴 함수이다.
		 *
		 */
	}
	public static void paintingStars(int numberOfStar) {
		for(int i = numberOfStar; i>=1; i--) {
			int j;
			for(j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
			for(; j <= numberOfStar; j++) {
				System.out.print(" ");
			}

		}
	}
}