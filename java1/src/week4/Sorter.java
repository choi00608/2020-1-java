package week4;

import java.util.Scanner;
/**
 * �Է��� 3 ���� ���� ��Ұ��踦 �� �� �ִ� ���α׷�
 * ���� ���� �� ���� ������ �ٲ� �ٽ� �Է� �ȴ�.
 * 3�� if ���� ����ߴ�.
 */

public class Sorter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("�� ���� ������ �Է��ϼ���: ");

		int i = input.nextInt();
		int j = input.nextInt();
		int k = input.nextInt();
		input.close();
		if(i<j) {
			if(i<k) {
				if(j<k) {
					System.out.println(i+" "+j+" "+k);
				}
				else 
					System.out.println(i+" "+k+" "+j);

			}
		}
		if(j<i) {
			if(j<k) {
				if(i<k) {
					System.out.println(j+" "+i+" "+k);
				}
				else 
					System.out.println(j+" "+k+" "+i);

			}
		}

		if(k<i) {
			if(k<j) {
				if(i<j) {
					System.out.println(k+" "+j+" "+i);
				}
				else 
					System.out.println(k+" "+i+" "+j);

			}
		}
		if(i==k) {
			if(k==j) {

				System.out.println(k+" "+j+" "+i);
			}


		}
	}
}


