package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayReturn4 {
	/**
	 * 배열 두 개를 만들고
	 * 두 개의 배열을 이어붙인 새배열을 만든다.
	 * 각 배열들을 출력한다.
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

		System.out.print("배열 1:		");
		printArray(array1);
		System.out.print("배열 2:		");
		printArray(array2);
		System.out.print("연결된 배열:	");
		printArray(array3);

		input1.close();
		input2.close();
	}
	/**
	 * 배열 a1과 a2를 연결한 새 배열을 반환한다.
	 * ex
	 * a1 = 1 2 3
	 * a2 = 4 5
	 * a3 = 1 2 3 4 5
	 * @param a1 배열
	 * @param a2 배열
	 * @return 두 배열을 연결한 새 배열
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
	 * 배열을 받은 후 
	 * 배열의 원소들을 차례로 출력한다.
	 * @param b1 출력할 배열
	 */
	public static void printArray(int []b1) {
		for(int i = 0;i<=b1.length-1;i++) {
			System.out.print(b1[i]);
			System.out.print("	");
		}
		System.out.println("");
	}

}
