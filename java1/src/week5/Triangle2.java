package week5;
/**
 * �Ʒ��� ���� �ﰢ���� �׷��ִ� ���α׷��̴�.
 *   *
 *  **
 * ***
 *
 */
import java.util.Scanner;

public class Triangle2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("�ﰢ���� �׸��� ���α׷��Դϴ�.");
		System.out.print("�ﰢ���� ũ�⸦ �󸶷� �ұ��? ");

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
