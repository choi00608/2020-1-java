package week4;

import java.util.Scanner;
/**
 * ATM
 * 5000������ ���� �Ա�, ���, �ܾ� Ȯ���� �� �� �ִ�.
 * ATM�� ���� �� ������ ���� ��� �� �� �ִ�.
 * @author choi0
 *
 */

public class ATMMachine2 {

	public static void main(String[] args) {
		
		double cash = 5000.0;
		Scanner input = new Scanner(System.in);

		int count=0;

		while(count==0) {
			System.out.println("ATM ���α׷��Դϴ�. ��ȣ�� �Է��ϼ���. ");
			System.out.println("�ܾ�Ȯ��:  1");
			System.out.println("��������:  2");
			System.out.println("��      ��:  3");
			System.out.println("��      ��:  4");
			System.out.print("��ȣ����:  ");
			int n = input.nextInt();
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
				count=1;
				break;
			default:
				System.out.println("�ùٸ��� ���� ��ȣ �Դϴ�.");
				break;

			}

		}
		input.close();
	}
}
