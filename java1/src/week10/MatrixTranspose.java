package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MatrixTranspose {
	/**
	 * integers15 �ؽ�Ʈ ���Ϸ� ���� ���ڸ� �о 3x5 �������迭�� �����.
	 * ���� ����� ��ġ����� ���Ѵ�.
	 * �� ����� ����Ѵ�.
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("integers15.txt"));

		int[][] array = new int [3][5];
		int[][] transArray;

		for(int i = 0;i<=array.length-1;i++) {
			for(int j = 0;j<=array[0].length-1;j++) {
				array[i][j] = input.nextInt();
			}
		}
		System.out.println("������ ���");
		printMatrix(array,array.length,array[0].length);
		System.out.println("");
		System.out.println("��ġ���");
		transArray = transpose(array,array.length,array[0].length);
		printMatrix(transArray,transArray.length,transArray[0].length);

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
	/**
	 * �о���� ����� �޾Ƶ��δ�
	 * �޾Ƶ��� ����� ��ġ ����� ���Ѵ�.
	 * @param array �޾Ƶ������
	 * @param row	��
	 * @param col	��
	 * @return	��ġ��� 
	 */
	public static int[][] transpose(int[][]array, int row, int col) {

		int [][] a1 = new int [col][row];

		for(int i = 0;i<=col-1;i++) {
			for(int j = 0;j<=row-1;j++) {
				a1[i][j] = array[j][i];
			}
		}
		return a1;
	}
}