package week4;

import java.util.Scanner;
/**
 * ����ڰ� �ﰢ���� ũ�⸦ ���Ͽ� �׸� �� �ִ� ���α׷�
 * �Ʒ��� ���� ���´�.
 *
 ***
 ****
 *****
 */

public class Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("�ﰢ���� �׸��� ���α׷��Դϴ�.");
		System.out.print("�ﰢ���� ũ�⸦ �󸶷� �ұ��? ");
		System.out.print("1 �̻��� ������ �Է��ϼ���: ");

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
