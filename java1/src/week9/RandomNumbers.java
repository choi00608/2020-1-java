package week9;

import java.util.*;
/**
 * 10�� ¥�� �迭�� �������� �迭�� �߰��Ѵ�.
 * ���� �迭�� �ִ� ���� ����Ѵ�.
 * @author choi0
 *
 */
public class RandomNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] a = new int[20];
		System.out.println("10���� ���� ��������:");
		for(int i =0;i<=19;i++) {
			a[i] = (int)(10*(Math.random()));
			System.out.println(a[i]);
		}

		input.close();
	}

}


