package week3;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("정수를 몇 개 더하시겠습니까? ");
		int n = input.nextInt();


		System.out.print(n + "개의 정수를 차례대로 입력하시오: ");

		int i;
		double sum = 0.0;
		for(i=0; i<n;i++){
			sum = sum + input.nextInt();
			input.close();
		}

		System.out.println("정수의 합 = " + sum);
		System.out.printf("평균 = %.2f" ,(sum/n));



	}

}
