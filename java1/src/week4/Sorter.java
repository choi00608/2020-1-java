package week4;

import java.util.Scanner;
/**
 * 입력한 3 개의 수의 대소관계를 알 수 있는 프로그램
 * 가장 작은 수 부터 순서가 바뀌어서 다시 입력 된다.
 * 3중 if 문을 사용했다.
 */

public class Sorter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("세 개의 정수를 입력하세요: ");

		int i = input.nextInt();
		int j = input.nextInt();
		int k = input.nextInt();
		input.close();
		if(i<j) {
			if(i<k) {
				if(j<k) {
					System.out.println(i+" "+j+" "+k);
				}
				else 
					System.out.println(i+" "+k+" "+j);

			}
		}
		if(j<i) {
			if(j<k) {
				if(i<k) {
					System.out.println(j+" "+i+" "+k);
				}
				else 
					System.out.println(j+" "+k+" "+i);

			}
		}

		if(k<i) {
			if(k<j) {
				if(i<j) {
					System.out.println(k+" "+j+" "+i);
				}
				else 
					System.out.println(k+" "+i+" "+j);

			}
		}
		if(i==k) {
			if(k==j) {

				System.out.println(k+" "+j+" "+i);
			}


		}
	}
}


