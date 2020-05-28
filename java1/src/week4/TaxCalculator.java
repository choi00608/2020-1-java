package week4;

import java.util.Scanner;
/**
 �ҵ漼�� ��� �� �� �ִ� ���α׷��̴�.
 ex)4600�� * 15.0/100.0 + (8800�� - 4600��) * 24.0/100.0 + (9000�� - 8800��) * 35.0/100.0 = 1768����
 */

public class TaxCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�ҵ���? ���������� �Է��Ͻÿ�.");

		double income = input.nextDouble();

		final double TAX_RATE_LOW = 15.0/100.0;

		final double TAX_RATE_MID = 24.0/100.0;

		final double TAX_RATE_HIGH = 35.0/100.0;

		if(income>8800) { 
			System.out.println("�ҵ漼 = " +((4600*TAX_RATE_LOW)+((8800-4600)*TAX_RATE_MID)+((income-8800)*TAX_RATE_HIGH))+"����");
		}
		else if(income>4600) {
			System.out.println("�ҵ漼 = " +((4600*TAX_RATE_LOW)+((income-4600)*TAX_RATE_MID))+"����");
		}
		else{
			System.out.println("�ҵ漼 = " +(TAX_RATE_LOW*income)+"����");

		}
		input.close();
	}
}