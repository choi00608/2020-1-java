package week4;

import java.util.Scanner;
/**
 * �Ǽ� �� ���� �޾Ƽ� ����ϴ� ���α׷��̴�.
 * ��Ģ���길 �����ϸ�, 
 * ���ڸ� ���� �Է��ϰ� �����ڸ� �Է��ϸ� ����� �˷��ش�.
 *
 */

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��Ģ ������ �ϴ� ���α׷��Դϴ�.");
		System.out.print("�� ���� ���ʷ� �Է��Ͻÿ�: ");

		double number1 = input.nextDouble();

		double number2 = input.nextDouble();

		System.out.println("�� ���� � ������ �Ͻðڽ��ϱ�?");

		System.out.print("+ - * / �� �ϳ��� �Է� �Ͻÿ�: ");

		String operator = input.next();


		switch(operator) {

		case "+" :
			System.out.println( number1 + "+" + number2 + "=" + (number1+number2));
			System.exit(-1);
		case "-" :
			System.out.println( number1 + "-" + number2 + "=" + (number1-number2));
			System.exit(-1);
		case "*" :
			System.out.println( number1 + "*" + number2 + "=" + (number1*number2));
			System.exit(-1);
		case "/" :
			System.out.println( number1 + "/" + number2 + "=" + (number1/number2));
			System.exit(-1);
		default:
			System.out.println("�������� �ʴ� �����Դϴ�");
			System.exit(-1);

		}
		input.close();
	}

}
