package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayReturn4 {
	/**
	 * �迭 �� ���� �����
	 * �� ���� �迭�� �̾���� ���迭�� �����.
	 * �� �迭���� ����Ѵ�.
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input1 = new Scanner(new File("data3.txt"));
		Scanner input2 = new Scanner(new File("data4.txt"));

		int [] array1 = new int[input1.nextInt()];
		int [] array2 = new int[input2.nextInt()];
		int [] array3;

		int i = 0;
		while(input1.hasNextInt()) {
			array1[i] = input1.nextInt();
			i++;
		}
		i = 0;
		while(input2.hasNextInt()) {
			array2[i] = input2.nextInt();
			i++;
		}

		array3 = catArray(array1,array2);

		System.out.print("�迭 1:		");
		printArray(array1);
		System.out.print("�迭 2:		");
		printArray(array2);
		System.out.print("����� �迭:	");
		printArray(array3);

		input1.close();
		input2.close();
	}
	/**
	 * �迭 a1�� a2�� ������ �� �迭�� ��ȯ�Ѵ�.
	 * ex
	 * a1 = 1 2 3
	 * a2 = 4 5
	 * a3 = 1 2 3 4 5
	 * @param a1 �迭
	 * @param a2 �迭
	 * @return �� �迭�� ������ �� �迭
	 */
	public static int[] catArray(int[] a1,int[] a2) {
		int[] a3 = new int[a1.length+a2.length];
		for(int i = 0;i<=a1.length-1;i++) {
			a3[i] = a1[i];

		}
		int j = 0;
		for(int i = a1.length;i<=(a1.length+a2.length)-1;i++) {
			a3[i] = a2[j];
			j++;
		}
		return a3;
	}
	/**
	 * �迭�� ���� �� 
	 * �迭�� ���ҵ��� ���ʷ� ����Ѵ�.
	 * @param b1 ����� �迭
	 */
	public static void printArray(int []b1) {
		for(int i = 0;i<=b1.length-1;i++) {
			System.out.print(b1[i]);
			System.out.print("	");
		}
		System.out.println("");
	}

}
