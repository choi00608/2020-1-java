package week3;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("� ���� ������� ����ұ��?");

		int n =input.nextInt(); 
		input.close();


		int i;
		for (i = 1; i <= 100; i++) {
			if (i % n == 0) {
				System.out.print(" " +i);
			}
		}



	}

}
