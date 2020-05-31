package week11;

import java.util.Scanner;

public class InsertionSort {
	/**
	 * �������� �ռ��� �׽�Ʈ �Ѵ�.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int []numbers = new int[1000];
		int size;
		System.out.print("������ ������ �Է��Ͻÿ�: ");
		size = input.nextInt();
		System.out.print(size + "���� ������ �Է��Ͻÿ�: ");
		for (int i = 0; i < size; i++)
			numbers[i] = input.nextInt();
		System.out.println();

		sort(numbers, size);

		System.out.print("Sorted: ");

		ArrayUtil.printArray(numbers,size);

		input.close();
	}
	/**
	 * �迭 �ȿ��ִ� ������  ���������Ѵ�.
	 * @param x �迭
	 * @param i �ùٸ� ��ġ�� ã���� ����
	 */
	public static void insert (int[] x, int i) {

		int temp = x[i];   		
		int j = i-1;
		while ( j >= 0 && temp <x[j]) { 
			x[j+1] = x[j];
			j--;
		}
		x[j+1]= temp;
	}
	/**
	 * �迭 x�� �����Ѵ�.
	 * @param x �迭
	 * @param n ������ ������ ����
	 */
	public static void sort(int[] x, int n) {	
		for (int i = 1; i < n; i++)
			insert(x, i);
	}
}
