package week5;
/**
 * �Ʒ��� ���� �ﰢ���� �׷��ִ� ���α׷��̴�.
 * ***
 *  **
 *   *
 *
 */
import java.util.Scanner;

public class Triangle3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("�ﰢ���� �׸��� ���α׷��Դϴ�.");
		System.out.print("�ﰢ���� ũ�⸦ �󸶷� �ұ��? ");

		int numberOfStar = input.nextInt();

		input.close();
		paintingStars(numberOfStar);
		/**
		 * �׸��� ���� �ﰢ���� ũ�⸦ �޾Ƽ� 
		 * ���Ͱ��� �ﰢ���� �׸� �� �ְ� �ؼ��� ������ ��� �Լ��̴�.
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