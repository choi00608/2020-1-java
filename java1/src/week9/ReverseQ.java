package week9;

import java.util.Scanner;

public class ReverseQ {
	/**
	 * �迭���� Q��q�� �Էµɶ� ���� �Է� �޴´�
	 * �Էµ� �迭�� �������� ����ϰ� ��հ��� ����Ѵ�.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] a = new int[100];
		System.out.println("������ ���ʷ� �Է��ϼ���");
		System.out.println("�Է��� ��ġ����\'q\', Ȥ��\'Q\'�� �Է��Ͻÿ�:");

		int count = 0;
		int n = 0;

		String val;

		int sum = 0;
		while(count == 0) {

			val = input.next();

			if(val.equals("q") || val.equals("Q")) {
				count = 1;
			}
			else{
				a[n] = Integer.parseInt(val);
				sum = sum + a[n];
				n++;
			}

		}
		double m = 0;
		System.out.println("�迭�� �������� ���:");
		for(int j=n-1;j>=0;j--) {
			System.out.print(a[j] + " ");
			m = m + a[j];
		}
		System.out.println(" ");
		System.out.println("��հ�:" + (m/n));
		input.close();
	}

}


