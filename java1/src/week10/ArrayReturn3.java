package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayReturn3 {
	/**
	 * ũ�Ⱑ 10�� �� �迭�� �ؽ�Ʈ�� �о�ͼ� �����.
	 * �� �迭�� ��ģ �� �迭�� �����.
	 * �迭���� ����Ѵ�.
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("data1.txt"));
		Scanner input2 = new Scanner(new File("data2.txt"));

		int l1[] = new int [10];
		int l2[] = new int [10];


		for(int i = 0;i<=9;i++) {
			l1[i] = input.nextInt();
		}
		for(int j = 0;j<=9;j++) {
			l2[j] = input2.nextInt();
		}

		int l3[] =  addArrays(l1,l2);

		System.out.print("�迭 1:	");
		printArray(l1);
		System.out.print("�迭 2:	");
		printArray(l2);
		System.out.print("�迭 ��:	");
		printArray(l3);

	}
	/**
	 * �ؽ�Ʈ�� �о ���� �迭 �� ���� �޾Ƶ��δ�
	 * �� �迭�� ��ģ ���ο� �迭�� �����.
	 * @param a1 data1�� �ؽ�Ʈ
	 * @param a2 data2�� �ؽ�Ʈ
	 * @return �迭 a3
	 */
	public static int[] addArrays(int[] a1,int[] a2) {
		int a3[] = new int[a1.length];
		for(int i = 0;i<=a1.length-1;i++) {
			a3[i] = a1[i] + a2[i];
		}
		return a3;
	}
	/**
	 * �迭�� ���� �� 
	 * �迭�� ���ҵ��� ���ʷ� ����Ѵ�.
	 * @param b1 ����� �迭
	 */
	public static void printArray(int []b1) {
		for(int i = 0;i<=9;i++) {
			System.out.print(b1[i]);
			System.out.print("	");
		}
		System.out.println("");
	}
}
