package week4;

import java.util.Scanner;
/**
 * 2�� ������ ���� �Է����� ���ϸ�  �� �� ���� �Է� �� �ִ� ���α׷��̴�.
 * ���� for���� Ȱ���Ͽ���.
 * @author choi0
 *
 */

public class Powers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("2�� ������ ���� ���ұ��? ");

		int square = input.nextInt();

		input.close();

		for(int i=0;i<=square;i++) {
			for(int j=0;j<=0;j++) {
				System.out.print("2�� "+ i + "����: "+(int)Math.pow(2,i));
			}
			System.out.println();
		}
	}

}
