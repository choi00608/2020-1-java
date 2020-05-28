package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayUtil {

	/**
	 * ���ʴ��
	 * integers �ؽ�Ʈ ������ �о 3��5���� ������ �迭�� ����� ����Ѵ�.
	 * 10�� 1���� ������ �迭�� ���� ������ ä�� �� ����Ѵ�.
	 * 3�� 2���� ������ �迭�� ���� ������ ä�� �� ����Ѵ�.
	 * @author choi0
	 *
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("integers15.txt"));
		int table[][] = new int[3][5];
		int table2[][] = new int[1][10];
		int r[][] = new int[2][3];

		for (int i = 0;i<=2;i++) {
			for(int j = 0;j<=4;j++) {
				table[i][j] = input.nextInt();
			}
		}
		for(int k = 0;k<=9;k++) {
			table2[0][k]= (int)(10*(Math.random()));
		}
		printMatrix(table,3,5);
		System.out.println(" ");
		printMatrix(table2,1,10);
		System.out.println(" ");
		r = fillMatrixRandom(r,2,3,5);
		printMatrix(r,2,3);
		System.out.println(" ");
		input.close();
	}
	/**
	 * �־��� ������ �迭�� ���Ҹ� ���ʷ� ����Ѵ�.
	 * @param array	����� �迭�� ����Ű�� ��������
	 * @param rows	����� �迭�� �� ��.
	 * @param cols	����� �迭�� �� ��.
	 */
	public static void printMatrix(int[][]array, int rows, int cols) {


		for (int i = 0;i<=rows-1;i++) {
			for(int j = 0;j<=cols-1;j++) {
				System.out.print(array[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
	/**
	 * �������迭�� ������ ������ ä�� �ִ´�.
	 * @param array2	����� �迭�� ����ų ��������
	 * @param rows	��
	 * @param cols	��
	 * @param randomNumber ������ �ִ밪
	 * @return
	 */
	public static int[][] fillMatrixRandom(int[][]array2, int rows, int cols, int randomNumber) {
		for (int i = 0;i<=rows-1;i++) {
			for(int j = 0;j<=cols-1;j++) {
				array2[i][j] = (int)(randomNumber*(Math.random()));
			}
		}
		return array2;
	}

}

