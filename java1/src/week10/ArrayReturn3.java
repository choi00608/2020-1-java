package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayReturn3 {
	/**
	 * 크기가 10인 두 배열을 텍스트로 읽어와서 만든다.
	 * 두 배열을 합친 새 배열을 만든다.
	 * 배열들을 출력한다.
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

		System.out.print("배열 1:	");
		printArray(l1);
		System.out.print("배열 2:	");
		printArray(l2);
		System.out.print("배열 합:	");
		printArray(l3);

	}
	/**
	 * 텍스트로 읽어서 만든 배열 두 개를 받아들인다
	 * 두 배열을 합친 새로운 배열을 만든다.
	 * @param a1 data1의 텍스트
	 * @param a2 data2의 텍스트
	 * @return 배열 a3
	 */
	public static int[] addArrays(int[] a1,int[] a2) {
		int a3[] = new int[a1.length];
		for(int i = 0;i<=a1.length-1;i++) {
			a3[i] = a1[i] + a2[i];
		}
		return a3;
	}
	/**
	 * 배열을 받은 후 
	 * 배열의 원소들을 차례로 출력한다.
	 * @param b1 출력할 배열
	 */
	public static void printArray(int []b1) {
		for(int i = 0;i<=9;i++) {
			System.out.print(b1[i]);
			System.out.print("	");
		}
		System.out.println("");
	}
}
