package week5;
/**
 * Ŀ��, ���̽�ũ��, ���� ���Ǳ� ���α׷�.
 * �������� �ŷ��� �����ϴ�.
 * �޴����� �� ��ü�� �� �� �ִ�.
 * ���� �޴����� �Լ��� ���εξ �����ϰ� ���̵��� �ߴ�.
 * ����� ����.
 */
import java.util.Scanner;

public class VendingMachine2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("���̽�ũ��, Ŀ��, ���Ḧ �Ĵ� ���Ǳ� �Դϴ�.");
		int count=0;



		int item =0;

		while(count==0) {

			menu();

			int n= input.nextInt();

			switch(n) {
			case 1:
				ice();
				item = input.nextInt();
				System.out.println(item +" ����, �����մϴ�.");
				break;
			case 2:
				coffee();
				item = input.nextInt();
				System.out.println(item +" ����, �����մϴ�.");
				break;
			case 3:
				stuff();
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
	public static void menu() {
		System.out.println("������� ���Ͻʴϱ�?");
		System.out.println("���̽�ũ��: 1");
		System.out.println("Ŀ         ��: 2");
		System.out.println("��         ��: 3");
		System.out.println("��         ��: 4");
		System.out.print("��ȣ   ����:  ");
	}
	public static void ice() {
		System.out.println("������ ��ðڽ��ϱ�?");
		System.out.println("�ٴҶ� ���̽�ũ��(1000��):");
		System.out.println("�Ƹ�� ���̽�ũ��(1400��):");
		System.out.println("��   �� ���̽�ũ��(1400��):");
		System.out.println("ȣ   �� ���̽�ũ��(1400��):");
		System.out.print("��ȣ����:  ");
	}
	public static void coffee() {
		System.out.println("������ ��ðڽ��ϱ�?");
		System.out.println("�Ƹ޸�ī��(1000��):");
		System.out.println("ī���(1400��):");
		System.out.println("����������(1400��):");
		System.out.print("��ȣ����:  ");
	}
	public static void stuff() {
		System.out.println("������ ��ðڽ��ϱ�?");
		System.out.println("����(1000��):");
		System.out.println("�������ֽ�(1400��):");
		System.out.println("�����ֽ�(1400��):");
		System.out.println("����(1400��):");
		System.out.print("��ȣ����:  ");
	}

}