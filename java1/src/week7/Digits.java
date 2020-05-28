package week7;

import java.util.Scanner;

public class Digits {
	public static void main(String[]args) {
		System.out.print("숫자를 입력하시오: ");
		Scanner number = new Scanner(System.in);
		String n = number.nextLine();
		char n1;
		System.out.println(n.length() + "개의 글자로 이루어진 문자열 입니다.");
		for(int i=0;i<n.length();i++) {
			 n1 = n.charAt(i);
			System.out.print(n1);
			System.out.print(" ");
		}
		number.close();
	}
}
