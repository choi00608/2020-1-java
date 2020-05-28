package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MatrixMultiplication {
	/**
	 * �� ��� �� �ؽ�Ʈ�� �о ������ �迭�� ���� �����Ѵ�
	 * ������� ������� ���Ѵ�.
	 * �� ��ĵ��� ����Ѵ�.
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input1 = new Scanner(new File("matrix1.txt"));
		Scanner input2 = new Scanner(new File("matrix2.txt"));

		int[][] array1 = new int[3][5];
		int[][] array2 = new int[5][3];
		int[][] array3;

		for(int i = 0;i<=array1.length-1;i++) {
			for(int j = 0;j<=array1[0].length-1;j++) {
				array1[i][j] = input1.nextInt();
			}
		}

		for(int i = 0;i<=array2.length-1;i++) {
			for(int j = 0;j<=array2[0].length-1;j++) {
				array2[i][j] = input2.nextInt();
			}
		}

		array3 = multiply(array1,array1[0].length, array1.length,array2, array2.length );

		System.out.println("A ���");
		printMatrix(array1, array1.length, array1[0].length);
		System.out.println("");
		System.out.println("B ���");
		printMatrix(array2, array2.length, array2[0].length);
		System.out.println("");
		System.out.println("C = AB ���");
		printMatrix(array3, array3.length, array3[0].length);

	}
	/**
	 * �־��� �� ���� ����� ������� ���Ѵ�.
	 * @param a ù���
	 * @param row ù ����� �� ����
	 * @param col ù ����� �� ����
	 * @param b �� ��° ���
	 * @param p �� ���� ����� �� ����
	 * @return
	 */
	public static int[][] multiply(int[][] a, int row, int col, int[][] b, int p){
		int[][] mul = new int [col][b[0].length];

		int temp = 0;
		int val = 0;

		for(int k = 0;k<=col-1;k++) {
			for(int j = 0;j<=b[0].length-1;j++) {
				for(int h = 0;h<=p-1;h++) {
					temp = (a[k][h])*(b[h][j]);
					val = val + temp;
				}
				mul[k][j] = val;
				val = 0;
			}
		}

		return mul;
	}
	/**
	 * �޾Ƶ��� ������ �迭�� ���ʴ�� ����Ѵ�.
	 * @param array ����� �迭
	 * @param col	��
	 * @param row	��
	 */
	public static void printMatrix(int[][]array, int col, int row) {


		for (int i = 0;i<=col-1;i++) {
			for(int j = 0;j<=row-1;j++) {
				System.out.print(array[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}
	}
}
