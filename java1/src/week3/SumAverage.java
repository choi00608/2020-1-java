package week3;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("������ �� �� ���Ͻðڽ��ϱ�? ");
		int n = input.nextInt();


		System.out.print(n + "���� ������ ���ʴ�� �Է��Ͻÿ�: ");

		int i;
		double sum = 0.0;
		for(i=0; i<n;i++){
			sum = sum + input.nextInt();
			input.close();
		}

		System.out.println("������ �� = " + sum);
		System.out.printf("��� = %.2f" ,(sum/n));



	}

}
