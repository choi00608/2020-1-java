package week4;

import java.util.Scanner;
/**
 * 실수 두 개를 받아서 계산하는 프로그램이다.
 * 사칙연산만 가능하며, 
 * 숫자를 먼저 입력하고 연산자를 입력하면 결과를 알려준다.
 *
 */

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("사칙 연산을 하는 프로그램입니다.");
		System.out.print("두 수를 차례로 입력하시오: ");

		double number1 = input.nextDouble();

		double number2 = input.nextDouble();

		System.out.println("두 수에 어떤 연산을 하시겠습니까?");

		System.out.print("+ - * / 중 하나를 입력 하시오: ");

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
			System.out.println("지원하지 않는 연산입니다");
			System.exit(-1);

		}
		input.close();
	}

}
