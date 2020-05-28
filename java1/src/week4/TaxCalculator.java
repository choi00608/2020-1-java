package week4;

import java.util.Scanner;
/**
 소득세를 계산 할 수 있는 프로그램이다.
 ex)4600만 * 15.0/100.0 + (8800만 - 4600만) * 24.0/100.0 + (9000만 - 8800만) * 35.0/100.0 = 1768만원
 */

public class TaxCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("소득은? 만원단위로 입력하시오.");

		double income = input.nextDouble();

		final double TAX_RATE_LOW = 15.0/100.0;

		final double TAX_RATE_MID = 24.0/100.0;

		final double TAX_RATE_HIGH = 35.0/100.0;

		if(income>8800) { 
			System.out.println("소득세 = " +((4600*TAX_RATE_LOW)+((8800-4600)*TAX_RATE_MID)+((income-8800)*TAX_RATE_HIGH))+"만원");
		}
		else if(income>4600) {
			System.out.println("소득세 = " +((4600*TAX_RATE_LOW)+((income-4600)*TAX_RATE_MID))+"만원");
		}
		else{
			System.out.println("소득세 = " +(TAX_RATE_LOW*income)+"만원");

		}
		input.close();
	}
}