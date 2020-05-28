package week4;

import java.util.Scanner;
/**
 * 양수들의 평균을 구 하는 프로그램이다.
 * 원하는 만큼 숫자를 입력하고, 입력을 마치고 싶을 때 0 이하의 수를 입력하면 
 * 숫자 입력이 끝나고 입력한 숫자들의 평균을 구해준다.
 *
 */

public class Average {

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("양수들의 평균을 구하는 프로그램입니다.");

		System.out.println("입력을 마치려면 0 이하의 수를 입력하시오");

		System.out.print("숫자를 입력하시오: ");
		double n =input.nextDouble();

		int count= 0;
		int positive = 0;

		if(n>0) {
			count++;
			positive = 1;
		}

		double sum = n;


		while(n>0) {
			System.out.print("숫자를 입력하시오: ");
			n =input.nextDouble();
			if(n>0) {
				sum = sum + n;
				count++;
			}
		}
		input.close();

		if(positive==1) {

			double avr = sum/count;

			System.out.printf("평균 = %.2f" ,avr);
		}
		if(positive==0) {
			System.out.println("양수가 하나도 입력되지 않았습니다.");
		}
	}
}

