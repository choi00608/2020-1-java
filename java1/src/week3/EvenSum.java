package week3;

import java.util.Scanner;

public class EvenSum {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("������ ������ ¦������ ���� ���մϴ�.");

		System.out.print("���� �� ���� ���� ����? ");
		int lowerBound =input.nextInt();

		System.out.print("���� �� ���� ū ����? ");
		int upperBound =input.nextInt();

		input.close();


		int sum = 0;
		int i;
		for(i=lowerBound;i<upperBound;i++){

			if(i%2==0) {
				sum = sum + i;
			}

		}
		if(upperBound%2==0) {
			sum = sum + upperBound;
		}
		System.out.println(lowerBound + "���� " + upperBound + "������ ¦���� �� = " + sum);
	}
}