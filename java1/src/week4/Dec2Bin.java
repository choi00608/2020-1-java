package week4;

import java.util.Scanner;
/**
 *10���� ������ �ڿ����� �Է��ϸ� 2������ ��ȯ �� �ִ� ���α׷��̴�.
 *�Է��� ���� ���� �ʴ� 2�� �������� ����, �̰� �̿��� 2������ ��ȯ�Ѵ�.
 * @author choi0
 *
 */

public class Dec2Bin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�ڿ��� �ϳ��� �Է��Ͻÿ�: ");
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


