package week3;

import java.util.Scanner;

public class SumAverage2 {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("����� ���ϴ� ���α׷�");

		System.out.println("0 �̻� ������ ���� �� �Է��Ͻÿ�.");

		System.out.println("�Է��� ��ġ���� ���� ������ �Է��Ͻÿ�.");
		int n =input.nextInt();

		int count= 0;
		int positive = 0;

		if(n>=0) {
			count++;
			positive = 1;
		}

		int sum = n;

		while(n>=0) {
			n =input.nextInt();
			if(n>=0) {
				sum = sum + n;
				count++;
			}
		}
		input.close();
		System.out.println("�Էµ� 0 �̻��� ���� = " + count);
		if(positive==1) {
			System.out.println("������ �� = " + sum);
			double rSum = sum;
			double avr = rSum/count;

			System.out.printf("��� = %.2f" ,avr);

		}
	}
}
