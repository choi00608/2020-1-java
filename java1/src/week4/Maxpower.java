package week4;

import java.util.Scanner;
/**
 * n ���� �۰ų� ���� 2�� �ŵ����� �� �� ���� ū �� �� ã�� ���α׷��̴�.
 * 2�� ������ ���� �ϳ��ϳ� ��� �ϴٰ� ���ϴ� ���� ������ ��� �Ѵ�.
 * @author choi0
 *
 */

public class Maxpower {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�ڿ��� �ϳ��� �Է��Ͻÿ�: ");

		int n = input.nextInt();

		input.close();

		for(int i=0;i<=n;i++) {
			for(int j=0;j<=0;j++) {
				if(n<(int)Math.pow(2,i)) {
					System.out.print(n+"���� �۰ų� ���� 2�� �ŵ������� �� ���� ū �� = "+(int)Math.pow(2,i-1));
					System.exit(-1);
				}
			}
		}
	}

}
