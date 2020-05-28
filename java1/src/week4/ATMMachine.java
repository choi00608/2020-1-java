package week4;

import java.util.Scanner;
/**
 * ATM
 * 5000������ ���� �Ա�, ���, �ܾ� Ȯ���� �� �� �ִ�.
 * �ѹ��� �� �� �ִ�.
 * @author choi0
 *
 */

public class ATMMachine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("ATM ���α׷��Դϴ�. ��ȣ�� �Է��ϼ���. ");
		System.out.println("�ܾ�Ȯ��:  1");
		System.out.println("��������:  2");
		System.out.println("��      ��:  3");
		System.out.println("��      ��:  4");
		System.out.print("��ȣ����:  ");
		int n = input.nextInt();
		double cash = 5000.0;
		switch(n) {
		case 1:
			System.out.println("�ܾ���"+cash+"���Դϴ�.");
			break;
		case 2:
			System.out.print("�ݾ���? ");
			int out = input.nextInt();
			if(out>cash) {
				System.out.println("���� ���ڶ��ϴ�.");
				break;
			}
			cash = 5000.0-out;
			System.out.println("���� ��������.");
			System.out.println("�ܾ���"+cash+"���Դϴ�.");
			break;
		case 3:
			System.out.print("�ݾ���? ");
			int in = input.nextInt();
			cash = 5000.0+in;
			System.out.println("�ܾ���"+cash+"���Դϴ�.");
			break;
		case 4:
			System.out.println("�����մϴ�.");
			break;
		default:
			System.out.println("�ùٸ��� ���� ��ȣ �Դϴ�.");
			System.exit(-1);

		}
		input.close();
	}

}
