package week11;

import java.util.Scanner;

public class InsertionSort {
	/**
	 * 삽입정렬 합수를 테스트 한다.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int []numbers = new int[1000];
		int size;
		System.out.print("데이터 갯수를 입력하시오: ");
		size = input.nextInt();
		System.out.print(size + "개의 정수를 입력하시오: ");
		for (int i = 0; i < size; i++)
			numbers[i] = input.nextInt();
		System.out.println();

		sort(numbers, size);

		System.out.print("Sorted: ");

		ArrayUtil.printArray(numbers,size);

		input.close();
	}
	/**
	 * 배열 안에있는 값들을  삽입정렬한다.
	 * @param x 배열
	 * @param i 올바른 위치를 찾아줄 원소
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
	 * 배열 x를 정렬한다.
	 * @param x 배열
	 * @param n 정렬할 원소의 개수
	 */
	public static void sort(int[] x, int n) {	
		for (int i = 1; i < n; i++)
			insert(x, i);
	}
}
