package week6;

import java.util.Scanner;
/**
 *10���� ������ �ڿ����� �Է��ϸ� 2������ ��ȯ �� �ִ� ���α׷��̴�.
 *�Է��� ���� ���� �ʴ� 2�� �������� ����, �̰� �̿��� 2������ ��ȯ�Ѵ�.
 * @author choi0
 *
 */

public class Dec2Bin2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�ڿ��� �ϳ��� �Է��Ͻÿ�: ");

		int n = input.nextInt();
		int power = maxPower(n);

		System.out.println(toBinary(power,n));

		input.close();
	}
	/**
	 * �־��� �� ���� �۰ų� ���� 2�� �ŵ� �������� �� ���� ū ���� ���Ѵ�.
	 * �־��� ���� 1 �̻� �������� �Ѵ�.
	 * �־��� ���� 10�̸� 8
	 * �־��� ���� 8�̸� 8
	 * �־��� ���� 22�� 16
	 * 
	 * @param n �־��� ��
	 * @return n���� �۰ų� ���� 2�� �ŵ��������� �� ���� ū ��.
	 */
	public static int maxPower(int n) {
		int power = 1;

		while (power*2 <= n) {
			power *= 2;
		}

		return power;

	}
	/*
	 * �������� �������� ��ȯ�Ͽ� ������ ���ڿ�(String)�� �����.
	 * �������� 1�̻� �������� �Ѵ�.
	 * @param power 2�� �ŵ�������
	 * @param n �Էµ� 10����
	 * @param binary ���ڿ�
	 * @return ������ ���ڿ�.
	 */
	public static String toBinary(int power,int n) {

		String binary = "";

		for(int i=power ; i>0 ; i /= 2) {

			if (n >= i) {
				binary = binary + 1;
				n -= i;
			}

			else {
				binary = binary + 0;
			}	
		}
		return binary;
	}

}