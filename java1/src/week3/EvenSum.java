package week3;

import java.util.Scanner;

public class EvenSum {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("정해진 구간의 짝수들의 합을 구합니다.");

		System.out.print("구간 중 가장 작은 수는? ");
		int lowerBound =input.nextInt();

		System.out.print("구간 중 가장 큰 수는? ");
		int upperBound =input.nextInt();

		input.close();


		int sum = 0;
		int i;
		for(i=lowerBound;i<upperBound;i++){

			if(i%2==0) {
				sum = sum + i;
			}

		}
		if(upperBound%2==0) {
			sum = sum + upperBound;
		}
		System.out.println(lowerBound + "부터 " + upperBound + "까지의 짝수의 합 = " + sum);
	}
}