package week5;
/**
 * Ŀ��, ���̽�ũ��, ���� ���Ǳ� ���α׷�.
 * �������� �ŷ��� �����ϴ�.
 * �޴����� �� ��ü�� �� �� �ִ�.
 */
import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("���̽�ũ��, Ŀ��, ���Ḧ �Ĵ� ���Ǳ� �Դϴ�.");
		int count=0;

		while(count==0) {
			System.out.println("������� ���Ͻʴϱ�?");
			System.out.println("���̽�ũ��: 1");
			System.out.println("Ŀ         ��: 2");
			System.out.println("��         ��: 3");
			System.out.println("��         ��: 4");
			System.out.print("��ȣ   ����:  ");
			int n = input.nextInt();
			int item;
			switch(n) {
			case 1:
				System.out.println("������ ��ðڽ��ϱ�?");
				System.out.println("�ٴҶ� ���̽�ũ��(1000��):");
				System.out.println("�Ƹ�� ���̽�ũ��(1400��):");
				System.out.println("��   �� ���̽�ũ��(1400��):");
				System.out.println("ȣ   �� ���̽�ũ��(1400��):");
				System.out.print("��ȣ����:  ");
				item = input.nextInt();
				System.out.println(item +" ����, �����մϴ�.");
				break;
			case 2:
				System.out.println("������ ��ðڽ��ϱ�?");
				System.out.println("�Ƹ޸�ī��(1000��):");
				System.out.println("ī���(1400��):");
				System.out.println("����������(1400��):");
				System.out.print("��ȣ����:  ");
				item = input.nextInt();
				System.out.println(item +" ����, �����մϴ�.");
				break;
			case 3:
				System.out.println("������ ��ðڽ��ϱ�?");
				System.out.println("����(1000��):");
				System.out.println("�������ֽ�(1400��):");
				System.out.println("�����ֽ�(1400��):");
				System.out.println("����(1400��):");
				System.out.print("��ȣ����:  ");
				item = input.nextInt();
				System.out.println(item +" ����, �����մϴ�.");
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