package week7;

import java.util.Scanner;

public class Digits {
	public static void main(String[]args) {
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		Scanner number = new Scanner(System.in);
		String n = number.nextLine();
		char n1;
		System.out.println(n.length() + "���� ���ڷ� �̷���� ���ڿ� �Դϴ�.");
		for(int i=0;i<n.length();i++) {
			 n1 = n.charAt(i);
			System.out.print(n1);
			System.out.print(" ");
		}
		number.close();
	}
}
