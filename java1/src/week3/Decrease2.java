package week3;

import java.util.Scanner;

public class Decrease2 {


	public static void main(String[]args) {

		Scanner input = new Scanner(System.in);
		System.out.print("양의 정수를 하나 입력하시오: ");
		int n = input.nextInt();
		input.close();

		System.out.println("첫번째 방법");

		int i;
		for(i=n;i>=0;i--){

			if(i%10==n%10) {
				if(n!=0) {
					System.out.print("\n");
				}
			}

			System.out.print(i +"\t");

		}

		System.out.print("\n");
		System.out.println("두번째 방법");

		int count = 0;
		for(i=n;i>=0;i--){

			System.out.print(i +"\t");
			count = count + 1;

			if(count==10) {
				System.out.print("\n");
				count = 0;
			}

		}
	}
}
