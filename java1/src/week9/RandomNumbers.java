package week9;

import java.util.*;
/**
 * 10개 짜리 배열을 난수값을 배열에 추가한다.
 * 그후 배열에 있는 값을 출력한다.
 * @author choi0
 *
 */
public class RandomNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] a = new int[20];
		System.out.println("10보다 작은 정수난수:");
		for(int i =0;i<=19;i++) {
			a[i] = (int)(10*(Math.random()));
			System.out.println(a[i]);
		}

		input.close();
	}

}


