package week9;

import java.util.Scanner;
/**
 * 10���� ���� �Է¹޾� �迭�� ������ �� �������� ����Ѵ�.
 * @author choi0
 *
 */
public class Reverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] a = new int[10];
		System.out.println("���� 10���� ���ʷ� �Է��ϼ���:");
		for(int i =0;i<=9;i++) {
			a[i] = input.nextInt();
		}
		System.out.println("�迭�� �������� ���:");
		for(int j=a.length - 1;j>=0;j--) {
			System.out.print(a[j] + " ");
		}

		input.close();
	}

}


