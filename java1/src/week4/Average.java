package week4;

import java.util.Scanner;
/**
 * ������� ����� �� �ϴ� ���α׷��̴�.
 * ���ϴ� ��ŭ ���ڸ� �Է��ϰ�, �Է��� ��ġ�� ���� �� 0 ������ ���� �Է��ϸ� 
 * ���� �Է��� ������ �Է��� ���ڵ��� ����� �����ش�.
 *
 */

public class Average {

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("������� ����� ���ϴ� ���α׷��Դϴ�.");

		System.out.println("�Է��� ��ġ���� 0 ������ ���� �Է��Ͻÿ�");

		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		double n =input.nextDouble();

		int count= 0;
		int positive = 0;

		if(n>0) {
			count++;
			positive = 1;
		}

		double sum = n;


		while(n>0) {
			System.out.print("���ڸ� �Է��Ͻÿ�: ");
			n =input.nextDouble();
			if(n>0) {
				sum = sum + n;
				count++;
			}
		}
		input.close();

		if(positive==1) {

			double avr = sum/count;

			System.out.printf("��� = %.2f" ,avr);
		}
		if(positive==0) {
			System.out.println("����� �ϳ��� �Էµ��� �ʾҽ��ϴ�.");
		}
	}
}

