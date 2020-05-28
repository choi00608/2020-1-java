package week9;

import java.util.Scanner;
/**
 * 10개의 값을 입력받아 배열에 저장한 후 역순으로 출력한다.
 * @author choi0
 *
 */
public class Reverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] a = new int[10];
		System.out.println("정수 10개를 차례로 입력하세요:");
		for(int i =0;i<=9;i++) {
			a[i] = input.nextInt();
		}
		System.out.println("배열을 역순으로 출력:");
		for(int j=a.length - 1;j>=0;j--) {
			System.out.print(a[j] + " ");
		}

		input.close();
	}

}


