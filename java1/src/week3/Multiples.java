package week3;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("어떤 수의 배수들을 출력할까요?");

		int n =input.nextInt(); 
		input.close();


		int i;
		for (i = 1; i <= 100; i++) {
			if (i % n == 0) {
				System.out.print(" " +i);
			}
		}



	}

}
