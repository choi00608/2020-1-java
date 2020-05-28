package week9;

import java.util.Scanner;

public class ReverseQ {
	/**
	 * 배열값을 Q나q가 입력될때 까지 입력 받는다
	 * 입력된 배열을 역순으로 출력하고 평균값을 출력한다.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] a = new int[100];
		System.out.println("정수를 차례로 입력하세요");
		System.out.println("입력을 마치려면\'q\', 혹은\'Q\'를 입력하시오:");

		int count = 0;
		int n = 0;

		String val;

		int sum = 0;
		while(count == 0) {

			val = input.next();

			if(val.equals("q") || val.equals("Q")) {
				count = 1;
			}
			else{
				a[n] = Integer.parseInt(val);
				sum = sum + a[n];
				n++;
			}

		}
		double m = 0;
		System.out.println("배열을 역순으로 출력:");
		for(int j=n-1;j>=0;j--) {
			System.out.print(a[j] + " ");
			m = m + a[j];
		}
		System.out.println(" ");
		System.out.println("평균값:" + (m/n));
		input.close();
	}

}


