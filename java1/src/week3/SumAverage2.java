package week3;

import java.util.Scanner;

public class SumAverage2 {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("평균을 구하는 프로그램");

		System.out.println("0 이상 정수를 여러 개 입력하시오.");

		System.out.println("입력을 마치려면 음의 정수를 입력하시오.");
		int n =input.nextInt();

		int count= 0;
		int positive = 0;

		if(n>=0) {
			count++;
			positive = 1;
		}

		int sum = n;

		while(n>=0) {
			n =input.nextInt();
			if(n>=0) {
				sum = sum + n;
				count++;
			}
		}
		input.close();
		System.out.println("입력된 0 이상의 갯수 = " + count);
		if(positive==1) {
			System.out.println("정수의 합 = " + sum);
			double rSum = sum;
			double avr = rSum/count;

			System.out.printf("평균 = %.2f" ,avr);

		}
	}
}
