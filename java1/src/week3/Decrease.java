package week3;

import java.util.Scanner;

public class Decrease {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���� ������ �ϳ� �Է��Ͻÿ�: ");
		int n = input.nextInt();

		input.close();

		int i;
		for(i=n;i>=0;i--) {
			System.out.print(i+" ");
		}
	}
}
